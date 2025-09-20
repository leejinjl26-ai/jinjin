package task5;

public class TextBook extends Book{
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	
	
	
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("과목: "+ subject);
		
		
	}
}
