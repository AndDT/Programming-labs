public class Lab_2_2 {
	public static void main(String[] args) {
		Integer obj = new Integer(10);//prost Integer obj = 10;
		int i = obj.intValue();//mojna prosto obj!
		System.out.println(obj.compareTo(i));
		int a = Integer.parseInt("125");
		System.out.println(Integer.parseInt("55"));
		System.out.println(Integer.MIN_VALUE +" " + Integer.MAX_VALUE + " " + Integer.SIZE);
		System.out.println(Integer.toBinaryString(a));
		System.out.println((int)(Character.MAX_VALUE) );
		System.out.println(Integer.toHexString(obj));
		System.out.println(Integer.toOctalString(12));
	}
}
