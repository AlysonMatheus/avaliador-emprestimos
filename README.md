📝 Avaliador de Empréstimos

🎯 Objetivo

API REST desenvolvida para avaliar a elegibilidade de clientes a empréstimos (Pessoal, Consignado e Com Garantia) com base em renda mensal, idade e localização geográfica.
O projeto aplica Clean Code, boas práticas de arquitetura e padrões de projeto, simulando regras de negócio do setor financeiro.

🛠️ Tecnologias

Java 21

Spring Boot 3.x

Maven

Lombok

JUnit 5 & MockMvc

🏛️ Arquitetura

Strategy Pattern
Cada modalidade de empréstimo possui sua própria estratégia (PERSONAL, CONSIGNED, GUARANTEED), permitindo fácil manutenção e extensão das regras.

Injeção de Dependência
O LoanService recebe automaticamente todas as estratégias via Spring.

DTOs com Records
Contratos claros de entrada e saída (UserRequest, LoanResponse, UserResponse).

🚀 Execução
git clone https://github.com/AlysonMatheus/avaliador-emprestimos.git


Executar a classe:

AvaliadorEmprestimosApplication


Endpoint principal

POST http://localhost:8080/loans

📥 Exemplo de Requisição
{
  "name": "Alyson",
  "cpf": "275.484.389-23",
  "age": 21,
  "income": 5000.00,
  "location": "SP"
}

📤 Exemplo de Resposta
{
  "customer": "Alyson",
  "loans": [
    {
      "type": "CONSIGNED",
      "interest_rate": 2
    },
    {
      "type": "GUARANTEED",
      "interest_rate": 3
    },
    {
      "type": "PERSONAL",
      "interest_rate": 4
    }
  ]
}

🧪 Testes

Testes de integração com MockMvc

Validação de:

Status 200 OK

Estrutura do JSON de resposta

Modalidades de empréstimo retornadas

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
