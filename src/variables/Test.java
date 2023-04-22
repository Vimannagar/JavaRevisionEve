package variables;

public class Test {

	int i = 10;

	static int j = 50;

	public static void main(String[] args) {
		int i = 20;

		int j = 70;

		System.out.println(i);// 20

		System.out.println(j);// 70

		System.out.println(Test.j);// 50

		Test t = new Test();

		System.out.println(t.i);// 10

	}

}
