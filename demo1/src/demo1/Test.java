package demo1;

public class Test {
	public static void main(String[] args) {
		int i = 1;
		Test test = new Test();
		test.ttt(i);
		System.out.println(i);
	}
	public void ttt(int i) {
		i = i+1;
		System.out.println("ttt.."+i);
	}
}