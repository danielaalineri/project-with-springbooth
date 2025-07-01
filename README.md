# Projeto Web Services com Spring Boot e JPA / Hibernate

Este projeto é uma API RESTful desenvolvida em Java com Spring Boot, seguindo boas práticas de estruturação e persistência de dados com JPA e Hibernate. Ele simula um sistema de pedidos, com gerenciamento de usuários, produtos, pedidos e categorias.

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database (ambiente de teste)
- PostgreSQL (ambiente de produção)
- Maven

## 📁 Estrutura do projeto

- `entities/` – Entidades do modelo de domínio: User, Order, Product, Category, OrderItem.
- `repositories/` – Interfaces que estendem `JpaRepository` para acesso ao banco.
- `services/` – Camada de serviço com regras de negócio.
- `resources/` – Controladores REST da aplicação.

## 🔄 Funcionalidades implementadas

- Cadastro e listagem de usuários
- Criação e consulta de pedidos
- Associação de produtos a categorias
- Relacionamento de muitos para muitos entre produtos e categorias
- Pagamentos vinculados aos pedidos
- Respostas com códigos HTTP adequados
- Tratamento de exceções com `@ControllerAdvice`

## 🔧 Como executar localmente

1. Clone o repositório:

```bash
git clone https://github.com/danielaalineri/project-with-springbooth.git
cd project-with-springbooth

    Abra no seu IDE (VSCode, IntelliJ, etc.) e execute a aplicação via Spring Boot.

    Acesse o H2 Console para visualizar os dados (apenas em perfil test):

http://localhost:8080/h2-console

    Teste os endpoints usando o Postman, Insomnia ou diretamente via navegador:

GET http://localhost:8080/users
GET http://localhost:8080/orders

📄 Exemplos de entidades
Usuário

{
  "name": "Maria Brown",
  "email": "maria@gmail.com",
  "phone": "988888888",
  "password": "123456"
}

Pedido

{
  "moment": "2025-06-20T19:53:07Z",
  "status": "PAID",
  "client": { "id": 1 }
}

📝 Aprendizados

Durante o desenvolvimento deste projeto, foram explorados conceitos como:

    Injeção de dependência com @Autowired

    Relacionamentos @OneToMany, @ManyToMany, @EmbeddedId

    Serialização com Jackson e controle de ciclos com @JsonIgnore

    Criação de instâncias iniciais com CommandLineRunner

    Boas práticas em arquitetura RESTful

📌 Requisitos

    Java 17+

    Maven

    IDE com suporte a Spring Boot

📬 Contato

Desenvolvido por Daniela Alineri
Se você gostou, dê uma estrela ⭐ e contribua com sugestões!






