package tasks.task3;
/**
 * ��������� �������� � ������� �������������� ������������ �� ������ 
 * � � � ���� �������.*/
public class Task3 {
	public static void main(String[] args){
		CheckArgs checkArgs = new CheckArgs();
		double a,b,p,s;
		boolean flag = checkArgs.check(args);
		if(flag){
			a = Double.valueOf(args[0]);
			b = Double.valueOf(args[1]);				
			s = a*b/2;
			p = a + b + Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
			System.out.println("�������� ����� = "+p);
			System.out.println("������� ����� = "+s);
		}else{
			System.out.println("Wrong parameters!");
		}		
		
		
	}
}
