/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excel;

import DTo.NhanVien;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;

/**
 *
 * @author PC
 */
public class ExportExcel {

    private static CellStyle cellStyleFormatNumber = null;

    public void ExportNhanVien(ArrayList<NhanVien> array, String nameSheet) throws Exception {
        XSSFWorkbook workbook = new XSSFWorkbook(nameSheet + ".xlsx");
        XSSFSheet sheet = workbook.createSheet();

        int COLUMN_INDEX_ID = 0;
        int COLUMN_INDEX_TITLE = 1;
        int COLUMN_INDEX_PRICE = 2;
        int COLUMN_INDEX_QUANTITY = 3;
        int COLUMN_INDEX_TOTAL = 4;

        int rowIndex = 0;

        // Write header
        writeHeader(sheet, rowIndex);

        // Write data
        rowIndex++;
        for (Book book : books) {
            // Create row
            Row row = sheet.createRow(rowIndex);
            // Write data on row
            writeBook(book, row);
            rowIndex++;
        }
    }
}
