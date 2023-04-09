package info.ashutosh.design.behavioural.templateDP.templateDesignPattern2.impl;

import info.ashutosh.design.behavioural.templateDP.templateDesignPattern2.ConcreteInterviewProcedure;

public class JavaInterviewProcedure extends ConcreteInterviewProcedure {

	@Override
	public boolean technicalWrittenTest() {
		System.out.println("JavaInterviewProcedure.technicalWrittenTest()");
		return true;
	}

	@Override
	public boolean technicalInterviewTest() {
		System.out.println("JavaInterviewProcedure.technicalInterviewTest()");
		return true;
	}

}
