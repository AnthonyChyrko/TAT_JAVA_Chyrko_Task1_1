package tasks.task8;

import java.util.Random;

class Tools {
	
	boolean checkArgs(String[] args){
		if(args.length != 2){
			System.out.println("Enter two numbers!");
			return false;
		}
		double[] numbers = new double[2];
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
			array[i] = Math.abs(rand.nextInt(100000));
			System.out.println(array[i]);
		}
		return array;
	}

	int sumEl(int[] array, int K) {
		int summ = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] % K == 0){
				summ+=array[i];
			}
		}
		return summ;		
	}
}
