package tasks.task9;

import tasks.messages.Messages;

public class Task9 {

	public static void main(String[] args) {
		Tools tools = new Tools();
		boolean check = tools.checkArgs(args);	
		if(check){						
			int N1 = tools.convertStrToInt(args[0]);
			int N2 = tools.convertStrToInt(args[1]);
			int K = tools.convertStrToInt(args[2]);
			double[] array1 = tools.createArray(N1);	
			double[] array2 = tools.createArray(N2);	
			double[] result = tools.combineArrays(array1,array2,K);
			tools.printResult(result);		
		}else{
			System.out.println(Messages.WRONG_PARAM + Messages.ENTER_N1_N2_K);
		}
	}
}
