package tasks.task9;

public class Task9 {

	public static void main(String[] args) {
		Tools tools = new Tools();
		if(tools.checkArgs(args)){
			int N1 = tools.convertStringToInt(args[0]);
			int N2 = tools.convertStringToInt(args[1]);
			int K = tools.convertStringToInt(args[2]);
			int[] array1 = tools.createArray(N1);
			int[] array2 = tools.createArray(N2);
			int[] result = tools.combineArrays(array1, array2, K);
			tools.printResult(result);			
		}else{
			System.out.println("Wrong parameters! Enter n1 n2 k through a space, where:\n"
					+ "n1 - Length of the first array\n"
					+ "n2 - Length of the second array\n"
					+ "k - Place for insertion");
		}

	}

}
