# 🚨Testes Funcionais para o Sr. Barriga 🤑💻

[![GitHub stars](https://img.shields.io/github/stars/matheuscarv69/Tests-Sr.Barriga?color=7159)](https://github.com/matheuscarv69/Tests-Sr.Barriga/stargazers)
![badges](https://img.shields.io/github/issues/matheuscarv69/Tests-Sr.Barriga)
![Maven Central with version prefix filter](https://img.shields.io/maven-central/v/org.apache.maven/apache-maven/3.6.3?color=7159)

Este repositório possui testes para o sistema de aluguéis do Sr. Barriga, preocupado em receber seus pagamentos, ele queria ter certeza de que não teria problemas na hora de administrar os pagamentos dos seus inquilinos, por isso decidiu fazer testes no seu sistema web.

>💲 Acesse o site do [Sr.Barriga](https://seubarriga.wcaquino.me/)

## 🤔 Que testes são esses?

Esses testes englobam as principais funcionalidades do sistema:
- ✅ Login
- ✅ Adicionar Contas
- ✅ Listar Contas
- ✅ Editar Contas
- ✅ Excluir Contas
- ✅ Criar Movimentações das Contas
- ✅ Listar Movimentações das Contas
- ✅ Excluir Movimentações das Contas
- ✅ Verificar as Regras de Negócio

>❗ Para poder executar o projeto na sua máquina, acesse os [pré-requisitos](https://gist.github.com/matheuscarv69/db9fd451e62c418f0c11223511257d46)

## 🖥 O Sistema
Essa é a tela de Resumo Mensal do sistema, nela temos acesso às pendências.

![MonthlySummary](https://i.imgur.com/s5AlXBH.jpg)

## 🧐 Executando os testes
Existem duas formas de executá-los:

Por padrão, o projeto está configurado para executar os testes por meio da Suíte de testes.
### 1️⃣ Primeira forma: Suíte de testes

Basta executar a classe **SuiteTest** que está dentro do pacote **suites**.

![SuiteTest](https://i.imgur.com/umpsz5E.jpg)

### 2️⃣ Segunda forma: Teste individual

Para executar individualmente cada teste, é preciso entrar na Classe **BaseTest** e **descomentar** o trecho de código do **@Before**.

![BaseTest](https://i.imgur.com/AZcaH79.jpg)

### ❗ Observação: Execução individual

Caso execute individualmente os testes, tenha atenção, pois alguns testes dependem da massa gerada pelos outros.

A ordem é essa:
![OrderTest](https://i.imgur.com/jUTZjlU.png)

## 🔎 Log dos testes

É possível visualizar de duas formas:

### 1️⃣ Terminal

Ao final do teste, é mostrado no terminal se o mesmo passou ou se deu algum erro:

![terminal](https://i.imgur.com/5HXNYbs.jpg)

### 2️⃣ Screenshot

Cada teste ao final tira um print da tela do Navegador usado, esse screenshot é salvo dentro da pasta **target**, dentro da subpasta **screenshot**.

Cada print possui o nome referente ao teste que o gerou.

![screenshot](https://i.imgur.com/dLTOdbn.jpg) 

## 🛠 Tecnologias
As seguintes tecnologias foram utilizadas no desenvolvimento do projeto:

- [Java JDK 11](https://download.java.net/java/GA/jdk11/9/GPL/openjdk-11.0.2_windows-x64_bin.zip)
- [Selenium 3.4.0 Maven Dependency](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.4.0)
- [JUnit](https://junit.org/junit5/)

## 😏 Status do Projeto: ✅ Finalizado

### 👨🏻‍💻 Autor
---

<a href="https://github.com/matheuscarv69">
 <img style="border-radius: 50%;" src="https://avatars1.githubusercontent.com/u/55814214?s=460&u=ffb1e928527a55f53df6e0d323c2fd7ba92fe0c3&v=4" width="100px;" alt=""/>
 <br />
 <sub><b>Matheus Carvalho</b></sub></a> <a href="https://github.com/matheuscarv69" title="Matheus Carvalho">🚀</a>


Feito por Matheus Carvalho, entre em contato!✌🏻

[![Linkedin Badge](https://img.shields.io/badge/-Matheus_Carvalho-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https:https://www.linkedin.com/in/matheus-carvalho69//)](https://www.linkedin.com/in/matheus-carvalho69/)
[![Gmail Badge](https://img.shields.io/badge/-matheus9126@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:matheus9126@gmail.com)](mailto:matheus9126@gmail.com)
