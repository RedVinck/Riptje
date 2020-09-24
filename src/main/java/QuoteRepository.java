import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteRepository {

	private List<Quote> quotes = new ArrayList<Quote>();

	public QuoteRepository() {
		super();
		Quote obama = new Quote("Obama", "Yes we can!", 2009);
		quotes.add(obama);
		Quote king = new Quote("Martin Luther King", "I Have a Dream", 1950);
		quotes.add(king);
		Quote x = new Quote("XXX", "Great is the art of beginning, but greater is the art of ending.", 1945);
		quotes.add(x);
		Quote jobs = new Quote("Steve Jobs", "Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma – which is living with the results of other people's thinking.", 2000);
		quotes.add(jobs);
		Quote roosevelt = new Quote("Theodore Roosevelt", "It is hard to fail, but it is worse never to have tried to succeed.", 1945);
		quotes.add(roosevelt);
		Quote unknown = new Quote("unknown", "Strive for progress, not perfection", 2020);
		quotes.add(unknown);
		Quote obi = new Quote("Obi-Wan Kenobi", "The Force will be with you. Always.", 1988);
		quotes.add(obi);
	}

	public List<Quote> getQuotes () {
		return quotes;
	}

	public void addQuote (String quote) {
		quotes.add(new Quote("Elke Steegmans", quote, 2020));
	}

	public Quote getRandomQuote() {
		Random random = new Random();
		int position = random.nextInt(quotes.size());
		Quote quote = quotes.get(position);
		return quote;
	}

}
