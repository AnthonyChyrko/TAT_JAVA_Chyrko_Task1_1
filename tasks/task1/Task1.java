package tasks.task1;

import tasks.messages.Messages;

/**
 * ����� ���� ������ ���� ��������� ��������������� ����� ����� ����� ���� ��� 
 * ��������� ����. ������� �� ����� true ��� false*/
public class Task1 {
	public static void main(String[] args){
		Tools tools = new Tools();
		boolean check = tools.checkArgs(args);	
		if(check){
			System.out.println(tools.cutAndSumm(args));
		}else{
			System.out.println(Messages.WRONG_PARAM + Messages.ENTER_1_NUMBER_OF_4_DIGITS);
		}			
	}
}
