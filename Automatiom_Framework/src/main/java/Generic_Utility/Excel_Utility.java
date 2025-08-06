package Generic_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Siddhesh Jain
 */
public class Excel_Utility {

	/**
	 * This Method will read String Data from Excel file and return value to the caller
	 * @param sheetName
	 * @param rowIndex
	 * @param columnIndex
	 * @return String
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getStringDataFromExcel(String sheetName,int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException {

		FileInputStream fls = new FileInputStream("./src/test/resources/Test_Data/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fls);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getStringCellValue();
	}
	
	
	/**
	 * This Method will read Boolean Data from Excel file and return value to the caller
	 * @param sheetName
	 * @param rowIndex
	 * @param columnIndex
	 * @return Boolean
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public boolean getBooleanDataFromExcel(String sheetName,int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException {

		FileInputStream fls = new FileInputStream("./src/test/resources/Test_Data/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fls);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getBooleanCellValue();
	}
	
	
	/**
	 * This Method will read Number Data from Excel file and return value to the caller
	 * @param sheetName
	 * @param rowIndex
	 * @param columnIndex
	 * @return Double
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public double getNumberDataFromExcel(String sheetName,int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException {

		FileInputStream fls = new FileInputStream("./src/test/resources/Test_Data/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fls);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getNumericCellValue();
	}
	
	
	/**
	 * This Method will read DateAndTime Data from Excel file and return value to the caller
	 * @param sheetName
	 * @param rowIndex
	 * @param columnIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public Date getDateAndTimeDataFromExcel(String sheetName,int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException {

		FileInputStream fls = new FileInputStream("./src/test/resources/Test_Data/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fls);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getDateCellValue();
	}
	
	
	/**
	 * This Method will read LocalDateTime Data from Excel file and return value to the caller
	 * @param sheetName
	 * @param rowIndex
	 * @param columnIndex
	 * @return LocalDateTime
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public LocalDateTime getLocalDateTimeDataFromExcel(String sheetName,int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException {

		FileInputStream fls = new FileInputStream("./src/test/resources/Test_Data/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fls);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getLocalDateTimeCellValue();
	}
}
