# Projeto Spring WebFlux + MongoDB

Este projeto é uma implementação simples usando Spring WebFlux com MongoDB. O Spring WebFlux é uma estrutura baseada na nova pilha reativa do Spring 5 que permite o desenvolvimento de aplicações não bloqueantes e eventos assíncronos.

## Arquivos no Projeto

Aqui estão os principais arquivos e diretórios no repositório:

- **.gitignore**: Contém regras para ignorar arquivos não necessários no controle de versão.
  - [Visualizar .gitignore](https://github.com/calebewerneckcouto/SpringWebFlux-MongoDB/blob/main/.gitignore)

- **.mvn**: Diretório contendo scripts de suporte para o Maven Wrapper.
  - [Ver diretório .mvn](https://github.com/calebewerneckcouto/SpringWebFlux-MongoDB/tree/main/.mvn)

- **mvnw** e **mvnw.cmd**: Scripts do Maven Wrapper para Linux e Windows respectivamente que permitem executar o projeto sem ter o Maven instalado globalmente.
  - [Visualizar mvnw](https://github.com/calebewerneckcouto/SpringWebFlux-MongoDB/blob/main/mvnw)
  - [Visualizar mvnw.cmd](https://github.com/calebewerneckcouto/SpringWebFlux-MongoDB/blob/main/mvnw.cmd)

- **pom.xml**: Arquivo de configuração do Maven com dependências e configurações do projeto.
  - [Visualizar pom.xml](https://github.com/calebewerneckcouto/SpringWebFlux-MongoDB/blob/main/pom.xml)

- **src**: Diretório contendo o código fonte do projeto.
  - [Ver diretório src](https://github.com/calebewerneckcouto/SpringWebFlux-MongoDB/tree/main/src)

## Instruções de Configuração

1. **Clone o projeto**: 
   ```bash
   git clone https://github.com/calebewerneckcouto/SpringWebFlux-MongoDB.git
   ```

2. **Navegue até o diretório do projeto**:
   ```bash
   cd SpringWebFlux-MongoDB
   ```

3. **Execute o projeto usando o Maven Wrapper**:
   - No Linux/Mac:
     ```bash
     ./mvnw spring-boot:run
     ```
   - No Windows:
     ```cmd
     mvnw.cmd spring-boot:run
     ```

## Dependências Principais

- Spring Boot
- Spring WebFlux
- MongoDB Reactive (para integração reativa com MongoDB)

## Contribuição

Contribuições são sempre bem-vindas! Para contribuir, por favor crie um fork do repositório, faça suas alterações e envie um Pull Request.

---

Este projeto é ideal para quem está buscando entender o funcionamento de aplicações reativas com Java e quer explorar as integrações modernas com bancos NoSQL como o MongoDB.