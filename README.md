# API-Estoque


![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=%20Concluido&color=GREEN&style=for-the-badge)




## Descrição

API Rest implementado no Spring Boot com Java e MySql, onde há um cadastro de produtos e consigo fazer um CRUD com o banco de dados através da API. 

Esse é um projeto desafiador, pois ainda não tinha trabalhdo com Spring Boot e Rest, desafiado pela mentoria Conquiste sua vaga - 17 - pelos mentores Pedro Marins e Henrique de Andrade e sugerido por Arthur Scarpati.
Agradeço imensamente a todos.

##Passo a passo
1 - Clonar o repositório git clone https://github.com/adrianopavaneli/API-Estoque

2 - Rodar mvn clean install para instalar as dependências

3 - Rodar mvn spring-boot:run para subir a aplicação

4 - A aplicação estará disponível na port 8080

## Apresentação

A API conta com sistema de autenticação por token desenvolvido com o auth2.
<img src="https://github.com/adrianopavaneli/API-Estoque/blob/main/imagens/1erroautenticacao.jpg" alt="drawing" width="700"/>

Tem que ser gerado o token para efetuar transações com a API.
<img src="https://github.com/adrianopavaneli/API-Estoque/blob/main/imagens/geracaotoken.jpg" alt="drawing" width="700"/>

Aqui efetuamos o GET para CONSULTAR de todos os itens do banco de dados de Produtos.
<img src="https://github.com/adrianopavaneli/API-Estoque/blob/main/imagens/get.jpg" alt="drawing" width="700"/>

Aqui efetuamos o POST para INSERIR itens no banco de dados de Produtos.
<img src="https://github.com/adrianopavaneli/API-Estoque/blob/main/imagens/post.jpg" alt="drawing" width="700"/>
e veja a inserção do item no banco de dados.
<img src="https://github.com/adrianopavaneli/API-Estoque/blob/main/imagens/banco%20post.jpg" alt="drawing" width="700"/>

Aqui efetuamos o PUT para ALTERAÇÃO do item no banco de dados de Produtos.
<img src="https://github.com/adrianopavaneli/API-Estoque/blob/main/imagens/put.jpg" alt="drawing" width="700"/>
e veja a alteração do item no banco de dados.
<img src="https://github.com/adrianopavaneli/API-Estoque/blob/main/imagens/banco%20put.jpg" alt="drawing" width="700"/>

Aqui efetuamos o DELETE para EXCLUSÃO o item no banco de dados de Produtos.
<img src="https://github.com/adrianopavaneli/API-Estoque/blob/main/imagens/delete.jpg" alt="drawing" width="700"/>
e veja a exclusão do item no banco de dados.
<img src="https://github.com/adrianopavaneli/API-Estoque/blob/main/imagens/banco%20delete.jpg" alt="drawing" width="700"/>






