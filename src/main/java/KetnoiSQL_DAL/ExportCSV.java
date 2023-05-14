/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KetnoiSQL_DAL;

import au.com.bytecode.opencsv.CSVWriter;
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

/**
 *
 * @author PC
 */
public class ExportCSV {

    private final String url = "jdbc:mysql://localhost:3306/qltour?useUnicode=yes&characterEncoding=UTF-8&useSSL=false&allowPublicKeyRetrieval=true";
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
    }
    }
