package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data
{  
	public static void excelsheetdata() throws EncryptedDocumentException, IOException
{
	File path=new File("C:\\Users\\Aayush Computers\\Desktop\\Excel.xlsx");
   FileInputStream path1=new FileInputStream("C:\\Users\\Aayush Computers\\Desktop\\Excel.xlsx");
   String sheet =WorkbookFactory.create(path1).getSheet("Sheet1").getRow(3).getCell(3).getStringCellValue();
   System.out.println(sheet);
}

}

//punjikasthala