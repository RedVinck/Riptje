window.onload = getNewCoin;

function getNewCoin () {
    fetch("ManageQuoteServlet?command=getCoin")
        .then(response => response.json())
        .then(data => showCoin(data));
}

function showCoin (data) {
    let quoteDiv = document.getElementById("quote");
    let quoteParagraph = quoteDiv.childNodes[0];

    if (quoteParagraph == null) {
        quoteParagraph = document.createElement('p');
        quoteParagraph.id = "quoteText";
        let quoteText = document.createTextNode(data.rate);
        quoteParagraph.appendChild(quoteText);
        quoteDiv.appendChild(quoteParagraph);
    }
    else {
        let quoteText = document.createTextNode(data.rate);
        quoteParagraph.removeChild(quoteParagraph.childNodes[0]);
        quoteParagraph.appendChild(quoteText);
    }
    setTimeout(getNewCoin, 1000);
}