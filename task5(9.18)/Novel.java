package task5;

public class Novel extends Book{
	private String genre;

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("장르: "+ genre);
	

}
}
