package amezon;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet {
	public static void main(String args[] ) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Shivkumar\\Desktop\\Interview shedule 2023.xlsx");
		Sheet deta=WorkbookFactory.create(file).getSheet("sheet1");
		
		int row=deta.getLastRowNum();
		System.out.println(row);
		
	   int col=deta.getRow(0).getLastCellNum();
	   System.out.println(col);
//	   for(int i=0; i<=row; i++)
//	   {
//		   for(int j=1; j<col; j++)
//		   {
//			   String excelsheet=deta.getRow(i).getCell(j).toString();
//			   
//				System.out.print(" |"+ excelsheet );		
//		   }
//		   System.out.println();
//
//	   }	
	   
	   for(int i=0; i<col; i++) {
		  String s=deta.getRow(1).getCell(i).toString();
		  System.out.print("|"+s);
	   }
	   System.out.println();
	}

}
