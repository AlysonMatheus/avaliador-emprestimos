📝 Avaliador de Empréstimos
🎯 Objetivo do Projeto

Esta é uma API REST desenvolvida para analisar a elegibilidade de clientes a diferentes tipos de empréstimos — Pessoal, Consignado e Com Garantia — com base em perfis específicos que consideram renda mensal, idade e localização geográfica.

O projeto foi construído com foco em Código Limpo (Clean Code), boas práticas de arquitetura e escalabilidade, utilizando padrões de projeto que facilitam a manutenção e a evolução de regras de negócio mais complexas.

🛠️ Tecnologias Utilizadas

Java 21
Utilizado para aproveitar recursos modernos da linguagem, como Records.

Spring Boot 3.x
Framework principal para construção da API REST, oferecendo produtividade, injeção de dependência e suporte a testes.

Lombok
Redução de código boilerplate (getters, construtores, etc.).

Maven
Gerenciamento de dependências e automação do build.

JUnit 5 & MockMvc
Implementação de testes automatizados e testes de integração da API.

🏛️ Arquitetura e Padrões de Projeto
🔹 Strategy Pattern

Cada modalidade de empréstimo possui sua própria estratégia de avaliação:

PersonalStrategy

ConsignedStrategy

GuaranteedStrategy

Isso permite:

Adicionar novas modalidades sem alterar código existente

Manter as regras de negócio desacopladas

Melhorar a legibilidade e manutenção do projeto

🔹 Injeção de Dependência

O LoanService recebe automaticamente todas as estratégias disponíveis via Spring, permitindo uma orquestração simples e flexível da lógica de avaliação.

🔹 DTOs (Data Transfer Objects)

Uso de Records para definir contratos claros de entrada e saída da API:

UserRequest → Dados do cliente

LoanResponse → Modalidades disponíveis

UserResponse → Resposta final da API

🚀 Como Executar o Projeto
1️⃣ Clonar o repositório
git clone https://github.com/AlysonMatheus/avaliador-emprestimos.git

2️⃣ Importar no IntelliJ

Abrir o IntelliJ

Importar o projeto como Maven Project

3️⃣ Executar a aplicação

Rodar a classe principal:

AvaliadorEmprestimosApplication

4️⃣ Endpoint principal
POST http://localhost:8080/loans


(ou /customer-loans, conforme configuração do controller)

🧪 Testes Automatizados

O projeto conta com testes de integração que validam o fluxo completo da API.

🔹 Ferramenta

MockMvc para simular requisições HTTP

🔹 O que é validado

Retorno HTTP 200 OK

Estrutura e integridade do JSON de resposta

Lista de empréstimos elegíveis para o cliente

🔹 Como rodar os testes

Abra a classe LoanControllerTest

Clique com o botão direito

Selecione Run 'LoanControllerTest'

📁 Estrutura de Pastas Principal
src/main/java
 ├── controller   → Exposição dos endpoints REST
 ├── loan         → Estratégias de regras de negócio (Strategy Pattern)
 ├── service      → Orquestração da lógica de avaliação
 └── dto          → Objetos de entrada e saída da API

src/test/java
 └── controller   → Testes automatizados da API
