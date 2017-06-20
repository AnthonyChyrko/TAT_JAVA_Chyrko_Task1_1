package tasks.task4;

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
	
	 boolean performCalc(String[] args) {
		double[] doubleArgs = convertStringToDouble(args);
		double x = doubleArgs[0]; 
		double y = doubleArgs[1];	
		boolean flag = false;
		if((x>=-2 && x<=2)&&(y>=0 && y<=4)){
				flag = true;
			}
		if((x>=-4 && x<=4)&&(y>=-3 && y<=0)){
				flag = true;
			}
		double x0 = 0.0;
		double y0 = -1.25;
		double a = 0.25;
		double b = 0.5;
		if((Math.pow((x-x0), 2)/Math.pow(a, 2) + Math.pow((y-y0), 2)/Math.pow(b, 2)) < 1){
			flag = false;
		}
		return flag;
	}	
	
	 void printResult(boolean result) {
		 	System.out.println(result);
		}	
}
