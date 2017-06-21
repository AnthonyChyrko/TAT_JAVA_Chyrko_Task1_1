package tasks.task7;

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
	
	double[][] evaluateFunction(String[] args){
		double[] doubleArgs = convertStringToDouble(args);
		double a = Math.min(doubleArgs[0], doubleArgs[1]);		
		double lengthOfLine = Math.abs(doubleArgs[1] - doubleArgs[0]);
		double h = doubleArgs[2];
		int countSteps = (int) ((lengthOfLine)/doubleArgs[2] + 1);
		double[][] result = new double[countSteps][2];	
		double[] x = new double[countSteps];
		double[] y = new double[countSteps];		
		x[0] = a ;
		
		for (int i = 1; i < countSteps; i++) {
			x[i] = x[i-1] + h;
		}
		
		for (int i = 0; i < x.length; i++) {
			y[i] = Math.pow(Math.sin(x[i]), 2) - Math.cos(2*x[i]);			
		}
		
		result = combineIO(x, y);		
		return result;		
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
