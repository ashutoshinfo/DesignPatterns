package info.ashutosh.design.controlFlows;

public class FlowClass {
	static int staticVariable1 = 10;

	static {
		testStatic();
		System.out.println("Static Bloack {}: staticVariable1: " + staticVariable1);
	}

	public static void main(String[] args) {
		testStatic();
		System.out.println("main()");
	}

	public static void testStatic() {
		System.out.println("testStatic(): 	  staticVariable2: " + staticVariable2);
	}

	static int staticVariable2 = 20;

}

class TestClass {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> myClass = Class.forName("info.ashutosh.design.controlFlows.FlowClass");
		System.out.println("main(): 	  staticVariable2: " + FlowClass.staticVariable2);
	}
}
