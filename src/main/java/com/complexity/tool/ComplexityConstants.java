package com.complexity.tool;

public class ComplexityConstants {

	public static String ARITHMETIC_OPERATORS[] = {"+", "-", "*", "/", "%", "++", "--"}; 
	public static String RELATIONAL_OPERATORS[] = {"==", "!=", ">", "<", ">=", "<="};
	public static String LOGICAL_OPERATORS[] = {"&&", "||", "!"};
	public static String BITWISE_OPERATORS[] = {"|", "^", "~", "<<", ">>", ">>>", "<<<"};
	public static String MISCELLEANEOUS_OPERATORS[] = {",", "->", ".", "::"};
	public static String ASSIGNMENT_OPERATORS[] = {"+=", "-=", "*=", "/=", "=", ">>>=", "|=", "&=", "%=", "<<=", ">>=", "^="}; 
	public static String KEY_WORDS[] = {"void", "double", "int", "long","float", "string", "String","printf", "println", "cout", "cin", "if", "for", "while", "do-while", "switch", "case"};
	public static String MANIPULATORS[] = {"endl", "\n"}; 
	public static String SPECIAL_KEYWORDS[] = {"new", "delete", "throws", "throw"};
	public static String REFERENCE = "&";
	public static String DEREFERENCE = "*";
	
	public static String NON_VALUE_VAR[] = {"public", "static", "class", "return","else","try"};
    public static String EXTRACT_VAR[] = {"{", "}","(", ")", "[", "]", ";"};
	
	public Boolean isArithmetic(String constant) {
		for(String operator : ARITHMETIC_OPERATORS) {
			if(operator.equals(constant)) {
				return true;
			}
		}
		return false;
	}
	public Boolean isRelational(String constant) {
		for(String operator : RELATIONAL_OPERATORS) {
			if(operator.equals(constant)) {
				return true;
			}
		}
		return false;
	}
	public Boolean isLogical(String constant) {
		for(String operator : LOGICAL_OPERATORS) {
			if(operator.equals(constant)) {
				return true;
			}
		}
		return false;
	}
	public Boolean isBitwise(String constant) {
		for(String operator : BITWISE_OPERATORS) {
			if(operator.equals(constant)) {
				return true;
			}
		}
		return false;
	}
	public Boolean isMiscelleaneous(String constant) {
		for(String operator : MISCELLEANEOUS_OPERATORS) {
			if(operator.equals(constant)) {
				return true;
			}
		}
		return false;
	}
	public Boolean isAssignment(String constant) {
		for(String operator : ASSIGNMENT_OPERATORS) {
			if(operator.equals(constant)) {
				return true;
			}
		}
		return false;
	}
	public Boolean isKeyword(String constant) {
		for(String operator : KEY_WORDS) {
			if(operator.equals(constant)) {
				return true;
			}
		}
		return false;
	}
	public Boolean isManipulator(String constant) {
		for(String operator : MANIPULATORS) {
			if(operator.equals(constant)) {
				return true;
			}
		}
		return false;
	}
	public Boolean isSpecialKeyword(String constant) {
		for(String operator : SPECIAL_KEYWORDS) {
			if(operator.equals(constant)) {
				return true;
			}
		}
		return false;
	}
	public Boolean isRefernce(String constant) {
		if(constant.contains(REFERENCE)) {
			return true;
		}
		return false;
	}
	public Boolean isDereference(String constant) {
		if(constant.contains(DEREFERENCE)) {
			return true;
		}
		return false;
	}
	public Boolean isNonValueOperator(String constant) {
		for(String operator : NON_VALUE_VAR) {
			if(operator.equals(constant)) {
				return true;
			}
		}
		return false;
	}
	
	public String extractOperator(String word) {
		
		if(word == null) {
			return null;
		}
		for(String operator : EXTRACT_VAR) {
			if(word.contains(operator)) {
				return operator;
			}
		}
		return null;
	}
	
	
}
