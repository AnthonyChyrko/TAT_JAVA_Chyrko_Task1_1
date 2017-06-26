package tasks.task9;

import java.util.Random;
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
	
	private boolean checkCountArgs(String[] args){
		boolean check = true;
		if(args.length!=3){
			System.out.println(Messages.WRONG_PARAM + Messages.ENTER_N1_N2_K);			
			return false;
		}
		return check;
	}
	
	private boolean checkArgsIsNumber(String[] args){		
		String regexp = "\\d+";
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
	
	int convertStrToInt(String str){
		int result = 0;
			try{
				result = Integer.valueOf(str);				
			}catch (NumberFormatException nfe) {
				System.out.println(Messages.WRONG_PARAM + Messages.ENTER_DIGITS);					
			}						
		return result;
	}
		
	 double[] createArray(int N) {			
		double[] array = new double[N];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.abs(rand.nextInt(100000));
			System.out.println(array[i]);
		}		
		return array;
	}		

	 double[] combineArrays(double[] array1, double[] array2, int K) {
			boolean flag = false;
			int iter = 0;
			double[] result = new double[array1.length + array2.length];
			for (int i = 0; i < result.length; i++) {
				if(i < K || flag){				
					result[i] = array1[iter];
					iter++;
					
				}else{
					for (int j = 0; j < array2.length; j++) {
						result[i] = array2[j];					
						i++;					
					}				
					flag = true;				
					i = i-1;
				}
			}
			return result;
		}
		 
	void printResult(double[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.printf(" %.3f ",result[i]);
		}		
	}

}
