package com.nithin.springbootpractice.filehandling;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReadFromFileUsingScanner {
    public static void main(String[] args) throws Exception
    {
        File file = new File("src/main/resources/input.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine())
        {
        	String line = sc.nextLine();
        	StringTokenizer st = new StringTokenizer(line," ");
        	System.out.println(st.countTokens());
        }
        
        String input1 = "Hello  World";
        String[] words1 = input1.split("\\s");
        
        System.out.println("Words separated by single whitespace:");
        for (String word : words1) {
            System.out.println(word);
        }

        // Example for \\s+ (one or more whitespace characters)
        String input2 = "   Java   Regular   Expressions   ";
        String[] words2 = input2.split("\\s+");

        System.out.println("\nWords separated by one or more whitespaces:");
        for (String word : words2) {
            System.out.println(word);
        }
        
    }
}
