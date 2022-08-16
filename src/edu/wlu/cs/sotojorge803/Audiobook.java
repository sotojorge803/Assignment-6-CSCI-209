package edu.wlu.cs.sotojorge803;
/**
 * @author Jorge Soto-Ventura
 *
 */
public class Audiobook extends MediaItem {

	// Instance Variable
	
	private String author;
	private String narrator;
	/**
	 * @param title Title of the AudioBook
	 * @param trackInCollection Is track in collection
	 * @param playingTime Time of AudioBook
	 * @param copyrightYear Copyright year of AudioBook
	 * @param author Author of the AudioBook
	 * @param narrator Narrator of the AudioBook
	 */
	public Audiobook(String title, boolean trackInCollection, int playingTime, int copyrightYear, String author, String narrator) {
		super(title, trackInCollection, playingTime, copyrightYear);
		this.author = author;
		this.narrator = narrator;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}


	/**
	 * @return the narrator
	 */
	public String getNarrator() {
		return narrator;
	}

	
	/**
	 * @return toString of AudioBooks
	 */
	@Override
	public String toString() {
		return "Title: " + title + ", Author: " + author + ", Narrator: " + narrator + ", Track In Collection: "
				+ trackInCollection + ", Playing Time: " + playingTime + " minutes" + ", Copyright Year: " + copyrightYear;
	}

	/**
	 * @param AudioBook use AudioBook objects to implement and use class methods
	 */
	public static void main(String[] args) {
		Audiobook LordOfTheRings= new Audiobook("Lord Of The Rings", true, 1, 1923, "J.R.R Tolkien", "John Doe");
		LordOfTheRings.getAuthor();
		
	}

}
