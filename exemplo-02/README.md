# Exemplo 02

Exemplo de HTML.

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
* [W3Schools - HTML](https://www.w3schools.com)