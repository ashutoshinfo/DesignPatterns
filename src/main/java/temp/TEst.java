package temp;

class Parent {

	static {
		System.out.println("Parent.static block");
	}

	// instance block
	{
		x = 10;
		y = 20;
		System.out.println("Parent.Instance block executed.");
	}
	private int x;
	private int y;

	public Parent() {
		System.out.println("Parent.Constructor called.");
	}

}

class Child extends Parent {
	static {
		System.out.println("Child.static bloack");
	}

	private int x;
	private int y;

	// instance block
	{
		x = 10;
		y = 20;
		System.out.println("Child.Instance block");
	}

	public Child() {
		System.out.println("Child.Constructor called");
	}

}

class Testing {
	public static void main(String[] args) {
//		Parent parent = new Parent();
//		System.out.println("------------");
		Child child = new Child();
	}

}
