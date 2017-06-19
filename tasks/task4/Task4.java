package tasks.task4;
/**
 * печатает true если точка с координатами (x,y) принадлежит закрашенной 
 * области или false если не принадлежит*/
public class Task4 {

	public static void main(String[] args) {
		double x = 0, y = 0;
		if(args.length != 2){
			System.out.println("Enter two numbers!");
			System.exit(1);
		}
		try{
			x = Double.parseDouble(args[0]);
			y = Double.parseDouble(args[1]);
		}catch(NumberFormatException nfe){
			System.out.println("Enter two numbers!");
			System.exit(2);
		}
		boolean flag = false;
		if((x>=-2 && x<=2)&&(y>=0 && y<=4)){
				flag = true;
			}
		if((x>=-4 && x<=4)&&(y>=-3 && y<=0)){
				flag = true;
			}
		double x0 = 0.0;
		double y0 = -1.25;
		double a = 0.25;
		double b = 0.5;
		if((Math.pow((x-x0), 2)/Math.pow(a, 2) + Math.pow((y-y0), 2)/Math.pow(b, 2)) < 1){
			flag = false;
		}
		System.out.println(flag);
	}

}
