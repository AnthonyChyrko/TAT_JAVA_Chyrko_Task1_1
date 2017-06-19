package tasks.task10;

import java.util.Random;

class Tools {
	
	boolean checkArgs(String[] args){
		if(args.length != 1){
			System.out.println("Enter one numbers!");
			return false;
		}
		double[] numbers = new double[1];
		try{
			for (int i = 0; i < args.length; i++) {
				numbers[i] = Double.parseDouble(args[i]);
			}
		}catch(NumberFormatException nfe){
			System.out.println("Enter only numbers!");
			return false;
		}
		return true;							
	}
	
	 int convertStringToInt(String arg){	
		int result = Integer.valueOf(arg);	
		return result;
}

	int[] createArray(int N) {
		int[] array = new int[N];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100000);
			System.out.println(array[i]);
		}
		return array;
	}
	
	void printResult(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("\n");
		}
		
	}

	int[][] createMatrix(int n) {
		int[][] result = new int[n][n];
		int[] array = createArr(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i % 2 == 0){
					result[i][j] = array[j];
				}else{
					result[i][j] = array[n-1-j];
				}
				
			}
		}
		return result;
	}

	private int[] createArr(int n) {
		int[] result = new int[n];
		for (int i = 0; i < result.length; i++) {
			result[i] = i + 1;
		}
		return result;
	}
}
