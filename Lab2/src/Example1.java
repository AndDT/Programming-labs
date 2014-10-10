import java.util.Scanner;

/**
 * 
 */

/**
 * @author anddt
 *
 */
public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* Для роботи з конс. use клас System, який містить 2 об"єкти:
		 * System.in; System.out. out містить методи для виведення інф. на екран.
		 * sysout.printf use formater
		 *
		 * System.out.printf("Сума %10.2f грн на %5d місяців%n", sum, months);
		 * Scanner містить методи для зчитування даних певних типів.
		 * Scanner in = new Scanner (System.in);
		 * double s = in.nextDouble();
		 * int t = in.nextInt();String st = in nextLine()
		 * String st2=in.next();
		 * 
		 * Обрахувати об"єм і площу поверхні сфери S=4pir^2 ; V=3/4 pi r^2
		 * 
		 * Порахувати опір ланки яка скл. з двох резисторів, що можуть бути з"єднані
		 * або послідовно, або паралельно. 
		 */
		System.out.print("Введіть радіус >> ");
		Scanner in = new Scanner (System.in);
		double r = in.nextDouble();
		double s = 4 * Math.PI * Math.pow(r, 2);
		double v = 4/3 * Math.PI * Math.pow(r ,3);
		System.out.println("*****************");
		System.out.printf("Радіус %5.2f см%n", r);
		System.out.printf("Площа %5.2f см^2%n", s);
		System.out.printf("Об\'єм %5.2f см^3%n", v);
	}

}
