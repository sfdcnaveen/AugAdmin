package basics;

public class PostFix {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		System.out.println(x++);
		System.out.println(x);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(x++ + y++ + x++); //10 + 20 + 11 = 41
		
//		int a=5, b=6;
//		System.out.println(a++ + b++ - a-- + b++ - a-- + b++ + a++); // 5 + 6 - 6 + 7 - 5 + 8 + 4 
		int a= 20, b=7;
		System.out.println(a++ + b++ - b-- + ++a + --b + ++b + --b + a++ - --a);
						// 20 + 7 - 8 + 22 + 6 + 7 + 6 + 22 - 22
						// 21  8 7 22 6 7 6 23 22
	}

}
