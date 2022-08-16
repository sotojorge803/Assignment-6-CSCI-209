package edu.wlu.cs.sotojorge803;
/**
 * @author Jorge Soto-Ventura
 *
 */

public class CD extends MediaItem {
	// Instance Variables
	private String artist;
	private int numberOfTracks;
	/**
	 * @param title Title of the CD
	 * @param trackInCollection Is track in collection
	 * @param playingTime Time of CD
	 * @param copyrightYear Copyright year of CD
	 * @param artist Name of Artist of CD
	 * @param numberOfTracks Amount of Tracks on CD
	 */
	public CD(String title, boolean trackInCollection, int playingTime, int copyrightYear, String artist, int numberOfTracks) {
		super(title, trackInCollection, playingTime, copyrightYear);
		this.artist = artist;
		this.numberOfTracks = numberOfTracks;
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * @return the numberOfTracks
	 */
	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	/**
	 * @return toString for CD
	 */
	@Override
	public String toString() {
		return "Title: " + title + ", Artist: " + artist + ", Number of Tracks: " + 
		numberOfTracks + ", Track In Collection: " + trackInCollection + ", Playing Time: " +
		playingTime + " minutes" +  ", Copyright Year: "+ copyrightYear;
	}



	/**
	 * @param CD Use CD objects to implement methods
	 */
	public static void main(String[] args) {
		// TODO Add various statements to test if CD is functioning
		CD Damn = new CD("Damn", false, 50, 2020, "Jorge", 4);
		
		System.out.println(Damn);
		
		System.out.println(Damn.getPlayingTime());
		

		
	}

}
