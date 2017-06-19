package tasks.task3;

class CheckArgs {
	boolean check(String[] args){
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
}
