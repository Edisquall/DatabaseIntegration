/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databaseintegration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Edi
 */
public class DatabaseIntegration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ALL data that are required on the table were added through MySql

        Reports reports = new Reports();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("------- Menu -------");
            System.out.println("1. Generate TXT Report");
            System.out.println("2. Generate CSV Report");
            System.out.println("3. Generate Console Report");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    List<String> txtData = fetchDataForTxtReport(); 
                    reports.generateTxtReport(txtData);
                    break;
                case 2:
                    List<String[]> csvData = fetchDataForCsvReport(); 
                    reports.generateCsvReport(csvData);
                    break;
                case 3:
                    List<String> consoleData = fetchDataForConsoleReport(); 
                    reports.generateConsoleReport(consoleData);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-4).");
            }
        }
    }
// Methods to fetch data for different types of reports (replace with actual data retrieval logic)




    private static List<String> fetchDataForTxtReport() {
        List<String> data = new ArrayList<>();
        data.add("Sample data for TXT report");
        return data;
    }

    private static List<String[]> fetchDataForCsvReport() {
        List<String[]> data = new ArrayList<>();
        data.add(new String[]{"Field1", "Field2", "Field3"});
        data.add(new String[]{"Value1", "Value2", "Value3"});
        return data;
    }

    private static List<String> fetchDataForConsoleReport() {
        List<String> data = new ArrayList<>();
        data.add("Sample data for console report");
        return data;
    }
}
