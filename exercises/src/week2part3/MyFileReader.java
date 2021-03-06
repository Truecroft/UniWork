package week2part3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileReader {
	
	public MyFileReader() {
		
	}

	public static void main(String[] args) throws BadLineException, IOException {
		File file = new File("D:\\Degree\\OOP\\UniWork\\exercises\\src\\week2part3\\TestReadFile");
		File file2 = new File ("D:\\Degree\\OOP\\UniWork\\exercises\\src\\week2part3\\TestWriteFile");
		File file3 = new File ("D:\\Degree\\OOP\\UniWork\\exercises\\src\\week2part3\\readMyFile");
		readAndPrint(file);
		writeMyFile(file2);
		readMyFile(file3);
	}
	
	public static void readAndPrint(File file) {
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) { System.out.println(line); }
			bufferedReader.close();
		} 
			catch (FileNotFoundException e) { System.out.println("Cannot find file: " + file.toString()); } 
			catch (IOException e) { System.out.println("Cannot read file: " + file.toString()); }		
	}
	
	public static void writeMyFile(File file2) {		
		try {
			FileWriter fileWrite = new FileWriter(file2);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWrite);
			for (int i=0; i<=100; i++) { bufferedWriter.append(String.valueOf(i)).append("\n"); }
			bufferedWriter.close();
		} 
			catch (IOException e) {	System.out.println("Could not write to file: " + file2.toString());	}
	}
	
	public static void readMyFile(File file) throws BadLineException, IOException {
			FileReader fileReader = new FileReader(file);
		try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				if (!line.startsWith("This is line: ")) {
					throw new BadLineException("The line: " + line + " does not start with 'This is line: '");
				} else {
					System.out.println(line);
				}
			}
		}
	}
}
