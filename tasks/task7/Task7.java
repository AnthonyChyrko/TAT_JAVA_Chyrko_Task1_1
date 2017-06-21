package tasks.task7;

import tasks.messages.Messages;
/**
 * ��������� ��������� ��� ���������� �������� ������� �� ������� [a,b] � ����� h. 
 * ��������� ����������� � ���� �������, ������ �������
 * ������� - �������� ���������, ������ - ��������������� ��������� �������*/
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
