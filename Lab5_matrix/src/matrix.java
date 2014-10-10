import java.util.Scanner;


public class matrix {

	public static void main(String[] args) {
		System.out.println("Введіть горизонтальний розмір ->");
		Scanner ku = new Scanner(System.in);
		int sizex = ku.nextInt();
		System.out.println("Введіть вертикальний розмір ->");
		int sizey = ku.nextInt();
		System.out.println("Введіть мінімум -->");
		int min = ku.nextInt();
		System.out.println("Введіть максимум -->");
		int max = ku.nextInt();
		ku.close();
		/*for (int i=0; i<size; i++)
		{
			vector[i]=(int) (Math.random()*(max+1-min)+min-1);
			System.out.print(vector[i]+" ");
		}*/
	}

}
