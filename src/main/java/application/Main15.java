package application;

import entities.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = "data.txt";

        try (BufferedReader fileReader = new BufferedReader(new FileReader(path))) {
            Map<String, Integer> voteCounts = new HashMap();

            String currentLine = fileReader.readLine();
            while (currentLine != null) {
                Candidate candidateData = extractDataFromLine(currentLine);
                String candidateName = candidateData.getName();
                int candidateVotes = candidateData.getVotes();

                voteCounts.put(candidateName, voteCounts.getOrDefault(candidateName, 0) + candidateVotes);

                currentLine = fileReader.readLine();
            }

            for (Map.Entry<String, Integer> entry : voteCounts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static Candidate extractDataFromLine(String line) {
        String[] fields = line.split(",");

        return new Candidate(fields[0], Integer.parseInt(fields[1]));
    }
}
