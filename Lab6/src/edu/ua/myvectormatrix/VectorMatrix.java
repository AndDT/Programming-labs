package edu.ua.myvectormatrix;

public class VectorMatrix
{
	public static int[] fillRandom(int column, int max, int min)
	{
		int vector[] = null;
		vector = new int[column];
		for (int i=0; i<column; i++)
		{
			vector[i]=(int) (Math.random()*(max+1-min)+min-1);
		}
		return vector;
	}

	public static int[][] fillRandom(int row, int column, int max, int min)
	{
		int matrix[][] = null;
		matrix = new int[row][column];
		for (int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				matrix[i][j]=(int)(Math.random()*(max+1-min)+min-1);
			}
		}
		return matrix;
	}
		
	public static String myToString(int[] arr)
	{
			String result="";
			for (int element:arr)
				result+=element+" ";
			return result;
	}
	
	public static String myToString(int[][] arr)
	{
			String result="";
			for (int[] row:arr)
			{
				for (int element:row)
				{
				result+=element+" ";}
				result+="\n";
				}
			return result;
	}
	//Послідовний пошук
	public static int mySearch(int[] arr, int number)
	{
		int i=0;
		for (i=0; i<arr.length; i++)
		{
			if (arr[i]==number){return i;}
		}
		return i;
	}
}
	
