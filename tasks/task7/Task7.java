package tasks.task7;
/**
 * ��������� ��������� ��� ���������� �������� ������� �� ������� [a,b] � ����� h. 
 * ��������� ����������� � ���� �������, ������ �������
 * ������� - �������� ���������, ������ - ��������������� ��������� �������*/
public class Task7 {

	public static void main(String[] args) {
		Tools tools = new Tools();
		Double[] argsArray = tools.menu();		
		tools.printTable(tools.evaluateFunction(argsArray));
	}

}
