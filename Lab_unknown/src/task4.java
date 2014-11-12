import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		System.out.println("Введіть n --> ");
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		double pi = 0;
		double m = 0;
		for (int i=0; i<n; i++){
			pi = pi + Math.pow(-1,i) * (1/(1+m));
			m += 2;
		}
		pi = pi * 4;
		System.out.println(pi);
	}

}
