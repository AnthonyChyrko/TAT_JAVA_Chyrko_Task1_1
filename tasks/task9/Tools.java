package tasks.task9;

import java.util.Random;

class Tools {
	
	boolean checkArgs(String[] args){
		if(args.length != 3){
			System.out.println("Enter three numbers!");
			return false;
		}		
		double[] numbers = new double[3];
		try{
			for (int i = 0; i < args.length; i++) {
				numbers[i] = Double.parseDouble(args[i]);
			}
		}catch(NumberFormatException nfe){
			System.out.println("Enter only numbers!");
			return false;
		}
		if(numbers[2] > numbers[0]){
			System.out.println("The length of the array is less than the position for insertion!");
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

	int[] combineArrays(int[] array1, int[] array2, int K) {
		boolean flag = false;
		int iter = 0;
		int[] result = new int[array1.length + array2.length];
		for (int i = 0; i < result.length; i++) {
			if(i < K || flag){				
				result[i] = array1[iter];
				iter++;
				
			}else{
				for (int j = 0; j < array2.length; j++) {
					result[i] = array2[j];					
					i++;					
				}				
				flag = true;				
				i = i-1;
			}
		}
		return result;
	}

	void printResult(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + "   ");
		}
		
	}
}
