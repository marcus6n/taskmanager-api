# Task Manager API

## Descrição
A Task Manager API é uma aplicação simples desenvolvida em Java utilizando o framework Spring Boot. Esta API permite que você crie, liste e exclua tarefas em uma lista de tarefas.

## Endpoints

### Listar Tarefas
**GET /**

Retorna a lista de todas as tarefas.

**Resposta:**
- **200 OK**: Retorna um JSON contendo a lista de tarefas.

```json
[
  "Tarefa 1",
  "Tarefa 2",
  "Tarefa 3"
]
```

### Criar Tarefa
**POST /**

Adiciona uma nova tarefa à lista.

**Requisição:**
- **Body**: Um texto representando a nova tarefa.

**Resposta:**
- **200 OK**: Indica que a tarefa foi adicionada com sucesso.

### Limpar Tarefas
**DELETE /**

Remove todas as tarefas da lista.

**Resposta:**
- **200 OK**: Indica que todas as tarefas foram removidas com sucesso.

## Exemplo de Uso

### Listar Tarefas
```bash
http GET localhost:8080/tasks
```

### Criar Tarefa
```bash
http POST localhost:8080/tasks --raw="digite a tarefa aqui..."
```

### Limpar Tarefas
```bash
http  DELETE localhost:8080/tasks
```

## Pré-requisitos
- Java 8 ou superior
- Maven

## Como Executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/marcus6n/taskmanager-api.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd taskmanager-api
   ```

3. Compile e execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

A aplicação estará disponível em `http://localhost:8080`.

## Tecnologias Utilizadas
- Java
- Spring Boot
- Maven

## Licença
Este projeto é licenciado sob a MIT License - veja o arquivo [LICENSE](LICENSE) para detalhes.

---