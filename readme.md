## 📦 Delivery Tech Backend

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=flat-square&logo=spring&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=apachemaven&logoColor=white)
![H2](https://img.shields.io/badge/H2-0055A4?style=flat-square&logo=h2database&logoColor=white)
![Actuator](https://img.shields.io/badge/Actuator-6DB33F?style=flat-square&logo=spring&logoColor=white)

Projeto desenvolvido para a disciplina de Arquitetura de Sistemas na Fundação FAT, sob orientação do professor [@andersonbuenos](https://github.com/andersonbuenos).

Uma fundação robusta e moderna para ecossistemas de delivery 🍔🚴‍♂️  
Construída com o ecossistema Spring para garantir escalabilidade e alta performance.

O projeto tambem foi estruturado para servir tanto aplicações **mobile** quanto plataformas **web**.

---

## 🎯 Objetivo do Projeto

Esta API é o motor principal do sistema, responsável por conectar restaurantes, entregadores e clientes.

Ela controla tudo o que acontece nos bastidores: desde o cadastro de um novo parceiro até o momento em que o pedido chega à porta do cliente.

---

## 🚀 Recursos Principais

### 👥 Gestão de Stakeholders
Cadastro e gerenciamento de:
- Usuários
- Entregadores
- Estabelecimentos

### 📋 Menu Digital
- Catálogo dinâmico de produtos
- Organização por categorias

### 📦 Fluxo de Pedidos
- Processamento em tempo real
- Controle de status (criado → em preparo → entregue)

### 📊 Observabilidade
- Health check
- Métricas operacionais via Actuator

---

## 🛠️ Stack Tecnológica

| Tecnologia       | Versão     | Papel no Projeto |
|----------------|------------|------------------|
| Java           | 21 (LTS)   | Linguagem base com alta performance e Virtual Threads |
| Spring Boot    | 3.2.x      | Framework para APIs REST |
| Maven          | -          | Build e gerenciamento de dependências |
| H2 Database    | In-memory  | Banco leve para dev e testes |
| Spring Actuator| -          | Monitoramento e métricas |

---

## 🚀 Como Iniciar

### ✅ Pré-requisitos

- JDK 21 ou superior
- Maven instalado *(ou usar o wrapper)*

---

### 📥 Instalação

1. **Clone o repositório**

```bash
https://github.com/gabriel-szabados/delivery-tech/tree/main
```

2. **Execute a aplicação:**
   ```bash
   mvn spring-boot:run
   ```

3. **Acesse o H2 Console:**
   - URL: `http://localhost:8080/h2-console`
   - JDBC URL: `jdbc:h2:mem:delivery`
   - Username: `sa`
   - Password: (deixar em branco)

---