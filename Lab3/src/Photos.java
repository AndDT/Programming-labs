import java.util.Scanner;


public class Photos {

	public static void main(String[] args) {
		System.out.print("Введіть кількість фотографій >> ");
		Scanner in = new Scanner (System.in);
		int count = in.nextInt();
		System.out.print("Формат (1 - 9x12; 2 - 10x15; 3 - 18x24) >> ");
		int format = in.nextInt();
		double price = 0;
		double all = 0;
		System.out.println("*******************");
		System.out.print("Формат: ");
		switch (format)
		{
		case 1 : System.out.println("9x12"); price=2.10 ; break;
		case 2 : System.out.println("10x15"); price=3.20 ; break;
		case 3 : System.out.println("18x24"); price=4.30 ; break;
		default : System.out.println("ШТО???");
		}
		System.out.println("Кількість: "+count);
		System.out.printf("Ціна: %5.2f грн%n", price);
		double sum=count*price;
		System.out.printf("Сума: %5.2f грн%n", sum);
		double discount = 0;
		if (count > 10) {discount=sum*0.05;}
		double dosplaty = sum-discount;
		System.out.printf("Знижка %5.2f грн%n", discount);
		System.out.printf("До оплати: %5.2f грн%n", dosplaty);
		/*
		System.out.println("Кількість фотографій: "+count);
		System.out.println("Термін "+months+" місяців");
		if (sum < 5000) {percent = 9;}
		if ((sum > 5000) && (sum < 10000)) {percent = 11;}
		else {percent = 13;}
		System.out.println("Проценти: "+percent+"%");
		double gain=(sum * (percent*0.01))/12*months;
		System.out.printf("Прибуток %5.2f грн%n",gain);
		all=sum + gain;
		System.out.printf("Сума у підсумку %5.2f грн%n", all);
		*/
	}

}
