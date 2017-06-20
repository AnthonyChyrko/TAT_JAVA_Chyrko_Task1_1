package tasks.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import tasks.messages.Messages;


class Tools {	
	
	boolean checkArgs(String[] args) {		
		if(checkCountArgs(args) && checkArgsIsNumber(args)){			
			return true;
		}else{			
			return false;
		}		
	}
	
	private boolean checkCountArgs(String[] args){
		boolean check = true;
		if(args.length!=2){
			System.out.println(Messages.WRONG_PARAM + Messages.ENTER_2_NUM);			
			System.exit(1);
		}
		return check;
	}
	
	private boolean checkArgsIsNumber(String[] args){		
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
	
	private double[] convertStringToDouble(String[] str){
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
	}
	
	Triangle createTriangle(String[] args){
		double[] doubleArgs = convertStringToDouble(args); 
		Triangle triangle = new Triangle(doubleArgs[0],doubleArgs[1]);
		return triangle;		
	}
	
	 void printResult(double result, String triangleParam) {
		 	System.out.printf("" + triangleParam + " is %.3f \n", result );
		}
}
