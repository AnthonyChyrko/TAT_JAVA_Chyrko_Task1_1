package tasks.task2;

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
		if(args.length!=3){
			System.out.println(Messages.WRONG_PARAM + Messages.ENTER_3_NUM);			
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

	double performCalc(String[] args) {
		double[] tmp = convertStringToDouble(args);				
		double a = tmp[0];
		double b = tmp[1];
		double c = tmp[2];
		Double result;
		result = (b+Math.sqrt(Math.pow(b, 2)+4*a*c))/2*a-Math.pow(a, 3)*c+1/(Math.pow(b, 2));
		return result;	
	}

	 void printResult(double result) {		
		System.out.printf("Result is %.3f", result);
		
	}
}
