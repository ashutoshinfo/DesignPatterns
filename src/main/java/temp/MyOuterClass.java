package temp;

import temp.MyOuterClass.MyInnerClass1;
import temp.MyOuterClass.MyInnerClass2;

public class MyOuterClass {

	public class MyInnerClass1 {
		String name;

		public MyInnerClass1(String name) {
			System.out.println("MyOuterClass.MyInnerClass1.MyInnerClass1()");
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	public static class MyInnerClass2 {

		public MyInnerClass2(String s) {
			System.out.println("MyOuterClass.MyInnerClass.MyInnerClass()");
		}
		// code for MyInnerClass
	}

	// code for MyOuterClass
}

class test {
	public static void main(String[] args) {
		MyOuterClass class1 = new MyOuterClass();
		MyInnerClass1 myInnerClass1 = class1.new MyInnerClass1("Ashutosh");

		System.out.println(myInnerClass1.getName());

		MyInnerClass2 myInnerClass2 = new MyOuterClass.MyInnerClass2(null);

	}

}