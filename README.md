# Atividade EBAC — Operações Avançadas da Stream API

Este projeto foi desenvolvido durante meus estudos de Java Back-end na EBAC. A atividade consiste em montar um catálogo simples de produtos e praticar operações com Stream API e Optional.

## O que foi feito

- Criar uma lista de produtos com nome e preço.
- Filtrar os produtos com preço maior que R$ 100.
- Ordenar os produtos pelo nome em ordem alfabética.
- Buscar um produto pelo nome.
- Usar `Optional` e `ifPresentOrElse()` para tratar os casos em que o produto é encontrado ou não.

## Conceitos praticados

- Classes, objetos, construtor e getters.
- `toString()` para exibir os dados dos produtos.
- Stream API: `filter()`, `sorted()` e `collect()`.
- `Comparator.comparing()` para ordenar pelo nome.
- `findFirst()`, `Optional` e `ifPresentOrElse()`.

## Estrutura do projeto

- `Main.java`: contém a lista de produtos e as operações da atividade.
- `Produto.java`: representa um produto, com nome e preço.

## Como executar

Abra o projeto em uma IDE Java, como o IntelliJ IDEA, e execute a classe `Main`.

Os produtos são mantidos em uma lista na memória, sem uso de banco de dados ou arquivos.

---

**Curso:** Back-end Java — EBAC
