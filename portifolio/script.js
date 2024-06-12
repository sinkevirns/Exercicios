function loadPage(page) {
    fetch(page)
        .then(response => response.text())
        .then(data => {
            document.getElementById('content').innerHTML = data;
            document.getElementById('intro').style.display = 'none';
        })
        .catch(error => console.error('Error loading page:', error));
}

document.getElementById("meuTextarea").readOnly = true;