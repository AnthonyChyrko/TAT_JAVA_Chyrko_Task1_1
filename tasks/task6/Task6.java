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
			double result = tools.performCalc(max, min);			
			tools.printResult(result, "Summ max and min");
		}else{
			System.out.println(Messages.WRONG_PARAM + Messages.ENTER_DIGITS);
		}		
		
//		double max(double num1, double num2,double num3){		
//			double max = num1 > num2 ? num1 : num2;
//			double result = num3 > max ? num3 : max;
//			return result;
//			
//		}
//		
//		double min(double num1, double num2,double num3){		
//			double min = num1 < num2 ? num1 : num2;
//			double result = num3 < min ? num3 : min;
//			return result;
//			
//		}
//		Tools tools = new Tools();
//		double[] argsArray = tools.convertStringToDouble(args);
//		boolean flag = tools.checkArgs(args);
//		if(flag){
//			double result = tools.max(argsArray[0], argsArray[1],argsArray[2]) +
//					tools.min(argsArray[0], argsArray[1],argsArray[2]);
//			System.out.println(result);			
//		}else{
//			System.out.println("Wrong parameters!");
//		}
	}

}
