package org.example.testcases;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    public static void main(String[] args) throws IOException {
        writeExcel();
    }

    @Test
    public static void writeExcel() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Test.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        XSSFSheet sheet = workbook.getSheetAt(0);
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);

        for(Cell row1:row) {
            row1.setCellType(CellType.STRING);
            row1.setCellValue("name");

        }

        FileOutputStream fos = new FileOutputStream("D:\\Test.xlsx");
        workbook.write(fos);
        fos.close();
        System.out.println("END OF WRITING DATA IN EXCEL");
    }
}

