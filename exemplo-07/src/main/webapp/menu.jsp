<%@ page contentType="text/html; charset=UTF-8" %>
<%-- Comentário de JSP. --%>
<%-- Abaixo um scriptlet. Trecho de código Java que executa no servidor. --%>
<%
String uri = request.getRequestURI();
String inicioActive = uri.endsWith("inicio.jsp") ? "active" : "";
String produtoActive = uri.endsWith("produto.jsp") ? "active" : "";
String vendaActive = uri.endsWith("venda.jsp") ? "active" : "";
String hotelCachorroGatoActive = uri.endsWith("cachorro.jsp") || uri.endsWith("gato.jsp") ? "active" : "";
String contatoActive = uri.endsWith("contato.jsp") ? "active" : "";
String consultaActive = uri.endsWith("consulta.jsp") ? "active" : "";
String hotelActive = uri.endsWith("hotel.jsp") ? "active" : "";
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
            <li class="nav-item <%=vendaActive%>">
                <a class="nav-link" href="venda.jsp">Venda</a>
            </li>
            <li class="nav-item dropdown <%=hotelCachorroGatoActive%>">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
                    aria-haspopup="true" aria-expanded="false">
                    Hotel
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="cachorro.jsp">Cachorro</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="gato.jsp">Gato</a>
                </div>
            </li>
            <li class="nav-item <%=contatoActive%>">
                <a class="nav-link" href="contato.jsp">Contato</a>
            </li>
            <li class="nav-item <%=consultaActive%>">
                <a class="nav-link" href="consulta.jsp">Consultas</a>
            </li>
            <li class="nav-item <%=hotelActive%>">
                <a class="nav-link" href="hotel.jsp">Hotel</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="index.jsp">Sair</a>
            </li>
        </ul>
    </div>
</nav>