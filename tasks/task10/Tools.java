package tasks.task10;

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
		if(args.length!=1){
			System.out.println(Messages.WRONG_PARAM + Messages.ENTER_N1_N2_K);			
			System.exit(1);
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
	
	private int convertStrToInt(String str){
		int result = 0;
			try{
				result = Integer.valueOf(str);				
			}catch (NumberFormatException nfe) {
				System.out.println(Messages.WRONG_PARAM + Messages.ENTER_DIGITS);					
			}						
		return result;
	}
		 
	void printResult(int[][] matrix) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println("\n");
			}			
		}
	
	public int[][] createMatrix(String[] args) {
		checkArgs(args);
		int n = convertStrToInt(args[0]);
		int[][] result = new int[n][n];
		int[] array = createArr(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i % 2 == 0){
					result[i][j] = array[j];
				}else{
					result[i][j] = array[n-1-j];
				}
				
			}
		}
		return result;
	}
	
	private int[] createArr(int n) {
		int[] result = new int[n];
		for (int i = 0; i < result.length; i++) {
			result[i] = i + 1;
		}
		return result;
	}
}
