# Workshop MongoDB - Spring WebFlux

Este projeto é uma aplicação backend desenvolvida com **Spring WebFlux** e **MongoDB**. Ele implementa serviços para gerenciar usuários e postagens em um blog, com a capacidade de realizar operações CRUD e pesquisas avançadas.

## Requisitos

- **Java 11** ou superior
- **MongoDB**: Você pode usar uma instância local ou uma hospedada em um serviço como o MongoDB Atlas.

## Tecnologias Usadas

- **Spring Boot** com **Spring WebFlux** para programação reativa
- **MongoDB** para banco de dados NoSQL
- **Reactor** para programação assíncrona e reativa
- **DTO (Data Transfer Object)** para representar os dados entre as camadas da aplicação
- **UriComponentsBuilder** para construir URLs para respostas de criação

## Configuração do Projeto

### 1. Configurar o MongoDB

Certifique-se de que o MongoDB está instalado e em execução em sua máquina ou use um banco de dados em nuvem, como o **MongoDB Atlas**.

Se você estiver usando o MongoDB localmente, a configuração padrão de conexão será `mongodb://localhost:27017/` no arquivo `application.properties`.

Se estiver usando o MongoDB Atlas, adicione as credenciais de conexão no arquivo `application.properties`:

```properties
spring.data.mongodb.uri=mongodb+srv://<username>:<password>@<cluster-url>/<database>

### 2. Dependências Maven
<dependencies>
    <!-- Spring Boot WebFlux -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-webflux</artifactId>
    </dependency>

    <!-- MongoDB -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-mongodb</artifactId>
    </dependency>

    <!-- Lombok (facilita o código) -->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <scope>provided</scope>
    </dependency>

    <!-- Spring Boot Starter Test -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
### 3. Estrutura do Projeto
com.devsuperior.workshopmongo.controllers: Contém os controladores REST que expõem as APIs.

PostController: Controlador para gerenciamento de postagens (CRUD e pesquisa).
UserController: Controlador para gerenciamento de usuários (CRUD).
com.devsuperior.workshopmongo.services: Contém os serviços que executam a lógica de negócios.

PostService: Serviço para operações sobre postagens.
UserService: Serviço para operações sobre usuários.
com.devsuperior.workshopmongo.dto: Contém os DTOs (Data Transfer Objects) que são usados para transferir dados entre as camadas.

PostDTO: Representa os dados de uma postagem.
UserDTO: Representa os dados de um usuário.
4. Endpoints da API
Usuários
GET /users: Retorna todos os usuários.
GET /users/{id}: Retorna um usuário específico pelo ID.
POST /users: Cria um novo usuário.
PUT /users/{id}: Atualiza um usuário existente.
DELETE /users/{id}: Exclui um usuário pelo ID.
Postagens
GET /posts/{id}: Retorna uma postagem específica pelo ID.
GET /posts/titlesearch: Pesquisa postagens por título.
GET /posts/fullsearch: Pesquisa avançada de postagens, com filtro por texto e intervalo de datas.
GET /posts/user/{id}: Retorna todas as postagens de um usuário específico.

### 4. Execucão do Projeto
Para rodar o projeto, você pode usar o Spring Boot Maven Plugin:

Clone este repositório:


git clone https://github.com/seu_usuario/WorkshopMongo.git
Navegue até o diretório do projeto:


cd WorkshopMongo
Compile e execute o projeto com o Maven:


mvn spring-boot:run
A aplicação estará disponível em http://localhost:8080.


