# 📚 Sistema de Biblioteca

Exercício de fixação de Programação Orientada a Objetos em Java, cobrindo classes abstratas, herança, polimorfismo, interfaces e tratamento de exceções.

## 🧠 Conceitos aplicados

- Classes e objetos
- Construtores
- Encapsulamento
- Herança
- Polimorfismo (sem uso de `instanceof`)
- Classe abstrata
- Interface
- Associação entre classes
- Tratamento de exceções (`try/catch`, `throw`)

## 🗂 Estrutura do projeto

```
src/
├── application/
│   └── Main.java
├── domain/
│   ├── interfaces/
│   │   └── Emprestavel.java
│   ├── livro/
│   │   └── Livro.java
│   └── pessoa/
│       ├── Pessoa.java
│       ├── Cliente.java
│       └── Funcionario.java
└── util/
    └── ImpressoraPessoa.java
```

## 📖 Descrição das classes

### `Pessoa` (abstrata)
Classe base com os atributos `nome` e `idade`, e o método abstrato `exibirTipo()`, implementado de forma diferente por cada subclasse.

### `Cliente` extends `Pessoa`
Representa um cliente da biblioteca. Guarda o livro atualmente emprestado (`Livro livro`) e a quantidade de livros já emprestados (`livrosEmprestados`).

### `Funcionario` extends `Pessoa`
Representa um funcionário da biblioteca, com o atributo adicional `salario`.

### `Emprestavel` (interface)
Contrato para objetos que podem ser emprestados. Define o método:
```java
void emprestar(Cliente cliente);
```

### `Livro` implements `Emprestavel`
Representa um livro com `titulo`, `autor` e o status `emprestado`. Ao chamar `emprestar()`:
- Se estiver disponível, associa o livro ao cliente e marca como emprestado.
- Se já estiver emprestado, lança uma `RuntimeException("Livro já está emprestado.")`.

### `ImpressoraPessoa` (utilitária)
Método estático `imprimirPessoa(Pessoa pessoa)` que imprime nome, idade e tipo de qualquer `Pessoa`, usando polimorfismo — sem `instanceof`.

## ▶️ Exemplo de saída

```
Nome: Maria
Idade: 24
Funcionário
Livro emprestado com sucesso.
Livro já está emprestado.
```

## 🚀 Como executar

```bash
javac -d bin src/application/Main.java src/domain/pessoa/*.java src/domain/livro/*.java src/domain/interfaces/*.java src/util/*.java
java -cp bin application.Main
```

## 🔭 Possíveis evoluções

- [ ] Método `devolver()` para liberar o livro
- [ ] Limite de 3 empréstimos simultâneos por cliente (exige trocar `Livro livro` por uma lista)
- [ ] Enum `CategoriaLivro` (ROMANCE, TECNOLOGIA, HISTORIA, FANTASIA)
- [ ] Sobrescrita de `toString()` em `Livro`

## 🛠 Tecnologias

- Java (JDK 8+)
