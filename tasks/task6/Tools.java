package tasks.task6;

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
					System.exit(1);
				}			
			}		
			return result;
		}else {
			return null;
		}	
	}
	 
	public double max(String[] args){	
		 if(checkArgs(args)){
			double[] doubleArgs = convertStringToDouble(args);
			double num1 = doubleArgs[0];
			double num2 = doubleArgs[1];
			double num3 = doubleArgs[2];
			double max = num1 > num2 ? num1 : num2;
			double result = num3 > max ? num3 : max;
			return result;
		 }else {
				return 0;
			}	
		}
		
	public double min(String[] args){	
			if(checkArgs(args)){
				double[] doubleArgs = convertStringToDouble(args);
				double num1 = doubleArgs[0];
				double num2 = doubleArgs[1];
				double num3 = doubleArgs[2];
				double min = num1 < num2 ? num1 : num2;
				double result = num3 < min ? num3 : min;
				return result;
			 }else {
					return 0;
			}
		}
	
		 void printResult(double result, String triangleParam) {
			 System.out.printf("" + triangleParam + " is %.3f \n", result );
		}
}
