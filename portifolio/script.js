function loadPage(page) {
    // Função chamada 'loadPage' que aceita um parâmetro chamado 'page'

    fetch(page)
        // Usa a API Fetch para fazer uma requisição para a URL fornecida pelo parâmetro 'page'
        .then(response => response.text())
        // Quando a resposta é recebida, ela é convertida em texto
        .then(data => {
            // O texto recebido é então processado na função seguinte
            document.getElementById('content').innerHTML = data;
            // O conteúdo da resposta (data) é inserido no elemento HTML com o id 'content'
            document.getElementById('intro').style.display = 'none';
            // O elemento HTML com o id 'intro' tem seu estilo alterado para 'display: none', ocultando-o
        })
        .catch(error => console.error('Error loading page:', error));
        // Se ocorrer algum erro durante a requisição ou no processamento da resposta, o erro é capturado e uma mensagem de erro é exibida no console
}
