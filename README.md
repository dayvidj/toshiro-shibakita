# Toshiro Shibakita – Desafio Docker & Microsserviços

Este repositório é minha implementação do desafio proposto no projeto **toshiro-shibakita** (DIO), que tem como objetivo praticar o uso de **Docker**, **containers** e conceitos de **arquitetura de microsserviços**.

## 🎯 Objetivo 

Criar uma estrutura baseada em containers para simular um ambiente moderno de aplicações, desacoplado da infraestrutura, utilizando boas práticas de mercado com Docker e serviços independentes.

## 🚀 O que foi desenvolvido

Além de replicar a ideia central do projeto original, foram implementadas as seguintes **melhorias**:

*  Criação de uma **API REST em Spring Boot (Java 17)**
*  Organização do projeto em camadas: `controller`, `service`, `repository`, `model`
*  Dockerização da API com **Dockerfile multi-stage**
*  Orquestração com **Docker Compose**
*  Banco de dados **MySQL em container** (substituindo H2)
*  Persistência de dados com **volumes Docker**
*  Configuração de **profiles (dev/prod)**
*  Healthcheck do serviço
*  Estrutura pronta para deploy em nuvem (ex: AWS)

## 🧱 Arquitetura

* Spring Boot API
* MySQL 8
* Docker & Docker Compose

Cada serviço roda em seu próprio container, comunicando-se por rede interna do Docker.

## ▶️ Como executar
Na raiz do projeto:

```bash
docker compose up --build
```

API disponível em:

```
http://localhost:8080
```
## 🛠 Tecnologias

* Java 17
* Spring Boot
* Spring Data JPA
* MySQL
* Docker
* Docker Compose
* Maven

Projeto desenvolvido para fins de estudo e portfólio profissional.
