package tasks.task1;

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

	void cutAndSumm(String[] args) {
		char[] tmp = args[0].toCharArray();
		if((tmp[0]+tmp[1])==(tmp[2]+tmp[3])){
			System.out.println("true");
		}else{
			System.out.println("false");
		}		
	}
}
