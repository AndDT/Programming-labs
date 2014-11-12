import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		System.out.println("Введіть к-сть чисел -->");
		Scanner in = new Scanner (System.in);
		int count = in.nextInt();
		int max = 0, min = 0, var = 0;
		for (int i=0; i < count; i++ ) {
		System.out.println("Введіть число");
		var=in.nextInt();
		if (var > min) {max=var; min=var;} 
		}
		System.out.println("Маскимальне число="+max);
	}

}
