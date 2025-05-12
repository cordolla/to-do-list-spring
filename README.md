📝 ToDoList - Gerenciador de Tarefas
Aplicação web simples de gerenciamento de tarefas com autenticação, utilizando Spring Boot e banco de dados relacional.

🚀 Começando
Essas instruções permitirão que você obtenha uma cópia do projeto funcionando localmente para fins de desenvolvimento e testes.

Consulte a seção 📦 Implantação para saber como implantar o projeto em ambiente de produção.

📋 Pré-requisitos
Antes de começar, você vai precisar ter instalado:

Java 17+

Maven 3.8+

IDE (recomendada: IntelliJ IDEA ou VSCode com suporte a Spring Boot)

Banco de dados PostgreSQL (ou H2 se preferir)

🔧 Instalação
Siga os passos abaixo para configurar o ambiente:

Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/seu-usuario/todolist.git
cd todolist
Crie um banco de dados no PostgreSQL com nome todolist e configure as credenciais no arquivo application.properties.

Execute a aplicação:

bash
Copiar
Editar
./mvnw spring-boot:run
Acesse o endpoint:

arduino
Copiar
Editar
http://localhost:8080
✅ Funcionalidades
Cadastro de usuários com senha criptografada

Autenticação via Basic Auth

Criação de tarefas vinculadas a usuários

Validação de datas (início e fim)

Atualização apenas por quem criou a tarefa

Filtro automático por usuário autenticado

Camada de exceção global para erros de requisição

⚙️ Executando os testes
O projeto ainda não possui testes automatizados implementados. Porém, a arquitetura está preparada para receber testes com JUnit e Mockito.

🔩 Testes de ponta a ponta
Você pode testar os endpoints utilizando ferramentas como Postman ou Insomnia:

POST /users - cria usuário

POST /tasks/ - cria tarefa (com autenticação)

GET /tasks/ - lista tarefas do usuário autenticado

PUT /tasks/{id} - atualiza tarefa (se for do usuário)

⌨️ Testes de estilo de codificação
Recomenda-se seguir o padrão de código do Spring Boot e utilizar ferramentas como:

Checkstyle

SpotBugs

SonarLint

📦 Implantação
Você pode implantar este projeto em qualquer serviço que suporte Java:

Heroku

Railway

Render

VPS com Docker

Basta configurar as variáveis de ambiente e o banco de dados.

🛠️ Construído com
Spring Boot - Framework principal

Spring Data JPA - Persistência de dados

PostgreSQL - Banco de dados

BCrypt - Criptografia de senhas

Maven - Gerenciador de dependências

✒️ Autores
Marcelo Barbosa — Desenvolvimento completo do sistema
@seu-usuario-no-github

🎁 Expressões de gratidão
Divulgue este projeto 📢

Dê uma estrela ⭐ no repositório

Me chame pra um café ☕ ou uma breja 🍻

Obrigado pela visita 🫂

