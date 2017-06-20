package tasks.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tasks.messages.Messages;


class Tools {
//	Messages mess;
//	static final String messageWrongParam = "Wrong parameter! ";
//	static final String messageEnterDigits = "Enter only digits! ";
//	static final String messageEnter1NumOf4Digits = "Enter only one 4-digit number! ";
	
	boolean checkArgs(String[] args) {		
		if(checkCountArgs(args) && checkArgsIsNumber(args)){			
			return true;
		}else{			
			return false;
		}		
	}
	
	private boolean checkCountArgs(String[] args){
		boolean check = true;
		if(args.length!=1){
			System.out.println(Messages.WRONG_PARAM+Messages.ENTER_1_NUMBER_OF_4_DIGITS);			
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
	
//	private int[] convertStringToInt(String[] str){
//		int[] result = new int[str.length];
//		for (int i = 0; i < str.length; i++) {
//			try{
//				result[i] = Integer.valueOf(str[i]);				
//			}catch (NumberFormatException nfe) {
//				System.out.println(messageWP+messageEOD);			
//				System.exit(1);
//			}			
//		}		
//		return result;		
//	}

	void cutAndSumm(String[] args) {
		char[] tmp = args[0].toCharArray();
		if((tmp[0]+tmp[1])==(tmp[2]+tmp[3])){
			System.out.println("true");
		}else{
			System.out.println("false");
		}		
	}
}
