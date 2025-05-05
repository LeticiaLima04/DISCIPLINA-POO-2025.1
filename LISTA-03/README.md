# 📘 Exercícios de Programação Orientada a Objetos (POO)

Este repositório está estruturado para facilitar o acesso às questões organizadas em duas categorias:

- 📖 **Exercícios Resolvidos**: Questões que já possuem respostas e são disponibilizadas para estudo.  
- 📝 **Exercícios Propostos**: Questões que contêm apenas os enunciados e devem ser resolvidas pelos alunos.

Cada exercício foi desenvolvido para que possamos compreender e aplicar os conceitos fundamentais da Programação Orientada a Objetos (POO) na prática.

> **📌 As questões foram retiradas da apostila _"Fundamentos da Programação de Computadores"_ de Ana Fernanda Gomes Ascencio e Edilene Aparecida Veneruchi.  
> Todos os exercícios apresentados fazem parte do Capítulo 06 – Vetor e do Capítulo 08 - Sub-rotina.**

---

## 📚 Enunciados das Questões - CAP 06

### 📖 Exercícios Resolvidos

- [EXE1 - Números Primos e suas Posições](CAP-06/EXERCICIOS-RESOLVIDOS/Q1/src/br/edu/principal/Principal.java)  
  Faça um programa que preencha um vetor com nove números inteiros, calcule e mostre os números primos e suas respectivas posições.


- [EXE2 - Relatório de Vendas e Comissão do Vendedor](CAP-06/EXERCICIOS-RESOLVIDOS/Q2/src/br/edu/principal/Principal.java)  
  Uma pequena loja de artesanato possui apenas um vendedor e comercializa dez tipos de objetos. O vendedor recebe, mensalmente, salário de R$ 545,00, acrescido de 5% do valor total de suas vendas.  
  O valor unitário dos objetos deve ser informado e armazenado em um vetor; a quantidade vendida de cada peça deve ficar em outro vetor, mas na mesma posição.  
  Crie um programa que receba os preços e as quantidades vendidas, armazenando-os em seus respectivos vetores (ambos com tamanho dez). Depois, determine e mostre:

| Objeto | Quantidade Vendida | Valor Unitário (R$) | Valor Total (R$) |
|--------|---------------------|----------------------|------------------|
| 1      | ...                 | ...                  | ...              |
| 2      | ...                 | ...                  | ...              |
| ...    | ...                 | ...                  | ...              |
| 10     | ...                 | ...                  | ...              |

> Ao final:  
> - Mostrar valor geral das vendas.  
> - Mostrar valor da comissão (5%).  
> - Indicar valor do objeto mais vendido e sua posição.

---

- [EXE3 - Intercalação de Dois Vetores](CAP-06/EXERCICIOS-RESOLVIDOS/Q3/src/br/edu/principal/Principal.java)  
  Faça um programa que preencha dois vetores de dez elementos numéricos cada um e mostre o vetor resultante da intercalação deles.

| Posição | Vetor 1 | Vetor 2 | Intercalação |
|---------|---------|---------|--------------|
| 1       | 3       | 7       | 3            |
| 2       | 5       | 15      | 7            |
| 3       | 4       | 20      | 5            |
| ...     | ...     | ...     | ...          |

---

- [EXE4 - Separação de Números Positivos e Negativos](CAP-06/EXERCICIOS-RESOLVIDOS/Q4/src/br/edu/principal/Principal.java)  
  Faça um programa que preencha um vetor com oito números inteiros, calcule e mostre dois vetores resultantes:  
  - Um contendo os números positivos  
  - Outro contendo os números negativos.


- [EXE5 - Operações com Dois Vetores](CAP-06/EXERCICIOS-RESOLVIDOS/Q5/src/br/edu/principal/Principal.java)  
  Faça um programa que preencha dois vetores, X e Y, com dez números inteiros cada. Calcule e mostre os seguintes vetores resultantes:

#### ▶ Vetores a serem exibidos:
- União de X com Y (sem repetições)  
- Diferença entre X e Y (X - Y)  
- Soma posição a posição entre X e Y



- [EXE6 - Ordenação Decrescente de Vetor](CAP-06/EXERCICIOS-RESOLVIDOS/Q6/src/br/edu/principal/Principal.java)  
  Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre o vetor resultante de uma ordenação decrescente.


- [EXE7 - Preenchimento de Vetor em Ordem Crescente](CAP-06/EXERCICIOS-RESOLVIDOS/Q7/src/br/edu/principal/Principal.java)  
  Faça um programa que, no momento de preencher um vetor com oito números inteiros, já os armazene de forma crescente.


- [EXE8 - Junção e Ordenação de Dois Vetores](CAP-06/EXERCICIOS-RESOLVIDOS/Q8/src/br/edu/principal/Principal.java)  
  Faça um programa que preencha dois vetores com cinco elementos numéricos cada e, depois, ordene-os de maneira crescente.  
  Deverá ser gerado um terceiro vetor com dez posições, composto pela junção dos elementos dos vetores anteriores, também ordenado de maneira crescente.


- [EXE9 - Sistema de Reserva de Passagens Aéreas](CAP-06/EXERCICIOS-RESOLVIDOS/Q9/src/br/edu/principal/Principal.java)  
  Faça um programa que efetue reserva de passagens aéreas de uma companhia. O programa deverá ler informações sobre os voos (número, origem e destino) e o número de lugares disponíveis para doze aviões.  

  Depois da leitura, o programa deverá apresentar um menu com as seguintes opções:
  - Consultar:
    - por número do voo;
    - por origem;
    - por destino;
  - Efetuar reserva;
  - Sair.

| Situação              | Resposta                        |
|----------------------|----------------------------------|
| Voo e lugar disponíveis | Reserva confirmada              |
| Voo cheio               | Voo lotado                      |
| Voo inexistente         | Voo inexistente                 |

---

- [EXE10 - Correção de Provas de Múltipla Escolha](CAP-06/EXERCICIOS-RESOLVIDOS/Q10/src/br/edu/principal/Principal.java)  
  Faça um programa para corrigir provas de múltipla escolha. Cada prova tem oito questões e cada questão vale um ponto.  
  O primeiro conjunto de dados a ser lido é o gabarito da prova. Os outros dados são os números dos alunos e as respostas que deram às questões. Existem dez alunos matriculados.

#### O programa deve calcular e mostrar:
| Aluno | Nota |
|-------|------|
| 001   | ...  |
| 002   | ...  |
| ...   | ...  |

> Além disso, mostrar a porcentagem de aprovação, considerando nota mínima 6.


## 📚 Enunciados das Questões - CAP 08

### 📖 Exercícios Resolvidos

- [EXE1 - Cálculo de Salário Atual com Aumentos Progressivos](CAP-05/EXERCICIOS-RESOLVIDOS/Q1/src/br/edu/principal/Principal.java)  
  Um funcionário de uma empresa recebe, anualmente, aumento salarial. Sabe-se que:
  a) Esse funcionário foi contratado em 2005, com salário inicial de R$ 1.000,00.
  b) Em 2006, ele recebeu aumento de 1,5% sobre seu salário inicial.
  c) A partir de 2007 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano anterior.
  
  **Objetivo:**  
  Faça um programa que determine o salário atual desse funcionário.


- [EXE2 - Cálculo de Série com Fatoriais](CAP-05/EXERCICIOS-RESOLVIDOS/Q2/src/br/edu/principal/Principal.java)  
  Faça um programa que leia um valor N inteiro e positivo. Calcule e mostre o valor de E, conforme a fórmula a seguir:

  | E = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N! |


- [EXE3 - Tabela de Fatoriais de N Números](CAP-05/EXERCICIOS-RESOLVIDOS/Q3/src/br/edu/principal/Principal.java)  
  Faça um programa que leia um número N que indica quantos valores inteiros e positivos devem ser lidos a seguir. Para cada número lido, mostre uma tabela contendo o valor lido e o fatorial desse valor.


- [EXE4 - Estatísticas de Trânsito em Cidades](CAP-05/EXERCICIOS-RESOLVIDOS/Q4/src/br/edu/principal/Principal.java)  
  Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito.
  Foram obtidos os seguintes dados:
  a) código da cidade;
  b) número de veículos de passeio;
  c) número de acidentes de trânsito com vítimas.
  
  **Objetivos:**  
  a) Qual é o maior e qual é o menor índice de acidentes de trânsito e a que cidades pertencem?  
  b) Qual é a média de veículos nas cinco cidades juntas?  
  c) Qual é a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio?


- [EXE5 - Cálculo de Série Alternada com Fatoriais](CAP-05/EXERCICIOS-RESOLVIDOS/Q5/src/br/edu/principal/Principal.java)  
  Faça um programa que leia o número de termos e um valor positivo para X. Calcule e mostre o valor da série a seguir:
  
  | S = -X² + X³ - X⁴ + X⁵ - X⁶ + X⁷ - X⁸ + X⁹ - X¹⁰ + ... |


- [EXE6 - Cálculo de Salário e Auxílio Alimentação](CAP-05/EXERCICIOS-RESOLVIDOS/Q6/src/br/edu/principal/Principal.java)  
  Uma empresa possui dez funcionários com as seguintes características: código, número de horas trabalhadas no mês, turno de trabalho (M – matutino; V – vespertino; ou N – noturno), categoria (O – operário; ou G – gerente), valor da hora trabalhada. O programa deve:  
  a) Ler as informações dos funcionários, exceto o valor da hora trabalhada, não permitindo que sejam informados turnos e categorias inexistentes.  
  b) Calcular o valor da hora trabalhada conforme a tabela fornecida.
  
  **Tabela de Cálculo da Hora Trabalhada:**

  | Categoria | Turno | Valor da Hora Trabalhada |
  |-----------|-------|--------------------------|
  | G         | N     | 18% do salário mínimo     |
  | G         | M ou V| 15% do salário mínimo     |
  | O         | N     | 13% do salário mínimo     |
  | O         | M ou V| 10% do salário mínimo     |

  c) Calcular o salário inicial dos funcionários.  
  d) Calcular o valor do auxílio alimentação com base no salário inicial.

  **Tabela de Cálculo do Auxílio Alimentação:**

  | Salário Inicial  | Auxílio Alimentação |
  |------------------|---------------------|
  | Até R$ 300,00    | 20% do salário       |
  | Entre R$ 300,00 e R$ 600,00 | 15% do salário |
  | Acima de R$ 600,00 | 5% do salário       |

---

- [EXE7 - Sequência de Fibonacci](CAP-05/EXERCICIOS-RESOLVIDOS/Q7/src/br/edu/principal/Principal.java)  
  Faça um programa que monte os oito primeiros termos da sequência de Fibonacci.  
  | 0 - 1 - 1 - 2 - 3 - 5 - 8 - 13 - 21 - 34 - 55... |



- [EXE8 - Série Matemática com Padrões](CAP-05/EXERCICIOS-RESOLVIDOS/Q8/src/br/edu/principal/Principal.java)  
  Faça um programa que leia o número de termos, determine e mostre os valores de acordo com a série a seguir:
  
  | Série = 2, 7, 3, 4, 21, 12, 8, 63, 48, 16, 189, 192, 32, 567, 768... |



- [EXE9 - Exibição de Data e Hora Formatadas](EXERCICIOS-RESOLVIDOS/Q9/src/br/edu/principal/Principal.java)  
  Faça um programa que mostre a data e a hora do sistema nos seguintes formatos:  
  **DD/MM/AAAA – mês por extenso**  
  **Hora:minuto**



- [EXE10 - Comparação de Duas Datas](CAP-05/EXERCICIOS-RESOLVIDOS/Q10/src/br/edu/principal/Principal.java)  
  Faça um programa que determine a data cronologicamente maior entre duas datas fornecidas pelo usuário. Cada data deve ser composta por três valores inteiros: dia, mês e ano.


## 🚀 Como usar
Para acessar e executar os exercícios, siga os seguintes passos:

### 1️⃣ Baixe e instale o Eclipse IDE:
- Faça o download do Eclipse em [eclipse.org/downloads](https://www.eclipse.org/downloads/).
- Instale o Eclipse em seu computador.

### 2️⃣ Crie um novo projeto no Eclipse:
- Abra o Eclipse e selecione **File > New > Java Project**.
- Dê um nome ao projeto (por exemplo, `POO-Atividades`).

### 3️⃣ Estrutura de pastas:
Dentro do projeto, os arquivos estão organizados em:
- 📂 `EXERCICIOS-RESOLVIDOS/` → Contém questões que já vêm com a resposta.
- 📂 `EXERCICIOS-PROPOSTOS/` → Contém apenas os enunciados das questões para serem resolvidas.

### 4️⃣ Crie o pacote e a classe:
- Clique com o botão direito sobre o `src` do seu projeto e selecione **New > Package**.
- Nomeie o pacote como `br.edu.principal`.
- Em seguida, clique com o botão direito no pacote `br.edu.principal` e selecione **New > Class**.
- Nomeie a classe como `Principal`.

### 5️⃣ Copie e cole o código da questão correspondente:
- Acesse a questão desejada e copie o código da classe `Principal` para o arquivo criado.

### 6️⃣ Execute o código:
- Após colar o código, clique com o botão direito na classe `Principal` e selecione **Run As > Java Application** para ver o resultado da execução.

Este repositório visa ajudar a organizar as atividades, separando as questões que já possuem resposta das questões que precisam ser resolvidas pelos alunos.

## 📬 Contato
Caso tenha dúvidas ou sugestões, sinta-se à vontade para contribuir ou entrar em contato! 😊

