package com.complexity.tool;

import java.util.ArrayList;
import java.util.List;

public class SizeFactorValues {

	ComplexityConstants complexityConstants = null;

	public SizeFactorValues() {
		complexityConstants = new ComplexityConstants();
	}

	public int complexityConstantValues(String constant, String fileType) {

		if (complexityConstants.isArithmetic(constant)) {
			return 1;
		} else if (complexityConstants.isRelational(constant)) {
			return 1;
		} else if (complexityConstants.isLogical(constant)) {
			return 1;
		} else if (complexityConstants.isBitwise(constant)) {
			return 1;
		} else if (complexityConstants.isMiscelleaneous(constant)) {
			return 1;
		} else if (complexityConstants.isAssignment(constant)) {
			return 1;
		} else if (complexityConstants.isKeyword(constant)) {
			return 1;
		} else if (complexityConstants.isManipulator(constant)) {
			return 1;
		} else if (complexityConstants.isSpecialKeyword(constant)) {
			return 2;
		} else if (complexityConstants.isRefernce(constant)) {
			return 2;
		} else if (complexityConstants.isDereference(constant) && (!fileType.equals("cpp"))) {
			return 2;
		} 
		else {
			return 1;
		}

	}

	public int complexitySizeFactorValues(String word, String fileType) {

		if (word.isEmpty()) {
			return 0;
		}
		List<String> extractedWordArrList = extractVariable(word);

		if (extractedWordArrList == null) {
			return 0;
		}
		
		int cost = 0;
		for (String extractedWord : extractedWordArrList) {

			cost += complexityConstantValues(extractedWord, fileType);

		}
		return cost;

	}

	public List<String> extractVariable(String word) {

		List<String> splittedWordArrList = new ArrayList<String>();

		splittedWordArrList.add(extractByKeyword(word));
		
		return splittedWordArrList;
	}

	public String extractByKeyword(String word) {

		String extractedOperator = complexityConstants.extractOperator(word);

		if (extractedOperator == null) {
			return word;
		}

		for (String splittedWord : word.split("\\"+extractedOperator)) {
			return extractByKeyword(splittedWord);
		}
		
		return word;

	}

}
