package tasks.task3;

import tasks.messages.Messages;

/**
 * Вычислить периметр и площадь прямоугольного треугольника по длинам 
 * а и б двух катетов.*/
public class Task3 {
	public static void main(String[] args){
		Tools tools = new Tools();
		boolean check = tools.checkArgs(args);	
		if(check){
			Triangle triangle = tools.createTriangle(args);
			double perimeter = triangle.calcPerim();
			double square = triangle.calcSquare();
			tools.printResult(perimeter, "Perimeter");
			tools.printResult(square, "Square");
		}else{
			System.out.println(Messages.WRONG_PARAM + Messages.ENTER_DIGITS);
		}			
	}
}
