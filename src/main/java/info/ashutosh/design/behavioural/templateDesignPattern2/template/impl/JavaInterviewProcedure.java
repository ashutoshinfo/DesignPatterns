package info.ashutosh.design.behavioural.templateDesignPattern2.template.impl;

import info.ashutosh.design.behavioural.templateDesignPattern2.template.ConcreteInterviewProcedure;

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
