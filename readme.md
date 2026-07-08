# ✍️ My Own Blog

> *A ideia dessa aplicação é ser um sistema independente para qualquer um poder subir um blog próprio. Com isso aqui todos poderão ver o que você pensa, separar em categorias e dar ao blog a sua cara.*

Bem-vindo ao repositório do **My Own Blog**! Esta é uma aplicação robusta e elegante desenvolvida com Java e Spring Boot, criada para ser o seu espaço pessoal na internet. 

---

## 🚀 Tecnologias Utilizadas

O projeto foi construído utilizando as seguintes tecnologias de ponta:

- **Linguagem:** Java 26
- **Framework Principal:** Spring Boot (v4.1.0)
- **Banco de Dados:** MongoDB (via `Spring Data MongoDB`)
- **Visual e Templates:** Thymeleaf
- **Segurança:** Spring Security (com suporte à visualização no Thymeleaf)
- **Utilitários:** Lombok para redução de código (*boilerplate*)
- **Infraestrutura:** Suporte nativo ao Docker Compose (`spring-boot-docker-compose`) para banco de dados

## ✨ Principais Funcionalidades

- **Painel Administrativo:** Acesso restrito para criação e publicação de novas postagens (usuários com `ROLE_ADMIN`).
- **Autenticação Segura:** Área de login protegida e segura utilizando o Spring Security.
- **Interface Premium:** Design elegante e moderno (tendência "Glassmorphism") utilizando CSS puro, com fontes serifadas de alta legibilidade (*Lora* e *Playfair Display*).
- **Feed de Notícias:** Uma página inicial atraente para listar seus pensamentos mais recentes.
- *(Em Breve)* Suporte completo à separação por categorias.

---

## 🛠️ Como Executar o Projeto

Graças à integração com o `spring-boot-docker-compose`, subir a aplicação e o banco de dados é uma tarefa muito simples!

### Pré-requisitos
- [Java 26+](https://jdk.java.net/)
- [Docker e Docker Compose](https://www.docker.com/)

### Passo a Passo

1. **Clone este repositório:**
   ```bash
   git clone https://github.com/Guilherme-Brito-Freire/MyOwnBlog.git
   cd my-own-blog
   ```

2. **Execute a aplicação (O Maven e o Docker cuidarão do resto):**
   No terminal, execute o seguinte comando na raiz do projeto:
   ```bash
   ./mvnw spring-boot:run
   ```
   > **Dica Mágica:** O Spring Boot irá detectar o seu `compose.yaml` e iniciar o MongoDB via Docker automaticamente para você!

3. **Acesse no seu Navegador:**
   - Página inicial (Feed): `http://localhost:8080`
   - Tela de Autenticação: `http://localhost:8080/auth/login`

---

## 🤝 Contribuição

Sinta-se à vontade para fazer um *fork* deste projeto e enviar as suas melhorias através de *Pull Requests*. Toda contribuição é bem-vinda!

## 📄 Licença

Feito com ☕ e muito código. Disponível para toda a comunidade!