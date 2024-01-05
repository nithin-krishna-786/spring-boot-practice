package com.nithin.springbootpractice.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class CopyLinesStartingWithCA {
    public static void main(String[] args) {
        // Specify the paths for File A and File B
        Path sourcePath = Paths.get("src/main/resources/FileA.txt");
        Path destinationPath = Paths.get("src/main/resources/FileB.txt");

        try {
            // Read all lines from File A
            List<String> lines = Files.readAllLines(sourcePath);

            // Filter lines that start with "CA"
            List<String> filteredLines = lines.stream()
                    .filter(line -> line.startsWith("CA"))
                    .collect(Collectors.toList());

            // Write the filtered lines to File B
            Files.write(destinationPath, filteredLines);

            System.out.println("Lines starting with 'CA' copied successfully.");
        } catch (IOException e) {
            System.err.println("Error copying lines: " + e.getMessage());
        }
    }
}

