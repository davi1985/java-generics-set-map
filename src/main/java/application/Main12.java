package application;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> logs = new HashSet<>();

            String line = reader.readLine();
            while (line != null) {
                logs.add(parseLogEntry(line));

                line = reader.readLine();
            }

            System.out.println("Total users: " + logs.size());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static LogEntry parseLogEntry(String line) {
        String[] fields = line.split(" ");

        return new LogEntry(fields[0], Date.from(Instant.parse(fields[1])));
    }
}
