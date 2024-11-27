# Projeto CRUD: Gerenciamento de Clientes e Carros

Este projeto é uma aplicação CRUD simples desenvolvida com **Spring Boot** e **MySQL**. Ele permite o gerenciamento de clientes e carros por meio de endpoints REST, incluindo operações para criar, listar, atualizar e excluir registros.

## 🚀 Funcionalidades

- **Clientes**:
  - Adicionar, listar, atualizar e deletar clientes.
- **Carros**:
  - Adicionar, listar, atualizar e deletar carros.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.4.0**
- **Gradle**
- **MySQL**
- **Postman** (para testes)
- **MySQL Workbench** (para gerenciamento do banco de dados)

---

## ⚙️ Como Configurar o Ambiente

1. **Pré-requisitos**:
   - Instale o [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html).
   - Instale o [MySQL](https://dev.mysql.com/downloads/installer/).
   - Instale o [Postman](https://www.postman.com/downloads/).

2. **Configuração do Banco de Dados**:
   - Crie um banco de dados chamado `gestao_clientes_carros` no MySQL.
   - Configure o arquivo `application.properties` com suas credenciais do MySQL:

     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/gestao_clientes_carros
     spring.datasource.username=seu_usuario
     spring.datasource.password=sua_senha
     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
     ```

3. **Clonando o Repositório**:
   - Clone o projeto para sua máquina:
     ```bash
     git clone https://github.com/seu-usuario/nome-do-repositorio.git
     cd nome-do-repositorio
     ```

4. **Executando o Projeto**:
   - Compile e execute o projeto:
     ```bash
     ./gradlew bootRun
     ```

---

## 📋 Endpoints Disponíveis

Utilize o Postman para testar os endpoints:

### **Clientes**
- **Criar Cliente**: `POST /clientes`
  - Corpo (JSON):
    ```json
    {
        "nome": "João Silva",
        "email": "joao.silva@example.com",
        "idade": 30
    }
    ```

- **Listar Clientes**: `GET /clientes`

- **Buscar Cliente por ID**: `GET /clientes/{id}`

- **Atualizar Cliente**: `PUT /clientes/{id}`
  - Corpo (JSON):
    ```json
    {
        "nome": "João Souza",
        "email": "joao.souza@example.com",
        "idade": 31
    }
    ```

- **Deletar Cliente**: `DELETE /clientes/{id}`

### **Carros**
- **Criar Carro**: `POST /carros`
  - Corpo (JSON):
    ```json
    {
        "modelo": "Civic",
        "marca": "Honda",
        "ano": 2022
    }
    ```

- **Listar Carros**: `GET /carros`

- **Buscar Carro por ID**: `GET /carros/{id}`

- **Atualizar Carro**: `PUT /carros/{id}`
  - Corpo (JSON):
    ```json
    {
        "modelo": "Corolla",
        "marca": "Toyota",
        "ano": 2023
    }
    ```

- **Deletar Carro**: `DELETE /carros/{id}`

---

## 📝 Comandos Úteis

- **Iniciar o projeto**:
  ```bash
  ./gradlew bootRun
