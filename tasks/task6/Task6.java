package tasks.task6;
/**
 * Написать программу нахождения суииы большего и меньшего их трух чисел.*/

public class Task6 {

	public static void main(String[] args) {
		Tools tools = new Tools();
		double[] argsArray = tools.convertStringToDouble(args);
		boolean flag = tools.checkArgs(args);
		if(flag){
			double result = tools.max(argsArray[0], argsArray[1],argsArray[2]) +
					tools.min(argsArray[0], argsArray[1],argsArray[2]);
			System.out.println(result);			
		}else{
			System.out.println("Wrong parameters!");
		}
	}

}
