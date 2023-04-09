package info.ashutosh.design.behavioural.templateDP.templateDesignPattern2.client;

import info.ashutosh.design.behavioural.templateDP.templateDesignPattern2.impl.JavaInterviewProcedure;

public class Client {
	public static void main(String[] args) {
		JavaInterviewProcedure procedure = new JavaInterviewProcedure();
		System.out.println("Java Recruitment: " + procedure.recruitmentDrive());
	}

}
