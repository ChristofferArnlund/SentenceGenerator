import java.util.Random;
public class SentenceGenerator {
	public static void main(String[] args) {
		Random rand = new Random();
		String[] substantiv = {"gubben", "presidenten", "hela tjocka släkten", "mjölby kommun"}; //Bestämd form eller egennamn.
		String[] verb = {"har ett problem med", "är i hemlighet", "har förråt"}; //Dåtidsform.

		String sub1 = substantiv[rand.nextInt(substantiv.length)];
		String v = verb[rand.nextInt(verb.length)];
		String sub2 = substantiv[rand.nextInt(substantiv.length)];

		System.out.println(sub1 + " " + v + " " + sub2 + ".");
	}
}
