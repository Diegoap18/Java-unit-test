# Testes Unitarios de Java
Neste Repositório demostro um pouco sobre diferentes tipos de teste unitários de Java.<br>
Vamos criar uma classe Calculadora e vamos realizar os principais tipos de teste nessa classe.


## Ferramentas Comuns de Teste em Java

| Ferramenta | Descrição |
|------------|-----------|
| **JUnit 5** | Framework principal de testes para Java |
| **Mockito** | Framework popular para criar e gerenciar objetos mock |
| **AssertJ** | Biblioteca para asserções fluentes e legíveis |
| **Hamcrest** | Biblioteca que fornece objetos matcher para asserções de testes |
| **PowerMock** | Extensão do Mockito para testar métodos estáticos/finais e construtores |
| **TestNG** | Framework alternativo de teste com recursos avançados |
| **Selenium** | Framework para automação de testes de UI/web |
| **Cucumber** | Framework para desenvolvimento orientado a comportamento (BDD) |
| **JaCoCo** | Ferramenta de análise de cobertura de código Java |
| **PIT** | Sistema de teste de mutação para Java |


## Principais Tipos de Testes Unitários em Java

| Categoria | Tipo de Teste | Descrição |
|-----------|---------------|-----------|
| **Por Categoria de Teste** | Testes Unitários Básicos | Testar métodos ou funções individuais isoladamente |
| | Testes de Integração | Testar a interação entre componentes ou sistemas |
| | Testes Funcionais | Testar funcionalidade completa a partir da perspectiva do usuário |
| | Testes de Regressão | Garantir que bugs previamente corrigidos não reapareçam |
| | Testes Parametrizados | Executar o mesmo teste com diferentes parâmetros de entrada |
| | Testes de Desempenho | Avaliar o desempenho do sistema sob condições específicas |
| **Por Foco do Teste** | Testes Positivos | Verificar se o código funciona corretamente com entradas válidas |
| | Testes Negativos | Verificar se o código lida apropriadamente com entradas inválidas |
| | Testes de Limites | Testar o comportamento nos limites de intervalos de entrada válidos |
| | Testes de Exceção | Verificar o tratamento adequado de exceções em situações de erro |
| | Testes de Cobertura | Garantir que todos os caminhos do código sejam executados durante os testes |
| **Por Técnica de Teste** | Teste de Estado | Verificar se os métodos alteram o estado do objeto corretamente |
| | Teste de Comportamento | Verificar se os objetos interagem entre si corretamente |
| | Teste de Caixa Preta | Testar funcionalidade sem conhecimento da implementação interna |
| | Teste de Caixa Branca | Testar com conhecimento da implementação interna |
| | Teste Orientado a Dados | Usar arquivos de dados para fornecer entradas de casos de teste e resultados esperados |
| | Teste de Mutação | Alterar deliberadamente o código para verificar se os testes detectam as mudanças |


## Dicas para Bons Testes Unitários

1. **Mantenha os testes pequenos e focados**
   - Cada teste deve verificar apenas um comportamento ou aspecto específico

2. **Use nomes descritivos**
   - O nome do teste deve explicar o que está sendo testado e o resultado esperado
   - Ex: `deveRetornarTrueQuandoEmailForValido()`

3. **Isole os testes**
   - Os testes não devem depender de outros testes ou da ordem de execução
   - Use mocks ou stubs para isolar dependências externas

4. **Evite lógica condicional nos testes**
   - Os testes devem seguir um caminho linear e previsível
   - Se você precisa testar múltiplos cenários, crie múltiplos testes

5. **Siga a regra F.I.R.S.T.**
   - **F**ast (Rápido): Os testes devem ser executados rapidamente
   - **I**solated (Isolado): Os testes não devem depender uns dos outros
   - **R**epeatable (Repetível): Os testes devem ser consistentes em qualquer ambiente
   - **S**elf-validating (Auto-validável): Os testes devem determinar automaticamente se passam ou falham
   - **T**imely (Oportuno): Os testes devem ser escritos junto com o código ou antes
  

## Como Executar os Testes

```bash
# Usando Maven
mvn test

# Usando Gradle
gradle test
```

## Author:
  - Diego Pereira
  - Email: diegoap18@gmail.com
    

