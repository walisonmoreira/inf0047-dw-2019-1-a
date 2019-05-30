# Exemplo 05

Aplicação web com JSP.

Para executar o projeto.

```sh
mvnw tomcat7:run
```

Para acessar a página.

```
http://localhost:9090/
```

Para criar um novo projeto.

```sh
mvn archetype:generate -DarchetypeArtifactId=maven-archetype-webapp
```

Para instalar o Maven Wrapper. Isso cria o comando `mvnw` para Linux e Windows. Com ele, mesmo se o maven não estiver instalado, os comandos maven funcionarão. Só pra facilitar a vida do desenvolvedor que não tem o maven instalado.

```
mvn -N io.takari:maven:0.7.6:wrapper -Dmaven=3.6.1
```
