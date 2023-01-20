package org.example.testcases;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.apache.poi.ss.usermodel.CellType.STRING;

public class ExcelTesting {

    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "E:\\Khushboo\\selenium-project\\Employee.xlsx";
        List<Object[]> data = readExcel(filePath);
        for (Object[] row : data) {
            for (Object cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static List<Object[]> readExcel(String filePath) {
        List<Object[]> data = new ArrayList<Object[]>();
        try {
            File file = new File(filePath);
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                List<Object> rowData = new ArrayList<>();
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case NUMERIC:
                            rowData.add(cell.getNumericCellValue());
                            break;

                        case STRING:
                            rowData.add(cell.getStringCellValue());
                            break;
                    }
                }
                data.add(rowData.toArray());
            }
        } catch (EncryptedDocumentException | IOException e) {
            e.printStackTrace();
        }
        return data;
    }

//    @Test
//    public static void readData() throws FileNotFoundException {
//
//        try {
////            FileReader fileReader=new FileReader("Employee Sample Data.xlsx");
//            FileInputStream fileInputStream = new FileInputStream(new File("E:\\Khushboo\\selenium-project\\Employee.xlsx"));
//
//            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
//            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
//            Iterator<Row> iterator = xssfSheet.iterator();
//
//            while (iterator.hasNext()) {
//                Cell cell = (Cell) iterator.next();
//                switch (cell.getCellType()) {
//                    case NUMERIC:
//                        System.out.println(cell.getNumericCellValue() + "t");
//                        break;
//
//                    case STRING:
//                        System.out.println(cell.getStringCellValue() + "t");
//                        break;
//                }
//            }
//            System.out.println("");
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }

}
