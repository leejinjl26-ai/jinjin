package task4;

public class SongMain {

	public static void main(String[] args) {
		 Song s1 = new Song("World's Smallest Violin", "AJR");
		 
		 System.out.println("제목: " + s1.title + ", 가수: " + s1.artist);
		 s1.play();
	}

}
