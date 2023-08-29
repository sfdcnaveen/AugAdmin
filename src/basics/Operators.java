package basics;

public class Operators {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//Relation
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);

		System.out.println(a==b);
		//Prefix
		int x = 5;
		int y = 7;
		System.out.println(++x + ++y + ++y - --x + --y + ++x); //6 + 8 + 9 - 5 + 8 + 6 = 32
		System.out.println(++y + --x + --y); //9 + 5 + 8 = 22
		
	}

}
