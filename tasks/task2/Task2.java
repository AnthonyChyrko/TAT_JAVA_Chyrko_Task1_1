package tasks.task2;

import tasks.messages.Messages;

/**
 * Вычислить значение выражения по формуле(все переменные принимают 
 * действительные значения).  (b+корень(b*b+4ac)/2a-a*a*a*c+1/b*b    */
public class Task2 {
	public static void main(String[] args){
		Tools tools = new Tools();
		boolean check = tools.checkArgs(args);	
		if(check){
			try {
				double result = tools.performCalc(args);
				tools.printResult(result);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}			
		}else{
			System.out.println(Messages.WRONG_PARAM + Messages.ENTER_DIGITS);
		}					
	}
}
