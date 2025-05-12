# 📝 ToDoList API - Spring Boot

API RESTful para gerenciamento de tarefas com autenticação via Basic Auth. Os usuários podem se cadastrar, fazer login e manipular tarefas (CRUD), com verificação de permissão para alteração de dados.

---

## 🚀 Tecnologias utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Web**
- **Spring Data JPA**
- **Hibernate**
- **H2 Database (banco em memória)**
- **Lombok**
- **BCrypt (criptografia de senhas)**
- **Jakarta Servlet**
- **Favre BCrypt**
- **UUID como identificador**

---

## 📂 Estrutura do Projeto

src
└── main
└── java
└── br.com.marcelocordolla.todolist
├── errors
│ └── ExceptionHandlerController
├── filter
│ └── FilterTaskAuth
├── task
│ ├── TaskController
│ ├── TaskModel
│ └── ITaskRepository
├── user
│ ├── UserController
│ ├── UserModel
│ └── IUserRepository
├── utils
│ └── Utils
└── TodolistApplication

yaml
Copiar
Editar

---

## 🔐 Autenticação

A API usa **Basic Auth** para proteger as rotas de tarefas (`/tasks`). O filtro personalizado (`FilterTaskAuth`) valida usuário e senha usando BCrypt.

---

## 👤 Endpoints de Usuário

### `POST /users/`

- Cria um novo usuário.
- Verifica se o username já existe.
- Senha é criptografada com BCrypt.

```json
{
  "username": "usuario123",
  "name": "Marcelo",
  "password": "senha123"
}
✅ Endpoints de Tarefa (Requer autenticação)
POST /tasks/
Cria uma nova tarefa vinculada ao usuário autenticado.

Valida se datas são futuras e coerentes.

json
Copiar
Editar
{
  "title": "Estudar Spring",
  "description": "Estudar REST e JPA",
  "startAt": "2025-05-13T10:00:00",
  "endAt": "2025-05-13T12:00:00",
  "priority": "alta"
}
GET /tasks/
Retorna as tarefas do usuário autenticado.

PUT /tasks/{id}
Atualiza os campos não nulos de uma tarefa, se for do usuário autenticado.

Utiliza método utilitário para copiar apenas os campos preenchidos (Utils.copyNonNullProperties()).

❗ Tratamento de Erros
Exceções de requisição malformada são tratadas pela classe ExceptionHandlerController.

Mensagens específicas de erro são retornadas com status 400 (Bad Request).

🧪 Testar com cURL ou Postman
Exemplo de autenticação Basic:
bash
Copiar
Editar
Authorization: Basic base64(username:senha)
🧠 Regras de Negócio
Usuários não podem alterar tarefas de outros.

Datas inválidas não são aceitas.

O título da tarefa deve ter até 50 caracteres.

▶️ Como rodar
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/seuusuario/todolist-spring.git
cd todolist-spring
Rode o projeto com Maven ou dentro do IntelliJ (botão "Run").

Acesse a API em:

arduino
Copiar
Editar
http://localhost:8080
🧑‍💻 Autor
Marcelo Barbosa

📃 Licença
Este projeto está licenciado sob a MIT License. A licença está declarada no código-fonte do projeto (não é armazenada em banco de dados).