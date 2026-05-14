# Entrega — Modularização e Subprogramas

## Nome completo

Nevez Duneves

## Turma

(Preencher com sua turma)

---

# Descrição das tarefas

## Tarefa 1 — Controle acadêmico em Java

Foi desenvolvido um sistema capaz de cadastrar 5 alunos, receber 3 notas de cada um, calcular a média e informar a situação acadêmica de cada estudante.

Primeiramente foi criada uma versão monolítica, com toda a lógica dentro do método `main`. Em seguida, o código foi refatorado utilizando subprogramas.

## Tarefa 2 — Sistema de vendas em Python

Foi desenvolvido um sistema que recebe informações de produtos, quantidade e preço unitário, calcula subtotal, desconto e total final.

Inicialmente foi construída uma versão monolítica e depois modularizada com funções.

## Tarefa 3 — Passagem por valor em Java

Foi criado um programa para demonstrar como Java realiza passagem de parâmetros com tipos primitivos.

## Tarefa 4 — Objetos e referência em Java

Foi criado um programa para analisar como objetos se comportam quando são enviados para métodos.

## Tarefa 5 — Projeto livre

Foi desenvolvido um sistema de estoque com estrutura modular.

---

# Instruções de execução

## Java

### Compilar

```bash
javac NomeArquivo.java
```

### Executar

```bash
java NomeArquivo
```

## Python

### Executar

```bash
python nome_arquivo.py
```

---

# Comparação entre versão monolítica e modularizada

## Legibilidade

Na versão monolítica, o código ficou funcional, porém mais difícil de acompanhar. Conforme o programa crescia, encontrar partes específicas se tornava mais trabalhoso.

Na versão modularizada, cada função passou a representar uma responsabilidade clara, tornando a leitura muito mais natural.

## Reutilização

Na versão monolítica praticamente não existe reutilização, já que tudo está concentrado em um único bloco.

Na versão modularizada várias funções podem ser reutilizadas em outros projetos ou em novas funcionalidades.

## Facilidade de manutenção

Na versão monolítica qualquer alteração exigia analisar um bloco muito grande de código.

Na versão modularizada, mudanças podem ser feitas em funções específicas sem impactar o restante.

## Clareza do fluxo

A modularização deixou o fluxo mais intuitivo, permitindo entender rapidamente a sequência das operações.

## Tamanho dos métodos

O método principal da versão monolítica ficou extenso.

Na versão modularizada os métodos ficaram menores e com responsabilidades específicas.

## Coesão

A versão modularizada apresentou maior coesão, pois cada método executa apenas uma tarefa.
