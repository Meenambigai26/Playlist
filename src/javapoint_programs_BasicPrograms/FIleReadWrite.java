package javapoint_programs_BasicPrograms;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class FIleReadWrite {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\manoj\\eclipse-workspace2\\Java_Programs\\files\\file_writeinto.docx";
		FileWriter file = new FileWriter(path);
		file.write("hello world");
		System.out.println("write success");
		
		String path2 = "C:\\Users\\manoj\\eclipse-workspace2\\Java_Programs\\files\\readinto.docx";
		BufferedReader readfrom = new BufferedReader(path2);
		String line = readfrom.read();
	}

}
