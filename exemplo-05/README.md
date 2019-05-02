# Exemplo 05

Aplicação web com JSP.

Para executar o projeto.

```sh
mvnw org.apache.tomcat.maven:tomcat7-maven-plugin:run -Dmaven.tomcat.port=9090
```

Para acessar a página.

```
http://localhost:9090/exemplo-05
```

Para criar um novo projeto.

```sh
mvn archetype:generate -DarchetypeArtifactId=maven-archetype-webapp
mvn -N io.takari:maven:0.7.6:wrapper -Dmaven=3.6.1
```
