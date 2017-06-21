package tasks.task7;

import tasks.messages.Messages;
/**
 * Составить программу для вычисления значений функции на отрезку [a,b] с шагом h. 
 * Результат представить в виде таблицы, первый столбец
 * которой - значения аргумента, второй - соотвестсвующие заначения функции*/
public class Task7 {

	public static void main(String[] args) {
		Tools tools = new Tools();
		boolean check = tools.checkArgs(args);	
		if(check){				
			double[][] result = tools.evaluateFunction(args);
			tools.printResult(result);			
		}else{
			System.out.println(Messages.WRONG_PARAM + Messages.ENTER_DIGITS);
		}		
	}
}
