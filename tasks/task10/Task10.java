package tasks.task10;

import tasks.messages.Messages;

public class Task10 {

	public static void main(String[] args) {
		Tools tools = new Tools();
		boolean check = tools.checkArgs(args);	
		if(check){				
			int[][] matrix = tools.createMatrix(args);				
			tools.printResult(matrix);		
		}else{
			System.out.println(Messages.WRONG_PARAM + Messages.ENTER_MATRIX_SIZE);
		}	
	}
}
