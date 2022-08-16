package edu.wlu.cs.sotojorge803;
/**
 * @author Jorge Soto-Ventura
 *
 */
public class DVD extends MediaItem {
	//Instance Variables
	private String rating;
	private int bonusFeature;
	/**
	 * @param title Title of the DVD
	 * @param trackInCollection Is track in collection
	 * @param playingTime Time of DVD
	 * @param copyrightYear Copyright year of DVD
	 * @param rating Rating of the DVD
	 * @param bonusFeatures The length of the bonus features
	 */
	public DVD(String title, boolean trackInCollection, int playingTime, int copyrightYear, String rating, int bonusFeature) {
		super(title, trackInCollection, playingTime, copyrightYear);
		this.rating = rating;
		this.bonusFeature = bonusFeature;
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}


	/**
	 * @return the bonusFeature
	 */
	public double getBonusFeature() {
		return bonusFeature;
	}
	
	/**
	 * @return the totalPlayingTime
	 */
	@Override
	public int getPlayingTime() {
		
		return(bonusFeature + playingTime);
	
	}
	
	@Override
	public String toString() {
		return "Title: " + title + ", Rating: " + rating + ", Bonus Feature: " + bonusFeature +  ", Track In Collection: "
				+ trackInCollection + ", Playing Time: " + playingTime + " minutes" + ", Copyright Year: " + copyrightYear;
	}
	
	/**
	 * @param DVD Use DVD objects to implement methods
	 */
	public static void main(String[] args) {
		DVD GoneWithTheWind = new DVD("Gone With The Wind", true, 180, 1920, "PG-13", 30);
		GoneWithTheWind.getPlayingTime();
	}

}
