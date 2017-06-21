package tasks.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import tasks.messages.Messages;


public class Tools {	
	
	public boolean checkArgs(String[] args) {		
		if(checkCountArgs(args) && checkArgsIsNumber(args)){			
			return true;
		}else{			
			return false;
		}		
	}
	
	public boolean checkCountArgs(String[] args){
		boolean check = true;
		if(args.length!=3){
			System.out.println(Messages.WRONG_PARAM + Messages.ENTER_3_NUM);			
		}
		return check;
	}
	
	public boolean checkArgsIsNumber(String[] args){		
		String regexp = "-?\\d+\\.*\\d*";
		Pattern p = Pattern.compile(regexp);
		Matcher m; 
		for (int i = 0; i < args.length; i++) {		
			m = p.matcher(args[i]);
			if(!m.matches()){				
				return false;
			}				
		}		
		return true;		
	}
	
	public double[] convertStringToDouble(String[] str){
		if(checkArgs(str)){
			double[] result = new double[str.length];
			for (int i = 0; i < str.length; i++) {
				try{
					result[i] = Double.valueOf(str[i]);				
				}catch (NumberFormatException nfe) {
					System.out.println(Messages.WRONG_PARAM + Messages.ENTER_DIGITS);			
					System.exit(1);
				}			
			}		
			return result;
		}else {
			return null;
		}	
	}
	
	 public double[][] performCalc(String[] args) {
		 if(checkArgs(args)){
			double[] input = convertStringToDouble(args);
			double[] output = new double[input.length];		
			double tmp;
			for (int i = 0; i < input.length; i++) {	
				tmp = input[i];
				if(isPositive(tmp)){
					output[i] = Math.pow(tmp, 2);				
				}else{
					output[i] = Math.pow(tmp, 4);
				}
			}	
			double[][] result = combineIO(input, output);
			return result;
		}else {
			return null;
		}
	}	
	 
	 private double[][] combineIO(double[] input, double[] output){
		double[][] result = new double[input.length][2]; 
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < 2; j++) {
				if(j % 2 == 0){
					result[i][j] = input[i];
				}else{
					result[i][j] = output[i];
				}				
			}
		}
		return result;		 
	 }
	 
	 boolean isPositive(double num){		
			boolean result = num > 0 ? true : false;
			return result;			
		}
	
	 void printResult(double[][] result) {
		 System.out.println("   X    Y");
		 for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < 2; j++) {
				if(j % 2 == 0){
					System.out.printf(" %.3f ",result[i][j]);
				}else{
					System.out.printf(" %.3f ",result[i][j]);
				}				
			}
			System.out.println("\n");
		}	 
	 }	
}
