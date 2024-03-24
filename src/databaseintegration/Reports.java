/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseintegration;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Edi
 */
public class Reports {

    public void generateTxtReport(List<String> data) {
        //generating TXT file
        try ( FileWriter writer = new FileWriter("report.txt")) {
            for (String line : data) {
                writer.write(line + "\n");
            }
            System.out.println("Txt report generated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void generateCsvReport(List<String[]> data) {
        //generating CSV file
        try ( FileWriter writer = new FileWriter("report.csv")) {
            for (String[] row : data) {
                StringBuilder line = new StringBuilder();
                for (String field : row) {
                    line.append(field).append(",");
                }
                writer.write(line.toString() + "\n");
            }
            System.out.println("CSV report generated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

