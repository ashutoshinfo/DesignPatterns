package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.enums;

public enum NotifyType {

	SMS("SMS"), PUSH("PUSH"), EMAIL("EMAIL");

	final String notifyType;

	NotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	public String getNotifyType() {
		return notifyType;
	}

}
