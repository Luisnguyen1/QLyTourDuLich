/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excel;

import au.com.bytecode.opencsv.CSVWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author PC
 */
public class ExportCSV {

    /*private final String url = "jdbc:mysql://localhost:3306/qltour?useUnicode=yes&characterEncoding=UTF-8&useSSL=false&allowPublicKeyRetrieval=true";
    private final String user = "root";
    private final String password = "";
    
    public void exportNhanVien() throws IOException {
    
    String fileName = "/nhanvien.csv";
    Path myPath = Paths.get(fileName);
    
    try (var con = DriverManager.getConnection(url, user, password);
    var pst = con.prepareStatement("SELECT * FROM nhanvien");
    var rs = pst.executeQuery()) {
    
    try (var writer = new CSVWriter(Files.newBufferedWriter(myPath,
    StandardCharsets.UTF_8), CSVWriter.DEFAULT_SEPARATOR,
    CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.NO_ESCAPE_CHARACTER,
    CSVWriter.DEFAULT_LINE_END)) {
    
    writer.writeAll(rs, true);
    }
    
    } catch (SQLException | IOException ex) {
    Logger.getLogger(ExportCSV.class.getName()).log(
    Level.SEVERE, ex.getMessage(), ex);
    }
    }*/
    
    public static void main(String[] args) throws IOException{
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Java Books");
         
        Object[][] bookData = {
                {"Head First Java", "Kathy Serria", 79},
                {"Effective Java", "Joshua Bloch", 36},
                {"Clean Code", "Robert martin", 42},
                {"Thinking in Java", "Bruce Eckel", 35},
        };
 
        int rowCount = 0;
         
        for (Object[] aBook : bookData) {
            Row row = sheet.createRow(++rowCount);
             
            int columnCount = 0;
             
            for (Object field : aBook) {
                Cell cell = row.createCell(++columnCount);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
             
        }
         
         
        try (FileOutputStream outputStream = new FileOutputStream("JavaBooks.xlsx")) {
            workbook.write(outputStream);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExportCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
