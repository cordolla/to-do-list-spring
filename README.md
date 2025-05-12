# 📝 TaskManager - Gerenciador de Tarefas

Aplicação web simples para gerenciamento de tarefas, com autenticação, utilizando **Spring Boot** e **banco de dados relacional**.

---

## 🚀 Começando

Essas instruções permitirão que você obtenha uma cópia do projeto funcionando localmente para fins de desenvolvimento e testes.

Consulte a seção 📦 **Implantação** para saber como implantar o projeto em ambiente de produção.

---

## 📋 Pré-requisitos

Antes de começar, você vai precisar ter instalado:

- **Java 17+**
- **Maven 3.8+**
- **IDE** (recomendada: IntelliJ IDEA ou VSCode com suporte a Spring Boot)
- **Banco de dados PostgreSQL** (ou H2 se preferir)

---

## 🔧 Instalação

Siga os passos abaixo para configurar o ambiente:

1. **Clone o repositório**:
    ```bash
    git clone https://github.com/cordolla/to-do-list-spring
    cd taskmanager
    ```

2. **Crie um banco de dados** no PostgreSQL com nome `taskmanager` e configure as credenciais no arquivo `application.properties`.

3. **Execute a aplicação**:
    ```bash
    ./mvnw spring-boot:run
    ```

4. **Acesse o endpoint**:
   Abra o navegador e acesse:
    ```arduino
    http://localhost:8080
    ```

---

## ✅ Funcionalidades

- **Cadastro de usuários** com senha criptografada
- **Autenticação via Basic Auth**
- **Criação de tarefas** vinculadas a usuários
- **Validação de datas** (início e fim)
- **Atualização** apenas por quem criou a tarefa
- **Filtro automático** por usuário autenticado
- **Camada de exceção global** para erros de requisição

---

## ⚙️ Executando os testes

O projeto ainda não possui testes automatizados implementados. Porém, a arquitetura está preparada para receber testes com **JUnit** e **Mockito**.

---

## 🔩 Testes de ponta a ponta

Você pode testar os endpoints utilizando ferramentas como **Postman** ou **Insomnia**:

- **POST** `/users` - Cria um novo usuário
- **POST** `/tasks/` - Cria uma tarefa (com autenticação)
- **GET** `/tasks/` - Lista as tarefas do usuário autenticado
- **PUT** `/tasks/{id}` - Atualiza a tarefa (se for do usuário)

---

## 📦 Implantação

Você pode implantar este projeto em qualquer serviço que suporte Java, como:

- **Heroku**
- **Railway**
- **Render**
- **VPS com Docker**

Basta configurar as variáveis de ambiente e o banco de dados.

---

## 🛠️ Construído com

- **Spring Boot** - Framework principal
- **Spring Data JPA** - Persistência de dados
- **PostgreSQL** - Banco de dados
- **BCrypt** - Criptografia de senhas
- **Maven** - Gerenciador de dependências

---

## ✒️ Autores

- **Seu Nome** — Desenvolvimento completo do sistema  

---

## 🎁 Expressões de gratidão

- **Divulgue este projeto** 📢
- **Dê uma estrela** ⭐ no repositório

Obrigado pela visita 🫂