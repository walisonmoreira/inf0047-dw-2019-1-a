<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html lang="pt-BR">
<head>
    <%@ include file = "header.jsp" %>
    <title>Pet Shop</title>
    <script>
        function entrar() {
            location.href = 'inicio.jsp';
        }
    </script>
</head>
<body>
    <div class="container">
        <div class="row"> <!-- Linha -->
            <div class="col-4 offset-4"> <!-- Coluna com deslocamento -->
                <h1>Pet Shop</h1>
                <form>
                    <div class="form-group">
                        <label for="campo-email">E-mail</label>
                        <input type="email" class="form-control" id="campo-email" placeholder="nome@exemplo.com.br">
                    </div>
                    <div class="form-group">
                        <label for="senha">Senha</label>
                        <input type="password" class="form-control" id="senha">
                    </div>
                    <button type="button" class="btn btn-primary" onclick="entrar()">Entrar</button>
                </form>
            </div>
        </div>
    </div>
    <script src="js/jquery-3.3.1.slim.min.js"></script>
    <script src="js/bootstrap.bundle.min.js"></script>
</body>
</html>