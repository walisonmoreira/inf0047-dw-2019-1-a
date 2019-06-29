<%@ page contentType="text/html; charset=UTF-8" %>
<%-- Comentário de JSP. --%>
<%-- Abaixo um scriptlet. Trecho de código Java que executa no servidor. --%>
<%
String uri = request.getRequestURI();
String inicioActive = uri.endsWith("inicio.jsp") ? "active" : "";
String produtoActive = uri.endsWith("produto.jsp") ? "active" : "";
%>
<nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
    <span class="navbar-brand">Pet Shop</span>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#menu" aria-controls="menu"
        aria-expanded="false" aria-label="Menu de navegação">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="menu">
        <ul class="navbar-nav">
            <li class="nav-item <%=inicioActive%>">
                <a class="nav-link" href="inicio.jsp">Início</a>
            </li>
            <li class="nav-item <%=produtoActive%>">
                <a class="nav-link" href="produto">Produto</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="index.jsp">Sair</a>
            </li>
        </ul>
    </div>
</nav>