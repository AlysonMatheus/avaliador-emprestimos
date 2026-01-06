📝 Avaliador de Empréstimos

🎯 Objetivo

API REST desenvolvida para avaliar a elegibilidade de clientes a empréstimos (Pessoal, Consignado e Com Garantia) com base em renda, idade e localização.
O projeto aplica Clean Code, boas práticas de arquitetura e padrões de projeto, simulando um cenário real de regras de negócio financeiras.


🛠️ Tecnologias

Java 21 (Records)

Spring Boot 3.x

Maven

Lombok

 MockMvc


🏛️ Arquitetura

Strategy Pattern
Cada tipo de empréstimo possui sua própria estratégia (Personal, Consigned, Guaranteed), permitindo fácil extensão e manutenção das regras.

Injeção de Dependência
O LoanService recebe automaticamente as estratégias via Spring.

DTOs com Records
UserRequest, LoanResponse e UserResponse definem contratos claros de entrada e saída.


🚀 Execução
git clone https://github.com/AlysonMatheus/avaliador-emprestimos.git


Executar a classe:

AvaliadorEmprestimosApplication


Endpoint:

POST http://localhost:8080/loans


🧪 Testes

Testes de integração com MockMvc

Validação de:

Status 200 OK

Estrutura do JSON de resposta

Modalidades de empréstimo elegíveis

Execução:

Rodar a classe LoanControllerTest


📁 Estrutura do Projeto
src/main/java
 ├── controller → Endpoints REST
 ├── loan       → Estratégias de negócio
 ├── service    → Lógica de avaliação
 └── dto        → DTOs da API

src/test/java
 └── controller → Testes automatizados
