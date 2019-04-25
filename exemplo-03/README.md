# Exemplo 03

Exemplo de JavaScript.

Para verificar se o `npm` está instalado:

```sh
npm --version
```

Para instalar o `http-server`:

```sh
npm install http-server -g
```

Para executar como uma aplicação web:

```sh
http-server -o
```

Se você não tem direitos de adminstrador da máquina execute os comandos a seguir:

```sh
npm install --prefix . http-server

node node_modules/http-server/bin/http-server -o
```

# Link

* [http-server](https://github.com/indexzero/http-server) - Servidor web usado em desenvolvimento.
* [W3Schools - JavaScript](https://www.w3schools.com/js)
* [Curso de JavaScript - Rodrigo Branas](https://www.youtube.com/playlist?list=PLQCmSnNFVYnT1-oeDOSBnt164802rkegc)