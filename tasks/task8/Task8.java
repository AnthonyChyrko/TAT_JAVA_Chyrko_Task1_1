package tasks.task8;

import tasks.messages.Messages;

/**
 * В массив А[N] занесены натуральные числа. Найти сумму тех элементов, 
 * которые кратны данному К*/
public class Task8 {

	public static void main(String[] args) {
		Tools tools = new Tools();
		boolean check = tools.checkArgs(args);	
		if(check){				
			int[] array = tools.createArray(args);
			int K = array[array.length-1];
			int result = tools.sumEl(array, K);
			tools.printResult(result, K);		
		}else{
			System.out.println(Messages.WRONG_PARAM + Messages.ENTER_DIGITS);
		}			
	}
}
