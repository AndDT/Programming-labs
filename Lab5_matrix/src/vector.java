import java.util.Scanner;


public class vector {

	public static void main(String[] args)
	{	
		System.out.println("Введіть розмірність ->");
		Scanner ku = new Scanner(System.in);
		int size = ku.nextInt();
		int vector[] = null;
		vector = new int[size];
		System.out.println("Введіть мінімум -->");
		int min = ku.nextInt();
		System.out.println("Введіть максимум -->");
		int max = ku.nextInt();
		ku.close();
		for (int i=0; i<size; i++)
		{
			vector[i]=(int) (Math.random()*(max+1-min)+min-1);
			System.out.print(vector[i]+" ");
		}
		int max_=vector[0];
		int index=0;
		for (int i=0; i<size; i++)
		{
			if (vector[i]>max_){max_=vector[i];index=i;}
		}
		System.out.println("\nНайбільше="+max_);
		System.out.println("Індекс найбільшого="+(index+1));
		int min_=vector[0];
		int index2=0;
		for (int i=0; i<size; i++)
		{
			if (vector[i]<min_){min_=vector[i];index2=i;}
		}
		System.out.println("Найменьше="+min_);
		System.out.println("Індекс найменшого="+(index2+1));
	}
}
