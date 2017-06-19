package tasks.task2;
/**
 * Вычислить значение выражения по формуле(все переменные принимают 
 * действительные значения).  (b+корень(b*b+4ac)/2a-a*a*a*c+1/b*b    */
public class Task2 {
	public static void main(String[] args){
		CheckArgs checkArgs = new CheckArgs();
		double a,b,c;
		boolean flag = checkArgs.check(args);
		if(flag){
			a = Double.valueOf(args[0]);
			b = Double.valueOf(args[1]);
			c = Double.valueOf(args[2]);
			Double result;
			result = (b+Math.sqrt(Math.pow(b, 2)+4*a*c))/2*a-Math.pow(a, 3)*c+1/(Math.pow(b, 2));
			System.out.println(result);
		}else{
			System.out.println("Wrong parameters!");
		}		
	}
}
