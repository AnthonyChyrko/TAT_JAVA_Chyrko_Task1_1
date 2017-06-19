package tasks.task5;

/**
 * ���� ��� �������������� �����. �������� � ������� �� �� ���, �������� 
 * ������� ��������������, � � ��������� ������� - �������������.
 */
public class Task5 {
	public static void main(String[] args){		
		Tools tools = new Tools();
		boolean flag = tools.checkArgs(args);
		if(flag){
			for (int i = 0; i < args.length; i++) {
				double tmp = Double.valueOf(args[i]);
				if(tools.isPositive(tmp)){
					System.out.println(Math.pow(tmp, 2));
				}else{
					System.out.println(Math.pow(tmp, 4));
				}
			}
		}else{
			System.out.println("Wrong parameters!");
		}
	}	
}
