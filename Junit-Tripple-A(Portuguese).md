# Testes Unitários em Java com o Padrão Triple A

## O que é o Padrão Triple A (Arrange-Act-Assert)?

O padrão Triple A é uma metodologia para estruturar testes unitários de forma clara e organizada. Este padrão divide cada teste em três seções distintas:

### 1. Arrange (Preparar)
Nesta fase, preparamos tudo o que é necessário para o teste:
- Criação de objetos
- Configuração de mocks/stubs
- Inicialização de variáveis
- Definição dos dados de entrada
- Configuração de pré-condições

### 2. Act (Agir)
Esta é a fase onde executamos a operação que está sendo testada:
- Chamada do método que está sendo testado
- Execução da função ou comportamento sob teste

### 3. Assert (Verificar)
Na fase final, verificamos se o resultado da operação corresponde ao esperado:
- Comparação do resultado obtido com o resultado esperado
- Verificação se exceções foram ou não lançadas
- Confirmação de que o estado do sistema é o esperado após a execução

## Benefícios do Padrão Triple A

- **Legibilidade**: Estrutura clara que torna os testes mais fáceis de entender
- **Manutenibilidade**: Facilita a manutenção e atualização dos testes
- **Isolamento**: Promove a separação clara entre a configuração e a verificação
- **Documentação**: Serve como documentação viva do comportamento esperado do código

## Exemplos

### Exemplo 1: Teste de Calculadora

```java
@Test
public void testSoma() {
    // Arrange
    Calculadora calculadora = new Calculadora();
    int a = 5;
    int b = 3;
    
    // Act
    int resultado = calculadora.somar(a, b);
    
    // Assert
    assertEquals(8, resultado);
}
```

### Exemplo 2: Teste com Mock

```java
@Test
public void testServicoCliente() {
    // Arrange
    RepositorioCliente repositorioMock = mock(RepositorioCliente.class);
    Cliente cliente = new Cliente("1", "Maria Silva");
    when(repositorioMock.buscarPorId("1")).thenReturn(cliente);
    ServicoCliente servico = new ServicoCliente(repositorioMock);
    
    // Act
    Cliente resultado = servico.buscarClientePorId("1");
    
    // Assert
    assertNotNull(resultado);
    assertEquals("Maria Silva", resultado.getNome());
    verify(repositorioMock).buscarPorId("1");
}
```

### Exemplo 3: Teste de Exceção

```java
@Test
public void testDivisaoPorZero() {
    // Arrange
    Calculadora calculadora = new Calculadora();
    
    // Act & Assert
    assertThrows(ArithmeticException.class, () -> {
        calculadora.dividir(10, 0);
    });
}
```

### Exemplo 4: Teste com Lista

```java
@Test
public void testFiltragem() {
    // Arrange
    List<String> nomes = Arrays.asList("Ana", "João", "Maria", "José", "Antonio");
    FiltroNomes filtro = new FiltroNomes();
    
    // Act
    List<String> resultado = filtro.filtrarPorLetraInicial(nomes, 'A');
    
    // Assert
    assertEquals(2, resultado.size());
    assertTrue(resultado.contains("Ana"));
    assertTrue(resultado.contains("Antonio"));
}
```

## Dicas para Bons Testes Unitários

1. **Mantenha os testes pequenos e focados**
   - Cada teste deve verificar apenas um comportamento ou aspecto específico

2. **Use nomes descritivos**
   - O nome do teste deve explicar o que está sendo testado e o resultado esperado
   - Ex: `deveRetornarTrueQuandoEmailForValido()`

3. **Isole os testes**
   - Testes não devem depender de outros testes nem de ordem de execução
   - Use mocks ou stubs para isolar dependências externas

4. **Evite lógica condicional em testes**
   - Testes devem seguir um caminho linear e previsível
   - Se precisar testar múltiplos cenários, crie múltiplos testes

5. **Siga a regra F.I.R.S.T.**
   - **F**ast (Rápido): Testes devem executar rapidamente
   - **I**solated (Isolado): Testes não devem depender uns dos outros
   - **R**epeatable (Repetível): Testes devem ser consistentes em qualquer ambiente
   - **S**elf-validating (Auto-validante): Testes devem determinar automaticamente se passaram ou falharam
   - **T**imely (Oportuno): Testes devem ser escritos junto com o código ou antes

## Ferramentas Comuns para Testes em Java

- **JUnit 5**: Framework de testes
- **Mockito**: Framework para criação de mocks
- **AssertJ**: Biblioteca para asserções fluentes
- **Hamcrest**: Biblioteca para matchers
- **PowerMock**: Extensão do Mockito para casos avançados

## Como Executar os Testes

```bash
# Usando Maven
mvn test

# Usando Gradle
gradle test
```
