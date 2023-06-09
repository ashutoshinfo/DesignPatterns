package info.ashutosh.design.behavioural.templateDP.templateDesignPattern1.template;

public abstract class Sandwich {

	// This is the template method that defines the overall sandwich-making process
	public final void makeSandwich() {
		cutBread();
		addPaneer();
		addVegetables();
		addCondiments();
		wrapSandwich();
	}

	// These are the abstract methods that subclasses need to implement
	protected abstract void addPaneer();

	protected abstract void addVegetables();

	protected abstract void addCondiments();

	// These are the concrete methods that define the overall sandwich-making process
	protected void cutBread() {
		System.out.println("Cutting the bread");
	}

	protected void wrapSandwich() {
		System.out.println("Wrapping the sandwich");
	}
}
