# 🚀 Demo DAO JDBC

Projeto desenvolvido em Java para demonstrar o acesso a banco de dados utilizando JDBC e a implementação do padrão DAO (Data Access Object).

## 📖 Sobre o Projeto

Este projeto foi criado com o objetivo de praticar conceitos fundamentais de persistência de dados em Java, aplicando boas práticas de organização e separação de responsabilidades através do padrão DAO.

A aplicação realiza operações CRUD em um banco de dados MySQL utilizando JDBC puro, sem frameworks ORM.

## 🛠 Tecnologias Utilizadas

* Java
* JDBC
* MySQL
* Git
* GitHub
* IntelliJ IDEA

## 📂 Estrutura do Projeto

```text
src
├── application
│   └── Program.java
│
├── db
│   ├── DB.java
│   ├── DbException.java
│   └── DbIntegrityException.java
│
├── model
│   ├── entities
│   │   ├── Department.java
│   │   └── Seller.java
│   │
│   ├── dao
│   │   ├── DepartmentDao.java
│   │   ├── SellerDao.java
│   │   └── DaoFactory.java
│   │
│   └── dao.impl
│       ├── DepartmentDaoJDBC.java
│       └── SellerDaoJDBC.java
```

## ⚙️ Funcionalidades

### Seller

* Buscar vendedor por ID
* Buscar vendedores por departamento
* Buscar todos os vendedores
* Inserir vendedor
* Atualizar vendedor
* Remover vendedor

### Department

* Buscar departamento por ID
* Buscar todos os departamentos
* Inserir departamento
* Atualizar departamento
* Remover departamento

## 🗄️ Configuração do Banco de Dados

Crie um arquivo `db.properties` na raiz do projeto:

```properties
user=root
password=sua_senha
dburl=jdbc:mysql://localhost:3306/coursejdbc
useSSL=false
```

Certifique-se de que o banco de dados esteja criado e configurado corretamente.

## ▶️ Como Executar

Clone o repositório:

```bash
git clone https://github.com/levipaixao/demo-dao-jdbc.git
```

Entre na pasta do projeto:

```bash
cd demo-dao-jdbc
```

Configure o arquivo `db.properties`.

Adicione o MySQL Connector/J ao projeto.

Execute a classe:

```java
application.Program
```

## 📚 Conceitos Aplicados

* JDBC API
* DAO Pattern
* Factory Method
* Programação Orientada a Objetos
* Tratamento de Exceções
* Interfaces e Implementações
* CRUD
* MySQL

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido para consolidar conhecimentos em:

* Conexão Java ↔ Banco de Dados
* Manipulação de dados com JDBC
* Arquitetura baseada em DAO
* Boas práticas de organização de código
* Versionamento com Git e GitHub

## 👨‍💻 Autor

Levi Paixão

GitHub:
https://github.com/levipaixao

LinkedIn:
https://www.linkedin.com/in/levi-paixao-4b78043a5/<img width="1242" height="802" alt="Captura de tela 2026-06-10 185931" src="https://github.com/user-attachments/assets/c7d47e40-0869-4e97-a0f8-491d215548e4" />
<img width="436" height="563" alt="Captura de tela 2026-06-10 185856" src="https://github.com/user-attachments/assets/d712a58b-0a9f-4720-a2c3-7043df160966" />
