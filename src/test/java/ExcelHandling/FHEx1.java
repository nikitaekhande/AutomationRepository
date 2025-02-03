package ExcelHandling;

import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;

public class FHEx1 {
    public static void main(String args[]) {
        System.out.println("Start program");
        try {
            FileInputStream fis = new FileInputStream("C://Users//ekhan//IdeaProjects//actitime-automation//src//test//resources//ExcelFileData//TestData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            int totalsheets = wb.getNumberOfSheets();
            System.out.println("total number of sheet:" + totalsheets);
            String sheetName = wb.getSheetName(0);
            System.out.println("Name of the sheets:" + sheetName);
            System.out.println("--------------------------------------");
            Sheet s= wb.getSheet("Sheet1");
            int lastRowNum = s.getLastRowNum();
            System.out.println("lastRowNum : " + lastRowNum);
            int physicalNumberOfRows = s.getPhysicalNumberOfRows();
            System.out.println("physicalNumberOfRows : " + physicalNumberOfRows);
            Row r =s.getRow(1);
            int lastcellnum = r.getLastCellNum();
            System.out.println("lastCellNum :"+lastcellnum);
            int physicalNumberOfCells = r.getPhysicalNumberOfCells();
            System.out.println("physicalNumberOfCell:" +physicalNumberOfCells);
            Cell c = r.getCell(1);      //only particular cell number '0'
            String value = c.getStringCellValue();
            System.out.println(value);


            int lastcellnum1 = r.getLastCellNum();

            //println all cell data
            for (int i =0;i<lastcellnum1;i++);
            {
                int i = 0;
                Cell C =r.getCell(i);
                String value2= c.getStringCellValue();
                System.out.println(value2);
            }


        }


      catch(Exception e)
            {
                e.printStackTrace();

            }

        }
    }



