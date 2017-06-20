package tasks.task4;

import tasks.messages.Messages;

/**
 * печатает true если точка с координатами (x,y) принадлежит закрашенной 
 * области или false если не принадлежит*/
public class Task4 {
	public static void main(String[] args) {
		Tools tools = new Tools();
		boolean check = tools.checkArgs(args);	
		if(check){			
			boolean result = tools.performCalc(args);
			tools.printResult(result);
		}else{
			System.out.println(Messages.WRONG_PARAM + Messages.ENTER_DIGITS);
		}				
	}
}
