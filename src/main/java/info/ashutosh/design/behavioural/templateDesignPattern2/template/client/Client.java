package info.ashutosh.design.behavioural.templateDesignPattern2.template.client;

import info.ashutosh.design.behavioural.templateDesignPattern2.template.impl.JavaInterviewProcedure;

public class Client {
	public static void main(String[] args) {
		JavaInterviewProcedure procedure = new JavaInterviewProcedure();
		System.out.println("Java Recruitment: " + procedure.recruitmentDrive());
	}

}
