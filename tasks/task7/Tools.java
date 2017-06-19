package tasks.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Tools {
	private boolean checkArgs(String arg){			
		double num = 0;				
			try{					
				num = Double.parseDouble(arg);				
			}catch(NumberFormatException nfe){
				System.out.println("Enter only numbers!");
				return false;
			}			
		return true;
							
	}
		
	private double convertStringToDouble(String arg){	
			double result = Double.valueOf(arg);	
			return result;
	}

	private String enter(){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		try {
			str = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
	
	Double[] menu(){
		String[] strResult = new String[3];
		Double[] result = new Double[3];
		boolean answer = true;		
		
		do{
			System.out.println("Enter A");
			strResult[0] = enter();
			if(checkArgs(strResult[0])){
				result[0] = convertStringToDouble(strResult[0]);
				answer = false;
			}else{
				System.out.println("Do you want to continue? y/n?");
				String tmp = enter();
				if(tmp.equals("n")){
					System.exit(1);					
				}else while(!tmp.equals("y")){
					System.out.println("y/n?!!!");
					tmp = enter();					
				}
			}
		}while(answer);
		answer = true;
		do{
			System.out.println("Enter B");
			strResult[1] = enter();
			if(checkArgs(strResult[1])){
				result[1] = convertStringToDouble(strResult[1]);
				answer = false;
			}else{
				System.out.println("Do you want to continue? y/n?");
				String tmp = enter();
				if(tmp.equals("n")){
					System.exit(2);					
				}else while(!tmp.equals("y")){
					System.out.println("y/n?!!!");
					tmp = enter();					
				}
			}
		}while(answer);	
		answer = true;
		do{
			System.out.println("Enter C");
			strResult[2] = enter();
			if(checkArgs(strResult[2])){
				result[2] = convertStringToDouble(strResult[2]);
				answer = false;
			}else{
				System.out.println("Do you want to continue? y/n?");
				String tmp = enter();
				if(tmp.equals("n")){
					System.exit(3);					
				}else while(!tmp.equals("y")){
					System.out.println("y/n?!!!");
					tmp = enter();					
				}
			}
		}while(answer);
		
		return result;		
	}
	
	double[][] evaluateFunction(Double[] argsArray){
		double a = Math.min(argsArray[0], argsArray[1]);		
		double lengthOfLine = Math.abs(argsArray[1] - argsArray[0]);
		double h = argsArray[2];
		int countSteps = (int) ((lengthOfLine)/argsArray[2] + 1);
		double[][] result = new double[countSteps][2];	
		double[] x = new double[countSteps];
		double[] y = new double[countSteps];		
		x[0] = a ;
		for (int i = 1; i < countSteps; i++) {
			x[i] = x[i-1] + h;
		}
		
		for (int i = 0; i < x.length; i++) {
			y[i] = Math.pow(Math.sin(x[i]), 2) - Math.cos(2*x[i]);			
		}
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < 2; j++) {
				if(j==0){
					result[i][j] = x[i];
				}else{
					result[i][j] = y[i];
				}				 
			}
			
		}
		return result;		
	}
	
	void printTable(double[][] table){
		System.out.println("   X      Y   ");
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.printf("%7f", table[i][j]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}
	}
	
	
}
