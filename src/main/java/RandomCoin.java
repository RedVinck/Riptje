
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/ManageQuoteServlet")
public class RandomCoin extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private Coin coin;

	public RandomCoin() {
		super();
		coin = new Coin("Escobar");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String command = request.getParameter("command");
			switch (command) {
				case ("getCoin"):
					Coin coins = new Coin("Escobar");
					String quoteJSON = quoteToJSON(coins);
					response.setContentType("application/json");
					response.getWriter().write(quoteJSON);
					break;
				default:
					System.out.println("Failed");
					break;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}


	private String quotesToJSON(List<Coin> quotes) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(quotes);
	}

	private String quoteToJSON(Coin quote) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(quote);
	}
}