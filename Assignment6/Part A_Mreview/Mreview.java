import java.util.*;
	
public class Mreview implements Comparable<Mreview>
{
  	// instance variables
 	private String title;   // title of the movie
 	private ArrayList<Integer> ratings; // list of ratings stored in a Store object

  	// 3 constructors
  	public Mreview(){
  		this.title = "";
  		ratings = new ArrayList<Integer>();
  	}

  	public Mreview(String ttl){
  		this.title = ttl;
  		ratings = new ArrayList<Integer>();
  	}

  	public Mreview(String ttl, int firstRating){
  		this.title = ttl;
  		ratings = new ArrayList<Integer>();
  		ratings.add(firstRating);
  	}

  	// 7 methods
  	public String getTitle(){
  		return title;
  	}

  	public void addRating(int r){
  		ratings.add(r);
  	}

  	public double aveRating(){
  		double sum = 0;
  		for(int r : ratings){
  			sum += r;
  		}
  		return sum / numRatings();
  	}

  	public int numRatings(){
  		return ratings.size();
  	}

  	public int compareTo(Mreview obj){
  		return title.compareTo(obj.title);
  	}

  	public boolean equals(Object obj){
  		if(obj instanceof Mreview){
  			return title.equals(((Mreview) obj).title);
  		}
  		return false;
  	}

  	public String toString(){
  		return title + ", average " + aveRating() + " out of " + numRatings() + " ratings";
  	}

  	public static void main(String[] args) {
  		Mreview m = new Mreview("Kill Bill", 3);
  		m.addRating(4);
  		m.addRating(3);
  		System.out.println(m.toString());
  	}
}