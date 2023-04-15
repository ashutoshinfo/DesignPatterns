package info.ashutosh.design.creational.prototypeDesignPattern.prototypeDP1.Product.impl;

public class Identity {
	private String id;

	public Identity(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Identity [id=" + id + "]";
	}

}
