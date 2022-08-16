
package edu.wlu.cs.sotojorge803;

/**
 * @author Jorge Soto-Ventura
 *
 */
import java.util.Arrays;

public class Driver {
	
	/**
	 * @param MediaItem MediaItem objects to be added to a array
	 */
	
	public static void main(String[] args) {
		
			//Instances 
		
			CD MoneyTrees = new CD("MoneyTrees", true, 6, 2021, "Kendrick Lamar", 1);
			
			CD Damn = new CD("Damn", false, 50, 2020, "Kendrick Lamar", 4);
			
			DVD GoneWithTheWind = new DVD("Gone With The Wind", true, 180, 1920, "PG-13", 30);
			
			DVD Interstellar = new DVD("Interstellar", false, 120, 2017, "PG-13", 0);
			
			Audiobook HarryPotter = new Audiobook("Harry Potter", true, 300, 2000, "J.K Rowling", "Hank Hill");
			
			Audiobook LordOfTheRings = new Audiobook("Lord Of The Rings", true, 500, 1923, "J.R.R Tolkien", "John Doe");
			
			MediaItem[] mediaCollection = new MediaItem[] {MoneyTrees, GoneWithTheWind , Damn , Interstellar, HarryPotter, LordOfTheRings};
			//Mutator Methods and Print Statements
			
			for(int i = 0; i <= mediaCollection.length - 1; i++) {
				
				System.out.println(mediaCollection[i]);
				
				if(mediaCollection[i].isTrackInCollection() != true) {

					mediaCollection[i].setTrackInCollection(true);
				
					System.out.println(mediaCollection[i].getTitle() + " is now in the Library");
				}
			Arrays.sort(mediaCollection);

				
			}
		
	}	
}
