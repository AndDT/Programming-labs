import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		System.out.println("Введіть к-сть значень --> ");
		Scanner in = new Scanner (System.in);
		int kst = in.nextInt();
		int fn1=1, fn2=1, fn=0;
		System.out.print(fn1+" "+fn2+" ");
		for (int i=0; i<kst; i++) {
			fn = fn2 + fn1;
			fn2 = fn1;
			fn1 = fn;
			System.out.print(fn+" ");
		}
	}

}
