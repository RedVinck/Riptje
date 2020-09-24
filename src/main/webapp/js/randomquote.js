window.onload = getNewQuote;

function getNewQuote () {
	fetch("ManageQuoteServlet?command=randomquote")
		.then(response => response.json())
		.then(data => showQuote(data));
}

function showQuote (quote) {
	let quoteDiv = document.getElementById("quote");
	let quoteParagraph = quoteDiv.childNodes[0];

	if (quoteParagraph == null) {
		quoteParagraph = document.createElement('p');
		quoteParagraph.id = "quoteText";
		let quoteText = document.createTextNode(quote.text);
		quoteParagraph.appendChild(quoteText);
		quoteDiv.appendChild(quoteParagraph);
	}
	else {
		let quoteText = document.createTextNode(quote.text);
		quoteParagraph.removeChild(quoteParagraph.childNodes[0]);
		quoteParagraph.appendChild(quoteText);
	}
	setTimeout(getNewQuote, 10000);
}

