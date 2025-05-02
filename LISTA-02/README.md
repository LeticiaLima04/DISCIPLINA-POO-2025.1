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

- [EXE1 - Cálculo de Média Ponderada e Conceito Final](EXERCICIOS-RESOLVIDOS/Q1/src/br/edu/principal/Principal.java)  
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

- [EXE2 - Cálculo de Média Aritmética e Nota do Exame](EXERCICIOS-RESOLVIDOS/Q2/src/br/edu/principal/Principal.java)  
  Faça um programa que receba três notas de um aluno, calcule e mostre a média aritmética e a mensagem correspondente.  
  Aos alunos que ficaram para exame, calcule e mostre a nota que deverão tirar para serem aprovados, considerando que a média exigida é 6,0.

  **Mensagem de acordo com a média:**

  | Média     | Mensagem   |
  |-----------|------------|
  | 0,0 – 2,9 | Reprovado  |
  | 3,0 – 6,9 | Exame      |
  | 7,0 – 10  | Aprovado   |

---

- [EXE3 - Verificação do Maior Número](EXERCICIOS-RESOLVIDOS/Q3/src/br/edu/principal/Principal.java)  
  Faça um programa que receba dois números e mostre o maior.

- [EXE4 - Ordenação de Três Números Crescentes](EXERCICIOS-RESOLVIDOS/Q4/src/br/edu/principal/Principal.java)  
  Faça um programa que receba três números e mostre-os em ordem crescente. Suponha que o usuário digitará três números diferentes.

- [EXE5 - Ordenação Decrescente com Quarto Número Fora de Ordem](EXERCICIOS-RESOLVIDOS/Q5/src/br/edu/principal/Principal.java)  
  Faça um programa que receba três números obrigatoriamente em ordem crescente e um quarto número que não siga essa regra. Mostre, em seguida, os quatro números em ordem decrescente. Suponha que o usuário digitará quatro números diferentes.

- [EXE6 - Verificação de Número Par ou Ímpar](EXERCICIOS-RESOLVIDOS/Q6/src/br/edu/principal/Principal.java)  
  Faça um programa que receba um número inteiro e verifique se é par ou ímpar.

- [EXE7 - Impressão de Valores com Base em Opção](EXERCICIOS-RESOLVIDOS/Q7/src/br/edu/principal/Principal.java)  
  Faça um programa que receba quatro valores: I, A, B e C. Desses valores, I é inteiro e positivo, A, B e C são reais. Escreva os números A, B e C obedecendo à tabela a seguir.  
  Suponha que o valor digitado para I seja sempre um valor válido, ou seja, 1, 2 ou 3, e que os números digitados sejam diferentes um do outro.

  **Formas de escrita conforme o valor de I:**

  | Valor de I | Forma de Escrever A, B e C            |
  |------------|----------------------------------------|
  | 1          | A, B e C em ordem crescente            |
  | 2          | A, B e C em ordem decrescente          |
  | 3          | O maior entre A, B e C no meio dos dois|

---

- [EXE8 - Menu com Operações Matemáticas](EXERCICIOS-RESOLVIDOS/Q8/src/br/edu/principal/Principal.java)  
  Faça um programa que mostre o menu de opções a seguir, receba a opção do usuário e os dados necessários para executar cada operação.  
  **Menu de opções:**  
  1. Somar dois números.  
  2. Raiz quadrada de um número.  
  Digite a opção desejada:

- [EXE9 - Exibição de Data e Hora Formatadas](EXERCICIOS-RESOLVIDOS/Q9/src/br/edu/principal/Principal.java)  
  Faça um programa que mostre a data e a hora do sistema nos seguintes formatos: DD/MM/AAAA – mês por extenso e hora:minuto.

- [EXE10 - Comparação de Duas Datas](EXERCICIOS-RESOLVIDOS/Q10/src/br/edu/principal/Principal.java)  
  Faça um programa que determine a data cronologicamente maior entre duas datas fornecidas pelo usuário. Cada data deve ser composta por três valores inteiros, em que o primeiro representa o dia, o segundo, o mês e o terceiro, o ano.



### 📝 Exercícios Propostos

- [EXE01 - Subtração de Dois Números](EXERCICIOS-PROPOSTOS/Q1/src/br/edu/principal/Principal.java):  
  Faça um programa que receba dois números, calcule e mostre a subtração do primeiro número pelo segundo.
- [EXE02 - Multiplicação de Três Números](EXERCICIOS-PROPOSTOS/Q2/src/br/edu/principal/Principal.java):  
  Faça um programa que receba três números, calcule e mostre a multiplicação desses números.
- [EXE03 - Divisão de Dois Números](EXERCICIOS-PROPOSTOS/Q3/src/br/edu/principal/Principal.java):  
  Faça um programa que receba dois números, calcule e mostre a divisão do primeiro número pelo segundo.  
  Sabe-se que o segundo número não pode ser zero, portanto, não é necessário se preocupar com validações.
- [EXE04 - Média Ponderada de Duas Notas](EXERCICIOS-PROPOSTOS/Q4/src/br/edu/principal/Principal.java):  
  Faça um programa que receba duas notas, calcule e mostre a média ponderada dessas notas, considerando peso 2 para a primeira e peso 3 para a segunda.
- [EXE05 - Desconto de 10% no Preço](EXERCICIOS-PROPOSTOS/Q5/src/br/edu/principal/Principal.java):  
  Faça um programa que receba o preço de um produto, calcule e mostre o novo preço, sabendo-se que este sofreu um desconto de 10%.
- [EXE06 - Comissão sobre Vendas](EXERCICIOS-PROPOSTOS/Q6/src/br/edu/principal/Principal.java):  
  Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas.  
  Faça um programa que receba o salário fixo do funcionário e o valor de suas vendas, calcule e mostre a comissão e seu salário final.
- [EXE07 - Variação de Peso](EXERCICIOS-PROPOSTOS/Q7/src/br/edu/principal/Principal.java):  
  Faça um programa que receba o peso de uma pessoa, calcule e mostre:  
  a) o novo peso, se a pessoa engordar 15% sobre o peso digitado;  
  b) o novo peso, se a pessoa emagrecer 20% sobre o peso digitado.
- [EXE08 - Peso em Gramas](EXERCICIOS-PROPOSTOS/Q8/src/br/edu/principal/Principal.java):  
  Faça um programa que receba o peso de uma pessoa em quilos, calcule e mostre esse peso em gramas.
- [EXE09 - Área de um Trapézio](EXERCICIOS-PROPOSTOS/Q9/src/br/edu/principal/Principal.java):  
  Faça um programa que calcule e mostre a área de um trapézio.  
  Sabe-se que: A = ((base maior + base menor) * altura) / 2
- [EXE10 - Área de um Quadrado](EXERCICIOS-PROPOSTOS/Q10/src/br/edu/principal/Principal.java):  
  Faça um programa que calcule e mostre a área de um quadrado.  
  Sabe-se que: A = lado * lado

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

