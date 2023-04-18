package temp;

class MyPrintStream {
	public void print(String s) {
		System.out.println(s);
	}
}

public class MySystem {
	public static final MyPrintStream out;
	static {
		out = new MyPrintStream();
	}

}

class MyClient {
	public static void main(String[] args) {
		MySystem.out.print("Hello world!");
	}
}
