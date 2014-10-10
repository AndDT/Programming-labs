import java.util.Scanner;

/**
 * 
 */

/**
 * @author anddt
 *
 */
public class Deposit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Введіть суму >> ");
		Scanner in = new Scanner (System.in);
		int sum = in.nextInt();
		System.out.print("Введіть термін >> ");
		int months = in.nextInt();
		int percent = 0;
		double all = 0;
		System.out.println("*******************");
		System.out.println("Сума "+sum+" грн");
		System.out.println("Термін "+months+" місяців");
		if (sum < 5000) {percent = 9;}
		if ((sum > 5000) && (sum < 10000)) {percent = 11;}
		else {percent = 13;}
		System.out.println("Проценти: "+percent+"%");
		double gain=(sum * (percent*0.01))/12*months;
		System.out.printf("Прибуток %5.2f грн%n",gain);
		all=sum + gain;
		System.out.printf("Сума у підсумку %5.2f грн%n", all);
	}

}
