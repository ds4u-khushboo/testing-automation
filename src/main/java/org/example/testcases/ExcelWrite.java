package org.example.testcases;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class ExcelWrite {
    public static void main(String[] args) throws IOException {
        excelWrite();
        System.out.println("END OF WRITING DATA IN EXCEL");

    }

    public static void excelWrite() throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet spreadsheet = workbook.createSheet(" Student Data ");
        XSSFRow row;
        HashMap<String, Object[]> studentData = new HashMap<>();

        studentData.put("1", new Object[]{"Roll No", "NAME", "Year","subject"});
        studentData.put("2", new Object[]{"128", "Aditya", "2nd year","MATHS"});
        studentData.put("3", new Object[]{"129", "Narayana", "2nd year","SCIENCE"});
        studentData.put("4", new Object[]{"130", "Mohan", "2nd year","SST"});
        studentData.put("5", new Object[]{"131", "seema", "2nd year","JAVA"});
        studentData.put("6", new Object[]{"132", "fogat", "2nd year","REACT"});
        Set<String> keyid = studentData.keySet();
        int rowid = 0;
        for (String key : keyid) {
            row = spreadsheet.createRow(rowid++);
            Object[] objectArr = studentData.get(key);
            int cellid = 0;

            for (Object obj : objectArr) {
                Cell cell = row.createCell(cellid++);
                cell.setCellValue((String) obj);
            }
        }
        FileOutputStream out = new FileOutputStream(new File("D:\\Data.xlsx"));
        workbook.write(out);
        out.close();

    }
}



