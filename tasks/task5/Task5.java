package tasks.task5;

import tasks.messages.Messages;

/**
 * ���� ��� �������������� �����. �������� � ������� �� �� ���, �������� 
 * ������� ��������������, � � ��������� ������� - �������������.
 */
public class Task5 {
	public static void main(String[] args){		
		Tools tools = new Tools();
		boolean check = tools.checkArgs(args);	
		if(check){				
			double[][] result = tools.performCalc(args);
			tools.printResult(result);
		}else{
			System.out.println(Messages.WRONG_PARAM + Messages.ENTER_DIGITS);
		}			
	}	
}
