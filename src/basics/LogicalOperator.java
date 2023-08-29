package basics;

public class LogicalOperator {
	public static void main(String[] args) {
//		AND						OR
//		0 0 -- 0				0 0 -- 0
//		0 1 -- 0				0 1 -- 1
//		1 0 -- 0				1 0 -- 1
//		1 1 -- 1				1 1 -- 1
		
		int x=4, y=8;
		System.out.println(x>y && x>y);
		System.out.println(x>y || y>x);
	}

}
