package tasks.task6;

import tasks.messages.Messages;

/**
 * Написать программу нахождения суииы большего и меньшего их трух чисел.*/

public class Task6 {

	public static void main(String[] args) {
		Tools tools = new Tools();
		boolean check = tools.checkArgs(args);	
		if(check){				
			double max = tools.max(args);
			tools.printResult(max, "Max");
			double min = tools.min(args);
			tools.printResult(min, "Min");
			double result = max + min;			
			tools.printResult(result, "Summ max and min");
		}else{
			System.out.println(Messages.WRONG_PARAM + Messages.ENTER_DIGITS);
		}
	}
}
