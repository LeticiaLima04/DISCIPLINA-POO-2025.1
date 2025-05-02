# 📘 Exercícios de Programação Orientada a Objetos (POO)

Este repositório está estruturado para facilitar o acesso às questões organizadas em duas categorias:

- 📖 **Exercícios Resolvidos**: Questões que já possuem respostas e são disponibilizadas para estudo.  
- 📝 **Exercícios Propostos**: Questões que contêm apenas os enunciados e devem ser resolvidas pelos alunos.

Cada exercício foi desenvolvido para que possamos compreender e aplicar os conceitos fundamentais da Programação Orientada a Objetos (POO) na prática.

> **📌 As questões foram retiradas da apostila _"Fundamentos da Programação de Computadores"_ de Ana Fernanda Gomes Ascencio e Edilene Aparecida Veneruchi.  
> Todos os exercícios apresentados fazem parte do Capítulo 04 – Estrutura Condicional e do Capítulo 05 - Estrutura de Repetição.**

---

## 📚 Enunciados das Questões - CAP 04

### 📖 Exercícios Resolvidos

- [EXE1 - Cálculo de Média Ponderada e Conceito Final](CAP-04/EXERCICIOS-RESOLVIDOS/Q1/src/br/edu/principal/Principal.java)  
  Faça um programa que receba as três notas, calcule e mostre a média ponderada e o conceito final.

  **Pesos das notas:**
  - Trabalho: **2**
  - Avaliação: **3**
  - Exame: **5**

  **Conceito final:**

  | Média     | Conceito |
  |-----------|----------|
  | 8,0 – 10  | A        |
  | 7,0 – 7,9 | B        |
  | 6,0 – 6,9 | C        |
  | 5,0 – 5,9 | D        |
  | 0,0 – 4,9 | E        |

---

- [EXE2 - Cálculo de Média Aritmética e Nota do Exame](CAP-04/EXERCICIOS-RESOLVIDOS/Q2/src/br/edu/principal/Principal.java)  
  Faça um programa que receba três notas de um aluno, calcule e mostre a média aritmética e a mensagem correspondente.  
  Aos alunos que ficaram para exame, calcule e mostre a nota que deverão tirar para serem aprovados, considerando que a média exigida é 6,0.

  **Mensagem de acordo com a média:**

  | Média     | Mensagem   |
  |-----------|------------|
  | 0,0 – 2,9 | Reprovado  |
  | 3,0 – 6,9 | Exame      |
  | 7,0 – 10  | Aprovado   |

---

- [EXE3 - Verificação do Maior Número](CAP-04/EXERCICIOS-RESOLVIDOS/Q3/src/br/edu/principal/Principal.java)  
  Faça um programa que receba dois números e mostre o maior.

- [EXE4 - Ordenação de Três Números Crescentes](CAP-04/EXERCICIOS-RESOLVIDOS/Q4/src/br/edu/principal/Principal.java)  
  Faça um programa que receba três números e mostre-os em ordem crescente. Suponha que o usuário digitará três números diferentes.

- [EXE5 - Ordenação Decrescente com Quarto Número Fora de Ordem](CAP-04/EXERCICIOS-RESOLVIDOS/Q5/src/br/edu/principal/Principal.java)  
  Faça um programa que receba três números obrigatoriamente em ordem crescente e um quarto número que não siga essa regra. Mostre, em seguida, os quatro números em ordem decrescente. Suponha que o usuário digitará quatro números diferentes.

- [EXE6 - Verificação de Número Par ou Ímpar](CAP-04/EXERCICIOS-RESOLVIDOS/Q6/src/br/edu/principal/Principal.java)  
  Faça um programa que receba um número inteiro e verifique se é par ou ímpar.

- [EXE7 - Impressão de Valores com Base em Opção](CAP-04/EXERCICIOS-RESOLVIDOS/Q7/src/br/edu/principal/Principal.java)  
  Faça um programa que receba quatro valores: I, A, B e C. Desses valores, I é inteiro e positivo, A, B e C são reais. Escreva os números A, B e C obedecendo à tabela a seguir.  
  Suponha que o valor digitado para I seja sempre um valor válido, ou seja, 1, 2 ou 3, e que os números digitados sejam diferentes um do outro.

  **Formas de escrita conforme o valor de I:**

  | Valor de I | Forma de Escrever A, B e C            |
  |------------|----------------------------------------|
  | 1          | A, B e C em ordem crescente            |
  | 2          | A, B e C em ordem decrescente          |
  | 3          | O maior entre A, B e C no meio dos dois|

---

- [EXE8 - Menu de Operações Matemáticas](CAP-04/EXERCICIOS-RESOLVIDOS/Q8/src/br/edu/principal/Principal.java)  
  Faça um programa que mostre o menu de opções a seguir, receba a opção do usuário e execute a operação correspondente:

  **Menu de opções:**
  1. Somar dois números.  
  2. Raiz quadrada de um número.
  
  Digite a opção desejada:


- [EXE9 - Exibição de Data e Hora Formatadas](CAP-04/EXERCICIOS-RESOLVIDOS/Q9/src/br/edu/principal/Principal.java)  
  Faça um programa que mostre a data e a hora do sistema nos seguintes formatos: DD/MM/AAAA – mês por extenso e hora:minuto.

- [EXE10 - Comparação de Duas Datas](CAP-04/EXERCICIOS-RESOLVIDOS/Q10/src/br/edu/principal/Principal.java)  
  Faça um programa que determine a data cronologicamente maior entre duas datas fornecidas pelo usuário. Cada data deve ser composta por três valores inteiros, em que o primeiro representa o dia, o segundo, o 
  mês e o terceiro, o ano.



## 📝 Exercícios Propostos

- [EXE01 - Subtração de Dois Números](CAP-04/EXERCICIOS-PROPOSTOS/Q1/src/br/edu/principal/Principal.java):  
  Faça um programa que receba quatro notas de um aluno, calcule e mostre a média aritmética das notas e a mensagem de aprovado ou reprovado, considerando para aprovação média 7.

- [EXE02 - Multiplicação de Três Números](CAP-04/EXERCICIOS-PROPOSTOS/Q2/src/br/edu/principal/Principal.java):  
  Faça um programa que receba duas notas, calcule e mostre a média aritmética e a mensagem que se encontra na tabela a seguir:

  **Média Aritmética e Mensagem:**

  | **Média Aritmética** | **Mensagem**  |  
  |----------------------|---------------|  
  | 0,0 a 3,0            | Reprovado     |  
  | 3,0 a 7,0            | Exame         |  
  | 7,0 a 10,0           | Aprovado      |

  ---

- [EXE03 - Divisão de Dois Números](CAP-04/EXERCICIOS-PROPOSTOS/Q3/src/br/edu/principal/Principal.java):  
  Faça um programa que receba dois números e mostre o menor.

- [EXE04 - Média Ponderada de Duas Notas](CAP-04/EXERCICIOS-PROPOSTOS/Q4/src/br/edu/principal/Principal.java):  
  Faça um programa que receba três números e mostre o maior.

- [EXE05 - Desconto de 10% no Preço](CAP-04/EXERCICIOS-PROPOSTOS/Q5/src/br/edu/principal/Principal.java):  
  Faça um programa que receba dois números e execute as operações conforme a escolha do usuário:

  | **Escolha do Usuário** | **Operação**                       |  
  |------------------------|------------------------------------|  
  | 1                      | Média entre os números digitados   |  
  | 2                      | Diferença do maior pelo menor      |  
  | 3                      | Produto entre os números digitados |  
  | 4                      | Divisão do primeiro pelo segundo   |

  Se a opção digitada for inválida, mostre uma mensagem de erro e termine a execução do programa.

  ---

- [EXE06 - Comissão sobre Vendas](CAP-04/EXERCICIOS-PROPOSTOS/Q6/src/br/edu/principal/Principal.java):  
  Faça um programa que receba dois números e execute uma das operações abaixo, conforme escolha do usuário:

  **Opções:**
  - a) O primeiro número elevado ao segundo número.
  - b) Raiz quadrada de cada número.
  - c) Raiz cúbica de cada número.

- [EXE07 - Variação de Peso](CAP-04/EXERCICIOS-PROPOSTOS/Q7/src/br/edu/principal/Principal.java):  
  Uma empresa decide dar um aumento de 30% aos funcionários com salários inferiores a R$ 500,00. Faça um programa que receba o salário do funcionário e mostre o valor do salário reajustado ou uma mensagem, caso ele não tenha direito ao aumento.

- [EXE08 - Peso em Gramas](CAP-04/EXERCICIOS-PROPOSTOS/Q8/src/br/edu/principal/Principal.java):  
  Faça um programa para calcular e mostrar o salário reajustado de um funcionário. O percentual de aumento encontra-se na tabela a seguir.

  **Salário e Percentual de Aumento:**

  | **Salário**           | **Percentual de Aumento** |  
  |-----------------------|---------------------------|  
  | Até R$ 300,00         | 35%                       |  
  | Acima de R$ 300,00    | 15%                       |

---

- [EXE09 - Área de um Trapézio](CAP-04/EXERCICIOS-PROPOSTOS/Q9/src/br/edu/principal/Principal.java):  
  Um banco concederá um crédito especial aos seus clientes, de acordo com o saldo médio no último ano. Faça um programa que receba o saldo médio de um cliente e calcule o valor do crédito, de acordo com a tabela a seguir. Mostre o saldo médio e o valor do crédito.

  **Saldo Médio e Percentual:**

  | **Saldo Médio**        | **Percentual**            |  
  |------------------------|---------------------------|  
  | Acima de R$ 400,00     | 30% do saldo médio        |  
  | R$ 400,00 a R$ 300,00  | 25% do saldo médio        |  
  | R$ 300,00 a R$ 200,00  | 20% do saldo médio        |  
  | Até R$ 200,00          | 10% do saldo médio        |

  ---

- [EXE10 - Área de um Quadrado](CAP-04/EXERCICIOS-PROPOSTOS/Q10/src/br/edu/principal/Principal.java):  
  O preço ao consumidor de um carro novo é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos, ambos aplicados ao custo de fábrica. As porcentagens encontram-se na tabela a seguir. Faça um programa que receba o custo de fábrica de um carro e mostre o preço ao consumidor.

  **Custo de Fábrica, Percentual do Distribuidor e Percentual dos Impostos:**

  | **Custo de Fábrica**         | **% do Distribuidor** | **% dos Impostos**  |  
  |------------------------------|-----------------------|---------------------|  
  | Até R$ 12.000,00             | 5%                    | Isento              |  
  | Entre R$ 12.000,00 e R$ 25.000,00 | 10%               | 15%                 |  
  | Acima de R$ 25.000,00        | 15%                   | 20%                 |

---

## 📚 Enunciados das Questões - CAP 05

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

## 📝 Exercícios Propostos

- [EXE01 - Subtração de Dois Números](CAP-05/EXERCICIOS-PROPOSTOS/Q1/src/br/edu/principal/Principal.java):  
  Faça um programa que leia cinco grupos de quatro valores (A, B, C, D) e mostre-os na ordem lida. Em seguida, organize-os em ordem crescente e decrescente.


- [EXE02 - Multiplicação de Três Números](CAP-05/EXERCICIOS-PROPOSTOS/Q2/src/br/edu/principal/Principal.java):  
  Uma companhia de teatro deseja montar uma série de espetáculos. A direção calcula que, a R$ 5,00 o ingresso, serão vendidos 120 ingressos, e que as despesas serão de R$ 200,00. Diminuindo-se em R$ 0,50 o preço dos ingressos, espera-se que as vendas aumentem em 26 ingressos. Faça um programa que escreva uma tabela de valores de lucros esperados em função do preço do ingresso, fazendo-se variar esse preço de R$ 5,00 a R$ 1,00, de R$ 0,50 em R$ 0,50. Escreva, ainda, para cada novo preço de ingresso, o lucro máximo esperado, o preço do ingresso e a quantidade de ingressos vendidos para a obtenção desse lucro.


- [EXE03 - Divisão de Dois Números](CAP-05/EXERCICIOS-PROPOSTOS/Q3/src/br/edu/principal/Principal.java):  
  Faça um programa que receba a idade de oito pessoas, calcule e mostre:  
  a) a quantidade de pessoas em cada faixa etária;  
  b) a porcentagem de pessoas na primeira faixa etária com relação ao total de pessoas.  
  c) a porcentagem de pessoas na última faixa etária com relação ao total de pessoas.  
  
  **Faixa Etária:**  
  | Faixa Etária     | Idade                      |
  |------------------|----------------------------|
  | 1a               | Até 15 anos                |
  | 2a               | De 16 a 30 anos            |
  | 3a               | De 31 a 45 anos            |
  | 4a               | De 46 a 60 anos            |
  | 5a               | Acima de 60 anos           |

---

- [EXE04 - Média Ponderada de Duas Notas](CAP-05/EXERCICIOS-PROPOSTOS/Q4/src/br/edu/principal/Principal.java):  
  Faça um programa que receba um número, calcule e mostre a tabuada desse número.  
  **Exemplo:**  
  Digite um número: 5  
  5 × 0 = 0  
  5 × 1 = 5  
  5 × 2 = 10  
  5 × 3 = 15  
  5 × 4 = 20  
  5 × 5 = 25  
  5 × 6 = 30  
  5 × 7 = 35  
  5 × 8 = 40  
  5 × 9 = 45  
  5 × 10 = 50  

---

- [EXE05 - Desconto de 10% no Preço](CAP-05/EXERCICIOS-PROPOSTOS/Q5/src/br/edu/principal/Principal.java):  
  Faça um programa que mostre as tabuadas dos números de 1 a 10.


- [EXE06 - Comissão sobre Vendas](CAP-05/EXERCICIOS-PROPOSTOS/Q6/src/br/edu/principal/Principal.java):  
  Uma loja utiliza o código V para transação à vista e P para transação a prazo. Faça um programa que receba o código e o valor de quinze transações, calcule e mostre:  
  - O valor total das compras à vista;  
  - O valor total das compras a prazo;  
  - O valor total das compras efetuadas;  
  - O valor da primeira prestação das compras a prazo, sabendo-se que serão pagas em três vezes.


- [EXE07 - Variação de Peso](CAP-05/EXERCICIOS-PROPOSTOS/Q7/src/br/edu/principal/Principal.java):  
  Faça um programa que receba a idade, a altura e o peso de cinco pessoas, calcule e mostre:  
  - A quantidade de pessoas com idade superior a 50 anos;  
  - A média das alturas das pessoas com idade entre 10 e 20 anos;  
  - A porcentagem de pessoas com peso inferior a 40 kg entre todas as pessoas analisadas.


- [EXE08 - Peso em Gramas](CAP-05/EXERCICIOS-PROPOSTOS/Q8/src/br/edu/principal/Principal.java):  
  Faça um programa que receba a **idade**, o **peso**, a **altura**, a **cor dos olhos** e a **cor dos cabelos** de **seis pessoas** e calcule e mostre:

  - **A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg.**
  - **A média das idades das pessoas com altura inferior a 1,50 m.**
  - **A porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas.**
  - **A quantidade de pessoas ruivas e que não possuem olhos azuis.**

  **Informações sobre as cores:**

  - **Cor dos olhos:**
    - A — azul  
    - P — preto  
    - V — verde  
    - C — castanho

  - **Cor dos cabelos:**
    - P — preto  
    - C — castanho  
    - L — louro  
    - R — ruivo



- [EXE09 - Área de um Trapézio](CAP-05/EXERCICIOS-PROPOSTOS/Q9/src/br/edu/principal/Principal.java):  
  Faça um programa que receba dez idades, pesos e alturas, calcule e mostre:  
  - A média das idades das dez pessoas;  
  - A quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 metro;  
  - A porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m.


- [EXE10 - Área de um Quadrado](CAP-05/EXERCICIOS-PROPOSTOS/Q10/src/br/edu/principal/Principal.java):  
  Faça um programa que receba dez números, calcule e mostre a soma dos números pares e a soma dos números primos.


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

