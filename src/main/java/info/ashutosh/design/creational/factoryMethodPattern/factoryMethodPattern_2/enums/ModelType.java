package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.enums;

public enum ModelType {

	PLATINA("PLATINA"), DISCOVER("DISCOVER"), PULSER("PULSER");

	final String modelType;

	ModelType(String modelType) {
		this.modelType = modelType;
	}

	public String getNotifyType() {
		return modelType;
	}

}
