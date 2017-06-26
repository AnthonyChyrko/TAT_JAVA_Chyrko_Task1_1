package tasks.task1;

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
		if(args.length!=1){
			System.out.println(Messages.WRONG_PARAM+Messages.ENTER_1_NUMBER_OF_4_DIGITS);	
			return false;
		}
		return check;
	}
	
	public boolean checkArgsIsNumber(String[] args){		
		String regexp = "\\d{4}";
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

	public boolean cutAndSumm(String[] args) {
		if(checkArgs(args)){
			char[] tmp = args[0].toCharArray();
			if((tmp[0]+tmp[1])==(tmp[2]+tmp[3])){					
				return true;
			}else{				
				return false;
			}
		}else {			
			return false;
		}	
	}
}
