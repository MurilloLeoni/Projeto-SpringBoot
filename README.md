# 📦 Course API

API REST desenvolvida em **Java 21** com **Spring Boot 3**, seguindo boas práticas de arquitetura e organização em camadas (entities, repositories, services e resources).  
O projeto implementa um sistema de gerenciamento de pedidos, produtos, usuários e categorias, incluindo tratamento de exceções e integração com banco de dados.

## 🚀 Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3**
  - Spring Web (REST)
  - Spring Data JPA
- **Maven**
- **H2 Database** (banco em memória para testes)
- **JPA/Hibernate**
- **Postman** (para testes dos endpoints)

## 🏗 Arquitetura do Projeto

O projeto segue o padrão de camadas:
```text
course/
 ├── entities/          # Classes de domínio (User, Order, Product...)
 ├── repositories/      # Interfaces JPA para acesso a dados
 ├── services/          # Regras de negócio
 ├── resources/         # Controladores REST (endpoints)
 ├── config/            # Configurações (ex.: seed de dados)
 └── exceptions/        # Tratamento de exceções personalizado
```

## 📌 Funcionalidades

- Cadastro e listagem de **usuários**
- Cadastro e listagem de **produtos**
- Cadastro e listagem de **categorias**
- Cadastro e listagem de **pedidos**
- Relacionamento entre entidades (um usuário pode ter vários pedidos, pedidos têm vários produtos etc.)
- Tratamento de erros com respostas padronizadas em JSON

## 🔗 Endpoints Principais

| Método | Endpoint       | Descrição                |
|-------|----------------|------------------------|
| GET   | `/users`       | Lista todos os usuários |
| GET   | `/users/{id}`  | Busca usuário por ID    |
| POST  | `/users`       | Cadastra novo usuário   |
| PUT   | `/users/{id}`  | Atualiza usuário        |
| DELETE| `/users/{id}`  | Remove usuário          |

> Endpoints semelhantes existem para **products**, **categories** e **orders**.

## 🛠 Como Executar

1. **Clonar o repositório**
```bash
git clone https://github.com/seu-usuario/course-api.git
cd course-api
```
2. **Rodar o projeto com Maven**
```bash
./mvnw spring-boot:run
```
3. **A API estará disponível em:**
```bash
http://localhost:8080
```
4. **Acesse o H2 Console para inspecionar o banco em memória:**
```bash
http://localhost:8080/h2-console
```
Use as credenciais padrão do application.properties.
