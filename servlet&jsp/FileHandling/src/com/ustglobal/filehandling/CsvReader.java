package com.ustglobal.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CsvReader {
	public static void main(String[] args) {
		
		try(FileReader in = new FileReader("csv.txt");
			BufferedReader reader = new BufferedReader(in)) {
			while(reader.ready()) {
//				System.out.println(reader.readLine());
				String line = reader.readLine();
				String[] words = line.split(",");
				System.out.println("ID: "+words[0]);
				System.out.println("Name: "+words[1]);
				System.out.println("Salary: "+words[2]);
				System.out.println("Gender: "+words[3]);
				System.out.println("*************");
				
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
  }

}
