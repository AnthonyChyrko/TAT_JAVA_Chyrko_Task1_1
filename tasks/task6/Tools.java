package tasks.task6;

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
		return true;
							
	}
	
	double max(double num1, double num2,double num3){		
		double max = num1 > num2 ? num1 : num2;
		double result = num3 > max ? num3 : max;
		return result;
		
	}
	
	double min(double num1, double num2,double num3){		
		double min = num1 < num2 ? num1 : num2;
		double result = num3 < min ? num3 : min;
		return result;
		
	}
	double[] convertStringToDouble(String[] args){	
		double[] result = new double[args.length];
		for (int i = 0; i < args.length; i++) {
			result[i] = Double.valueOf(args[i]);
		}		
		return result;
		
	}

}
