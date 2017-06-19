package tasks.task10;

public class Task10 {

	public static void main(String[] args) {
		Tools tools = new Tools();
		if(tools.checkArgs(args)){
			int N = tools.convertStringToInt(args[0]);
			int[][] matrix = tools.createMatrix(N);
			tools.printResult(matrix);
		}
	}
}
