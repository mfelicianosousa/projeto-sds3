#  Semana Spring React - SDS 3.0

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/mfelicianosousa/projeto-sds3/blob/add-license-2/LICENSE)

Semana Srping React é uma imersão nas tecnologias Spring Boot e React construindo uma aplicação full stack na web, evento este organizado pela **DevSuperior**. 

Consiste em desenvolver um dashboard para Analisar o desempenho de suas vendas por diferentes perspectivas.
A aplicação exibe um dashboard a partir de dados fornecidos por um back end construído com Spring Boot (Heroku)

## Objetivos do projeto

Criar projetos backend e frontend em 3 Episódios salvando o projeto no github em monorepo (esse formato aqui). 
Utilizando banco de dados H2 no desenvolvimento e testes, Postgree em produção, local e na nuvem.

# Layout Web
![Web 1](https://github.com/mfelicianosousa/assets/project/raw/sds3/web1.png)


# Modelo Conceitual
![Modelo Conceitual](https://github.com/mfelicianosousa/assets/project/raw/sds3/model-conceitual.png)

## Publicar o frontend no Netlify  ( Cloud ) 

- https://mfs-sds3.netlify.app

## Publicar o backend no Heroku ( Cloud )

**Obs: Pode usar o endereço eletronico abaixo no Postman para tests de API, conforme descrito logo abaixo em rotinas de Test.**

- https://sds3-mfs.herokuapp.com/

# Implementação do Backend
 - Modelo de domínio
 - Backend no padrão camadas
 - Consulta paginada
 - consulta agrupadas para gráficos
 - Implantação na nuvem

# Tecnologias utilizadas

## Back end
- Spring Tools Suite ( ferramenta )
- JAVA
- Spring Boot
- JPA / Hibernate
- Maven 
- Security

## Front end

 - VSCODE ( Ferramenta )
 - HTML / css / JS / TypeScript 
 - Bootstrap
 - ReactJS
 - ApexCharts

# Banco de dados
- H2 ( Test )
- Postgresql ( Dev e Prod )

# Rotinas de Test 
 - Postman 

   - Enviroment ( local ) : SDS3
     - Variable 
       - Host : initial value : http://localhost:8080

   - Collections name : DevSuperior-SDS3
     - requests
        - All Seller : (GET) | {{host}}/sellers
        - Sale Pagination All : (GET) | {{host}}/sales
        - Sale Pagination Page : (GET) | {{host}}/sales?page=1&size=10
        - Amount Sale by Seller : (GET) | {{host}}/sales/amount-by-seller
        - {{host}}/sales/amount-by-seller : (GET) | {{host}}/sales/amount-by-seller
     
 
# Implantação em produção ( Cloud )
- Back end: Heroku
- Front end : Netlify
- Banco de Dados : Postgresql 

### Integrar as tecnologia backend e frontend
 - Integração via API 
 
#Como Executar o Projeto

## Back end

Pré Requisito : Java 11

  ```basch
  # Clonar repositório
  
  git clone https://github.com/mfelicianosousa/projeto-sds3
  
  # Entrar na pasta do projeto back end
  cd backend
  
  # executar o projeto
  ./mvnw spring-boot:run
  
  ```
  
 #Front end web
 
 #Pré-requisito: npm ou yarn
 
```basch
 # clonar repositório 
 git clone https://github.com/mfelicianosousa/projeto-sds3
 
 # entrar na pasta do projeto front end web
 cd fontend
 
 # intalar as dependências
 yarn install
 
 # executar o projeto
 yarn start

```

 # Autor
 
 Marcelino Feliciano de Sousa
 
 linkedin.com/in/marcelino-feliciano-de-sousa-b5076024
 
 
