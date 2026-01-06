📝 Avaliador de Empréstimos
🎯 Objetivo do Projeto
Esta é uma API REST desenvolvida para analisar a elegibilidade de clientes a diferentes tipos de empréstimos (Pessoal, Consignado e com Garantia) com base em perfis específicos que consideram renda mensal, idade e localização geográfica.

O projeto foi construído focando em Código Limpo (Clean Code) e escalabilidade, utilizando padrões de projeto para facilitar a manutenção de regras de negócio complexas.

🛠️ Tecnologias Utilizadas
Java 21: Versão utilizada para aproveitar recursos como Records.

Spring Boot 4.0.1: Framework principal para a construção da API.

Lombok: Para redução de código boilerplate (construtores e acessores).

Maven: Gerenciador de dependências e automação de build.

JUnit 5 & MockMvc: Para a implementação de testes automatizados.

🏛️ Arquitetura e Padrões de Projeto
Strategy Pattern: Cada modalidade de empréstimo possui sua própria classe de estratégia (ConsignedStrategy, PersonalStrategy, GuaranteedStrategy), permitindo que novas regras sejam adicionadas sem modificar o código existente.

Injeção de Dependência: O LoanService recebe automaticamente uma lista de todas as estratégias disponíveis via Spring.

DTO (Data Transfer Objects): Uso de Records para definir contratos claros de entrada (UserRequest) e saída (UserResponse, LoanResponse).

🚀 Como Executar o Projeto
Clonar o repositório:

Bash

git clone https://github.com/AlysonMatheus/avaliador-emprestimos.git
Importar no IntelliJ como um projeto Maven.

Executar a aplicação através da classe AvaliadorEmprestimosApplication.

Endpoint principal: POST http://localhost:8080/loans (ou /customer-loans conforme sua configuração).

🧪 Testes Automatizados
O projeto conta com testes de integração que validam o fluxo completo da API.

Ferramenta: MockMvc para simular requisições HTTP.

Resultado: Validação de status 200 OK e integridade do JSON de resposta.

Para rodar os testes:

No IntelliJ, abra a classe LoanControllerTest.

Clique com o botão direito e selecione Run 'LoanControllerTest'.

📁 Estrutura de Pastas Principal
src/main/java/.../controller: Exposição dos endpoints da API.

src/main/java/.../Loan: Implementações das regras de negócio (Strategies).

src/main/java/.../services: Orquestração da lógica de avaliação.

src/test/java: Suíte de testes automatizados.
