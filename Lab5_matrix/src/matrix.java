import java.util.Scanner;


public class matrix {

	public static void main(String[] args) {
		int[][] mas = null; 
		System.out.println("Введіть розмірнсть масиву, його найменьше та найбільше значення");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		if (size <= 0) {
			System.out.println("Введіть додатню розмірнсть масиву");
			size = in.nextInt();
		}
		int min = in.nextInt();
		int max = in.nextInt();
		if (max < min) {
			System.out.println("Найбільше значеня  повинне бути більшим за найменьше. Введіть правильне значення найбільшого і найменшого значення");
			min = in.nextInt();
			max = in.nextInt();
		}

		mas = new int[size][size];
		for (int i = 0;  i < size; i++) {
			for( int j = 0; j < size;j++){
				mas[i][j] = (int) (Math.random()*(max - min) + min);
				System.out.printf("%2d ",mas[i][j]);
			}
			System.out.println();
		}	
		int buffer = mas[0][0];
		int ind1 = 0,ind2 = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if(mas[i][j] > buffer){
					buffer = mas[i][j];
					ind1 = i+1;
					ind2 = j+1;
				}
			}
		}
		if (ind1 == 0 ) {
			ind1++;
			ind2++;
		}
		System.out.println("Найбільше значення — " + buffer + "; Його індекс: " + ind1 + " рядок, "+ ind2+" стовпчик");
		buffer = mas[0][0];
		ind1 = 0;
		ind2 = 0;
		for(int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if(mas[i][j] < buffer){
					buffer = mas[i][j];
					ind1 = i+1;
					ind2 = j+1;
				}

			}
		}
		if (ind1 == 0 ) {
			ind1++;
			ind2++;

		}
		System.out.println("Найменьше значення — " + buffer + "; Його індекс: " + ind1 + " рядок, "+ ind2+" стовпчик");
		System.out.println("Введіть номер рядка суму елементів якого потрібно знайти");
		int row = in.nextInt();
		in.close();
		row--;
		buffer = 0;
		for (int i = 0;i < mas.length;i++){
			buffer += mas[row][i];
		}
		System.out.println("Сума елементів "+(++row)+ "-го рядка = "+ buffer);
		buffer = 0;
		for (int i = 0; i < mas.length;i ++) {
			for (int j = 0; j < mas.length; j++) {
				if (i == j) {
					buffer += mas[i][j];
				}
			}
		}
		System.out.println("Сума елементів головної діагоналі = "+ buffer);
		buffer = 0;
		size++;
		for (int i = 0; i < mas.length;i ++) {
			for (int j = 0; j < mas.length; j++) {
				int k = i + j + 2;
				if ( k == size) {
					buffer += mas[i][j];
				}
			}
		}
		System.out.println("Сума елементів побічної діагоналі = "+buffer);
		buffer = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if (i <j ) {
					buffer += mas[i][j];

				}
			}
		}
		System.out.println("Сума елементів вище головної діагоналі = "+buffer);
		buffer = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if (i >j ) {
					buffer += mas[i][j];

				}
			}
		}
		System.out.println("Сума елементів нижче головної діагоналі = "+buffer);
		buffer = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if (i != 0  & j!= -1 + mas.length ) {
					buffer +=mas[i][j];
				}
			}
		}
		System.out.println("Сума елементів нижньої лівої чверті = "+buffer);
		buffer = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if (i != -1 + mas.length  & j!= -1 + mas.length ) {
					buffer +=mas[i][j];
				}
			}
		}
		System.out.println("Суме елементів верхньої лівої чверті = " + buffer);
		buffer = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if (i != -1 + mas.length  & j != 0 ) {
					buffer +=mas[i][j];
				}
			}
		}
		System.out.println("Сума елемантів верхньої правої чверті - " + buffer);
		buffer = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if (i != 0 & j != 0 ) {
					buffer +=mas[i][j];
				}
			}
		}
		System.out.println("Сума елементів нижньої првої черті - "+buffer);
	}

}
