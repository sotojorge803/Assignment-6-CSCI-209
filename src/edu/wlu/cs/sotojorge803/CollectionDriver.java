/**
 * 
 */
package edu.wlu.cs.sotojorge803;
/**
 * @author Jorge Soto-Ventura
 *
 */
import java.util.ArrayList;


/**
 * @author Jorge Soto-Ventura
 *
 */
public class CollectionDriver {

	/**
	 * @param MediaItem Media Items to be added to ArrayList
	 * 	 
	 */
	public static void main(String[] args) {
		
		// Create ArrayList
		
		ArrayList<MediaItem> mediaCollection  = new ArrayList<MediaItem>();
		
		CD MoneyTrees = new CD("MoneyTrees", true, 6, 2021, "Kendrick Lamar", 1);
		
		CD Damn = new CD("Damn", false, 50, 2020, "Kendrick Lamar", 4);
		
		DVD GoneWithTheWind = new DVD("Gone With The Wind", true, 180, 1920, "PG-13", 30);
		
		DVD Interstellar = new DVD("Interstellar", false, 120, 2017, "PG-13", 0);
		
		Audiobook HarryPotter = new Audiobook("Harry Potter", true, 300, 2000, "J.K Rowling", "Hank Hill");
		
		Audiobook LordOfTheRings= new Audiobook("Lord Of The Rings", true, 500, 1923, "J.R.R Tolkien", "John Doe");
		
		//Put MediaItems into the ArrayList
		
		mediaCollection.add(LordOfTheRings);
		mediaCollection.add(HarryPotter);
		mediaCollection.add(Interstellar);
		mediaCollection.add(GoneWithTheWind);
		mediaCollection.add(MoneyTrees);
		mediaCollection.add(Damn);
		
		for( int i = 0; i < mediaCollection.size(); i++) {
			System.out.println(mediaCollection.get(i));
			
		}
		System.out.println(mediaCollection.get(2).isTrackInCollection());
	}

}
