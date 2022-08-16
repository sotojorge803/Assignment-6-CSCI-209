/**
 * 
 */
package edu.wlu.cs.sotojorge803;

/**
 * @author Jorge Soto-Ventura
 *
 */
public abstract class MediaItem implements Comparable<MediaItem> {

	
	
	// Instance Variables
	protected String title;
	protected boolean trackInCollection;
	protected int playingTime;
	protected int copyrightYear;
	
	
	// Constructor Classes
	/**
	 * @param title Title of the Media Item
	 * @param trackInCollection Is track in collection
	 * @param playingTime Time of Media Item
	 * @param copyrightYear Copyright year of Media Item
	 */
	public MediaItem(String title, int playingTime, int copyrightYear) {
		this(title, true, playingTime, copyrightYear);
	}
	/**
	 * @param title Title of the Media Item
	 * @param trackInCollection Is track in collection
	 * @param playingTime Time of Media Item
	 * @param copyrightYear Copyright year of Media Item
	 */
	public MediaItem(String title, boolean trackInCollection, int playingTime, int copyrightYear) {
		super();
		this.title = title;
		this.trackInCollection = trackInCollection;
		this.playingTime = playingTime;
		this.copyrightYear = copyrightYear;
	}
	

	// Setters and Getters 
	/**
	 * @return Returns title of Media Item
	 */
	
	public String getTitle() {
		return title;
	}

	/**
	 * @return Returns Copyright Year of Media Item
	 */
	
	public int getCopyrightYear() {
		return copyrightYear;
	}
	/**
	 * @return Checks to see if Track is in the Collection
	 */
	
	public boolean isTrackInCollection() {
		return trackInCollection;
	}

	/**
	 * 
	 * @param trackInCollection Boolean of whether track is in Collection
	 */
	
	public void setTrackInCollection(boolean trackInCollection) {
		this.trackInCollection = trackInCollection;
	}
	/**
	 * @return The playing time for Media Item
	 */
	public int getPlayingTime() {
		System.out.println("Media Item's getPlayingTime in Minutes" + playingTime);
		System.out.println("Media Item's getPlayingtime in Hours and Minutes" + " " + (playingTime/60) + ":"+ (playingTime % 60));
		return playingTime;
	}
	/**
	 * @return The toString override for MediaItem
	 */
	@Override
	public String toString() {
		return "Title:" + title + ", Track In Collection:" + trackInCollection + ", Playing Time:" + playingTime
				+ ", Copyright Year:" + copyrightYear;
	}
	/**
	 * @return the artist
	 */
	@Override
	public int compareTo(MediaItem o) {
		// Compares the media item to another selected Media Item
		return 0;
	}
	
}
