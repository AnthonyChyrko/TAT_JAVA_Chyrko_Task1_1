package tasks.task8;
/**
 * В массив А[N] занесены натуральные числа. Найти сумму тех элементов, 
 * которые кратны данному К*/
public class Task8 {

	public static void main(String[] args) {
		Tools tools = new Tools();
		if(tools.checkArgs(args)){
			int N = tools.convertStringToInt(args[0]);
			int K = tools.convertStringToInt(args[1]);
			System.out.println("Array elements:");
			int[] array = tools.createArray(N);
			int result = tools.sumEl(array, K);
			System.out.println(result + " - The sum of array elements that are multiples of "+ K);
		}else{
			System.out.println("Wrong parameters! Enter n k through a space, where:\n"
					+ "n - Length of the array\n"					
					+ "k - Number that is multiples of array elements");
		}
		
		
	}

}
