import java.util.Scanner;


public class Example2 {

	public static void main(String[] args) {
		/* 
		 * Порахувати опір ланки яка скл. з двох резисторів, що можуть бути з"єднані
		 * або послідовно, або паралельно. 
		 */
		System.out.print("Введіть опір 1 >> ");
		Scanner in = new Scanner (System.in);
		int r1 = in.nextInt();
		System.out.print("Введіть опір 2 >> ");
		int r2 = in.nextInt();
		System.out.print("Введіть тип з\'єднання:\n1 - послідовне\n2 - паралельне\nВаш вибір -> ");
		int choice = in.nextInt();
		System.out.println("**********************");
		System.out.println("Опір r1 = "+r1+" ом");
		System.out.println("Опір r2 = "+r2+" ом");
		System.out.print("Тип з\'єднання - ");
		if (choice == 1 ){System.out.println("послідовне");}
		  else {System.out.println("паралельне");}
		System.out.print("Загальний опір ");
		double r;
		if (choice == 1) {r=r1+r2;} else {r=r1*r2/(r1+r2);}
		System.out.printf("%5.2f ом",r);
	}

}
