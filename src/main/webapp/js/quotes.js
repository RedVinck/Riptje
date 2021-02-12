getQuotes();

async function getQuotes() {
	let response = await fetch("/ManageQuoteServlet?command=quotes");
	let quotes = await response.json();
	showQuotes(quotes);
	await getQuotes();
}

// alternatieve code die het zelfde doet
/*
function getQuotes() {
	fetch("/ManageQuoteServlet?command=quotes").then(response => response.json()).then(quotes => showQuotes(quotes));
}*/

function showQuotes (quotes) {
	let quoteDiv = document.getElementById("quotes");
	quoteDiv.innerHTML= "";
	for(let i=0; i<quotes.length; i++) {
		quoteDiv.innerHTML += "<p>"+ quotes[i].text + " by " + quotes[i].author + "</p>";
	}
	// alternatieve code die hetzelfde doet
	/*
	setTimeout(getQuotes, 1000);
	*/
}
