package tasks.task8;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import tasks.messages.Messages;


public class Tools {	
	
	boolean checkArgs(String[] args) {		
		if(checkCountArgs(args) && checkArgsIsNumber(args)){			
			return true;
		}else{			
			return false;
		}		
	}
	
	public boolean checkCountArgs(String[] args){
		boolean check = true;
		if(args.length!=2){
			System.out.println(Messages.WRONG_PARAM + Messages.ENTER_2_NUM);			
			return false;
		}
		return check;
	}
	
	public boolean checkArgsIsNumber(String[] args){		
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
	
	private int[] convertStringToInt(String[] str){
		int[] result = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			try{
				result[i] = Integer.valueOf(str[i]);				
			}catch (NumberFormatException nfe) {
				System.out.println(Messages.WRONG_PARAM + Messages.ENTER_DIGITS);			
				System.exit(1);
			}			
		}		
		return result;		
	}
	
	public int[] createArray(String[] args) {	
		if(checkArgs(args)){
			int[] intArgs = convertStringToInt(args);
			int N = intArgs[0];
			int K = intArgs[1];
			int[] array = new int[N + 1];
			Random rand = new Random();
			for (int i = 0; i < array.length - 1; i++) {
				array[i] = Math.abs(rand.nextInt(1000000));
				System.out.println(array[i]);
			}
			array[N] = K;
			return array;
		}else {
			return null;
		}
	}

	int sumEl(int[] array, int K) {
		if(checkArray(array)&&checkK(K)){
			int summ = 0;
			for (int i = 0; i < array.length-1; i++) {
				if(array[i] % K == 0){
					summ+=array[i];
				}
			}
			return summ;		
		}else{
			return 0;
		}
	}
		 
	 private boolean checkK(int k) {
		 if(k > Integer.MAX_VALUE || k < Integer.MIN_VALUE){return false;}
		 String str = ""+k;
		     Pattern p = Pattern.compile("-?\\d+");
		     Matcher m = p.matcher(str);
		     if(m.matches()){
		    	 return true;
		     }		 
		return false;
	}

	private boolean checkArray(int[] array) {
		boolean flag = true;
		for (int i = 0; i < array.length; i++) {
			if(!checkK(i)){
				flag = false;;
			}
		}
		return flag;
	}

	void printResult(int result, int K) {				 			
		System.out.println(result + " - The sum of array elements that are multiples of "+ K);			
	 }	

}
