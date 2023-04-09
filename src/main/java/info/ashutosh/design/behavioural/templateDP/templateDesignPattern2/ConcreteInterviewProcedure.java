package info.ashutosh.design.behavioural.templateDP.templateDesignPattern2;

public abstract class ConcreteInterviewProcedure implements InterviewProcedure {

	@Override
	public boolean aptitudeTest() {
		System.out.println("ConcreteInterviewProcedure.aptitudeTest()");
		return true;
	}

	@Override
	public boolean generelDiscussionTest() {
		System.out.println("ConcreteInterviewProcedure.generelDiscussionTest()");
		return true;
	}

	@Override
	public abstract boolean technicalWrittenTest();

	@Override
	public abstract boolean technicalInterviewTest();

	@Override
	public boolean hRInterviewTest() {
		System.out.println("ConcreteInterviewProcedure.hRInterviewTest()");
		return true;
	}

	public final boolean recruitmentDrive() {

		if (!aptitudeTest()) {
			return false;
		}
		if (!generelDiscussionTest()) {
			return false;
		}
		if (!technicalWrittenTest()) {
			return false;
		}
		if (!technicalInterviewTest()) {
			return false;
		}
		if (!hRInterviewTest()) {
			return false;
		}
		return true;
	}
}
