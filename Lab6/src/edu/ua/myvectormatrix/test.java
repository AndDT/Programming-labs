package edu.ua.myvectormatrix;


public class test {

	public static void main(String[] args) {
		int test2[] = VectorMatrix.fillRandom(8, 10, 0);
		System.out.println(edu.ua.myvectormatrix.VectorMatrix.myToString(test2));
		System.out.println(edu.ua.myvectormatrix.VectorMatrix.mySearch(test2, 6));
	}

}
