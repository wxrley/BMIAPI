# ⚖️ BMI API ☕
Uma API REST que oferece um conjunto completo de operações para cálculo e classificação de IMC.

## 💡 Sobre o projeto
Este projeto foi desenvolvido para demonstrar conceitos do **Spring Boot**. \
O **BMIAPI** é uma API de cálculo de IMC que conta com tratamento de exceções, validação de limites físicos reais e uma documentação interativa.

## ⚙️ Funcionalidades
- **Cálculo de IMC:** Processamento exato do índice baseado em peso e altura.
- **Classificação Automática:** Interpretação dos resultados seguindo os padrões mundiais de saúde.
- **Validação de Dados:** Filtros para garantir que peso e altura estejam em intervalos humanos realistas.
- **Segurança Operacional:** Tratamento de exceções para divisão por zero ou medidas inválidas.
- **Documentação Automática:** Interface visual via Swagger para testes imediatos.

## 🧩 Tecnologias Utilizadas
- Java 21
- Spring Boot
- Maven
- Swagger/OpenAPI

## 🛠️ Instalação
**1.** Verifique se o **Java** e o **Maven** estão instalados na sua máquina:
> Para confirmar, execute no terminal:
> ```bash
> java -version
> mvn -version
> ```
> Caso precise, baixe o [JDK](https://www.oracle.com/java/technologies/downloads) ou [Maven](https://maven.apache.org/download.cgi).

**2.** Baixe ou clone este repositório para o seu computador:
> ```bash
> git clone https://github.com/wxrley/BMIAPI.git
> ```

## 🚀 Execução
#### Opção 1 — Via Terminal (Maven)
**1.** Entre na pasta raiz do projeto e execute o comando para iniciar a aplicação:
> ```bash
> mvn spring-boot:run
> ```
**2.** O console deve exibir o log do Spring indicando que o servidor subiu.

#### Opção 2 — Via IDE (IntelliJ, Eclipse, VS Code, etc.) 
**1.** Abra a pasta do projeto na sua IDE preferida. \
**2.** Abra o arquivo `BmiAPIApplication.java` e clique em **Run**.

## 🧪 Como Testar
Para facilitar o teste das operações, o projeto utiliza o **Swagger (OpenAPI).** Isso permite que você visualize e execute todos os endpoints diretamente pelo navegador, de forma totalmente interativa.

**1.** Certifique-se de que a aplicação está rodando. \
**2.** Acesse o link oficial da documentação:
> http://localhost:8080/swagger-ui/index.html

**3.** Como realizar um cálculo:
- Escolha a operação na lista (ex: `/bmi/calculate`).
- Clique no botão **"Try it out"**.
- Preencha os campos `weight` e `height`.
- Clique no botão azul **"Execute"**.
- O resultado aparecerá logo abaixo, na seção **"Response body"**.

> [!TIP]
> O sistema utiliza a fórmula: $weight / (height \times height)$. \
> Utilize o ponto (.) como separador decimal (Ex: 1.75). O validador garante que a altura esteja entre 0.5m e 2.5m para manter a precisão dos dados.

## 👨‍💻 Autor
**Wxrley** — só mais um dev latino americano 💪
