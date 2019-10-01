package edu.vtc.oop.bmoreinis;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.FileWriter;



public class CompressFile {
	
	/**
	 * VTC Java OOP
	 * Exercise 4.1:  Implement a "stand-alone" procedure to read in a file containing words and white space and produce 
	 * a compressed version of the file in an output file. The compressed version should contain all of the words in
	 * the input file and none of the white space, except that it should preserve lines.
	 * 
	 * @author Bram
	 */
	
	public static void main(String[] args) throws IOException, FileNotFoundException {
		String filePath = "/Users/bram/Desktop/Java/OOP/edu/vtc/oop/bmoreinis/testfile";
		try {
			compressFile(filePath);
			System.out.println("Compressed version located at "+filePath+"-compressed");
		}
		catch (FileNotFoundException e) {
			System.out.println("No file found at "+filePath);
		}
		catch (IOException e) {
			System.out.println("File at "+filePath+" cannot be read.");
		}
	}
	
	 /**
     * Load un-encrypted characters from file, return compressed version (no spaces, but preserved lines)
     * @param   [select file]
     * @return  file version
     */
	
	 public static void compressFile(String filePath) throws IOException {
		Scanner s = new Scanner(new File("filePath"));
		ArrayList<String> lines = new ArrayList<String>();
		while (s.hasNext()){
		     lines.add(s.next());
		}
		s.close();
		String[] fileTextArray = lines.toArray(new String[lines.size()]);
		for (int i=0;i<fileTextArray.length;i++) {
			fileTextArray[i].replaceAll(" ","");
		}

		String newFilePath = filePath+"-compressed";
		try {
			FileWriter writer = new FileWriter(newFilePath); 
			for(String str: lines) {
				writer.write(str + System.lineSeparator());
				}
			writer.close();
			} catch (IOException e) {
				System.err.format("IOException: %s%n", e);
			}
	 }
	 
}
