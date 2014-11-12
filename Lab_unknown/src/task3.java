public class task3 {

	public static void main(String[] args) {
		final int n = 9;
		System.out.print("*| ");
		for (int i = 1; i <= 9; i++){
			System.out.print(i+" ");
		}
		System.out.print("\n-+-");
		for (int i = 1; i <= 9; i++){
			System.out.print("--");
		}
		for (int i = 1; i <= n; i++){
			System.out.print("\n"+i+"|");
			for (int j = 1; j <= n; j++){
				System.out.print(" "+i*j);
			}
		}
	}

}
