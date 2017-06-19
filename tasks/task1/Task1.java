package tasks.task1;
/**
 * Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его 
 * последних цифр. Выводит на экран true или false*/
public class Task1 {
	public static void main(String[] args){
		try {
			char[] symbols = args[0].toCharArray();
			if(symbols.length!=4){
				System.out.println("Wrong parameter! Enter a four-digit number!");
				System.exit(1);
			}
			int[] numbers = new int[symbols.length];
			for (int i = 0; i < symbols.length; i++) {
				numbers[i] = Integer.valueOf(symbols[i]+"");
			}		
			if((numbers[0]+numbers[1])==(numbers[2]+numbers[3])){
				System.out.println("true");
			}else{
				System.out.println("false");
			}
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("Enter a four-digit number!");
			System.exit(2);
		}
		catch (NumberFormatException nfe) {
			System.out.println("Enter a four-digit number!");
			System.exit(3);
		}		
	}
}
