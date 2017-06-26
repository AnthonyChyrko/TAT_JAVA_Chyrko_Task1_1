package tasks.task2;

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
			return false;
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
				}			
			}		
			return result;	
		}else {
			return null;	
			}
	}

	public double performCalc(String[] args) {
		if(checkArgs(args)){
			double[] tmp = convertStringToDouble(args);				
			double a = tmp[0];
			double b = tmp[1];
			double c = tmp[2];
			if (a == 0 || b == 0) {
				 throw new IllegalArgumentException("The parameters 'a' and 'b' should not be zero");	        
			 }
			if ((b * b + 4 * a * c) < 0){
				 throw new ArithmeticException("The expression under the root can not be less than zero");
			 }
			Double result;
			result = ((b+Math.sqrt(Math.pow(b, 2)+4*a*c))/2/a)-(Math.pow(a, 3)*c)+(Math.pow(b, -2));
			return result;	
		}else{
			return 0;
		}	
	}

	 void printResult(double result) {		
		System.out.printf("Result is %.3f", result);
		
	}
}
