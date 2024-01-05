package com.nithin.springbootpractice.service;

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
    }
}
