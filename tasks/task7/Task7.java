package tasks.task7;
/**
 * Составить программу для вычисления значений функции на отрезку [a,b] с шагом h. 
 * Результат представить в виде таблицы, первый столбец
 * которой - значения аргумента, второй - соотвестсвующие заначения функции*/
public class Task7 {

	public static void main(String[] args) {
		Tools tools = new Tools();
		Double[] argsArray = tools.menu();		
		tools.printTable(tools.evaluateFunction(argsArray));
	}

}
