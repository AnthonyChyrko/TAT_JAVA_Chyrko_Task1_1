package tasks.task2;

class CheckArgs {
	boolean check(String[] args){
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
}
