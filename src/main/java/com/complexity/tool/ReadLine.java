package com.complexity.tool;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadLine {

	public void readLines(File f) throws IOException {

		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		int numberOfLines = 0;
		String filePath = f.getPath();
		String fileExtension = filePath.substring(filePath.indexOf('.') + 1);
		SizeFactorValues sizeFactorValues = new SizeFactorValues();
		ComplexityConstants complexityConstants = new ComplexityConstants();

		if (fileExtension.equals("java")) {
			System.out.println("This is a java file");
		} else if (fileExtension.equals("cpp")) {
			System.out.println("This is a c++ file");
		}
		int count = 0;
		while ((line = bufferedReader.readLine()) != null) {
			
            if(complexityConstants.isExcludeLine(line)) {
            	continue;
            }
			
			List<String> wordArrayList = Arrays.asList(line.split("\\s+"));
			List<String> dottedList = new ArrayList<String>();
			for (String word : wordArrayList) {
				if(word.contains(".")) {
					dottedList = Arrays.asList(word.split("\\."));
				}			
				count += sizeFactorValues.complexitySizeFactorValues(word, fileExtension);
				
			}
			for (String word : dottedList) {
				count += sizeFactorValues.complexitySizeFactorValues(word, fileExtension);
				
			}
		
			numberOfLines++;
		}
		System.out.println("Total count " + count);
		System.out.println("Number of Lines " + numberOfLines);
	}

}
