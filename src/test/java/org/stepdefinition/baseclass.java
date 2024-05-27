package org.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public  class baseclass {
	public static WebDriver driver;
	public static WebElement element;
	
	// 1 To Launch the Browser
	public static  void launchbrowser(String browsertype) {
		if(browsertype.equals("chrome")){
			driver = new ChromeDriver();
			System.out.println("Chrome Browser Launch");
		}
		else if (browsertype.equals("edge")) {
			driver= new EdgeDriver();
			System.out.println("Edge Browser launch");
			
		}
		else {
			driver= new FirefoxDriver();
			System.out.println("Firefox Browser launch");
		}

	}
	
	// 2 To Get the URL
	public static void launchurl(String url) {
		driver.get(url);

	}
	
	 //3  To Maximize the Browser
	public static void maximize() {
		driver.manage().window().maximize();

	}
	
	// 4 To send the value by Sendkeys
	public static void sendvalue(WebElement element, String value) {
		element.sendKeys(value);
        }
	public static void clean(WebElement elememt) {
		element.clear();
		

	}
	
	public static String getattributeValue(WebElement element, String value) {
		return element.getAttribute(value);
		

	}
	
	
	// 5  To Click
	public static void clickable(WebElement element) {
		element.click();

	}
	public static void applywaitsToAllElements() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	//Read Data From Excel
	
/*	public static String readDataFromExcel(String filename, String sheetName, int rowNo, int cellNo) throws IOException {
		// File Operator
		File f = new File("C:\\Users\\Maddy\\eclipse-workspace\\Adactin\\Excel\\"+filename+".xlsx");
		
		// To read the file
		FileInputStream fi = new FileInputStream(f);
		 	
		// T create object creation
		Workbook book = new XSSFWorkbook(fi);
		
		
	Sheet sh = book.getSheet(sheetName);
	Row r = sh.getRow(rowNo);
	
	Cell c = r.getCell(cellNo);
	 CellType type = c.getCellType();
	 
	String name;
	 
	if (type ==1) {
		 name = c.getStringCellValue();
	}
		
	 else if (DateUtil.isCellDateFormatted(c)) {
		Date da = c.getDateCellValue();
		SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
		name = s.format(da);
	}
	else {
		// double numericValue = Double.parseDouble(l);
		double d = c.getNumericCellValue();
		long l =(long)d;
		 
		 name = String.valueOf(l);
		 return name;
	}
	return name;
	
	
	
	}

 *  DataFormatter dataFormatter = new DataFormatter();
           String stringValue = dataFormatter.formatCellValue(c);

		 double numericValue = Double.parseDouble(stringValue);
		 long l =(long)numericValue;*/
 
 public static String readData(String filename, String sheetName, int rowNo, int cellNo) throws IOException {

		    File file = new File("C:\\Users\\Maddy\\eclipse-workspace\\Adactin\\Excel\\" + filename + ".xlsx");
		    String name = null;

		    try (FileInputStream fis = new FileInputStream(file);
		         Workbook workbook = new XSSFWorkbook(fis)) {

		        Sheet sheet = workbook.getSheet(sheetName);
		        if (sheet != null) {
		            Row row = sheet.getRow(rowNo);
		            if (row != null) {
		                Cell cell = row.getCell(cellNo);
		                if (cell != null) {
		                    switch (cell.getCellType()) {
		                        case STRING:
		                            name = cell.getStringCellValue();
		                            break;
		                        case NUMERIC:
		                            if (DateUtil.isCellDateFormatted(cell)) {
		                                Date date = cell.getDateCellValue();
		                                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		                                name = sdf.format(date);
		                            } else {
		                                double numericValue = cell.getNumericCellValue();
		                                long longValue = (long) numericValue;
		                                name = String.valueOf(longValue);
		                            }
		                            break;
		                        default:
		                            // Handle other cell types if needed
		                            break;
		                    }
		                }
		            }
		        }
		    }
		    return name;
		}

 //  create cell in excel
 public static void createcell(String filename, String sheetname, int newRow, int newcell, String value)
			throws IOException { 
	 //C:\Users\Maddy\eclipse-workspace\Adactin\Excel\Adactinhotel.xlsx
		File f = new File("C:\\Users\\Maddy\\eclipse-workspace\\Adactin\\Excel\\" + filename + ".xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet(sheetname);
		Row r = s.getRow(newRow);
		Cell c = r.createCell(newcell);
		c.setCellValue(value);
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
		System.out.println("done");

}
 
 // if above cell is not working use this update create cell 
 public static void createCellOnly(String filename, String sheetname, int newRow, int newCell, String value) {
	    try (FileInputStream fi = new FileInputStream(new File("C:\\Users\\Maddy\\eclipse-workspace\\MavSampleProject\\ExcelFiles\\" + filename + ".xlsx"))) {
	        Workbook w = new XSSFWorkbook(fi);
	        Sheet s = w.getSheet(sheetname);
	        
	        if (s != null) {
	            Row r = s.getRow(newRow);
	            if (r == null) {
	                r = s.createRow(newRow);
	            }
	            Cell c = r.createCell(newCell);
	            c.setCellValue(value);
	        } else {
	            System.err.println("Sheet " + sheetname + " does not exist.");
	        }
	        
	        try (FileOutputStream fo = new FileOutputStream(new File("C:\\Users\\Maddy\\eclipse-workspace\\MavSampleProject\\ExcelFiles\\" + filename + ".xlsx"))) {
	            w.write(fo);
	            System.out.println("Cell created successfully.");
	        } catch (IOException e) {
	            System.err.println("Error writing to file: " + e.getMessage());
	        }
	    } catch (IOException e) {
	        System.err.println("Error opening workbook: " + e.getMessage());
	    }
	}
}