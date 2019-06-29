package exemplo07;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Responsável pela parte "Controller".
 */
@WebServlet(value = "/produto")
public class ProdutoController extends HttpServlet {
    @Override
    protected void service(
            HttpServletRequest req,
            HttpServletResponse resp) throws ServletException, IOException {

        String operacao = req.getParameter("operacao");
        operacao = operacao == null ? "" : operacao;

        String resultado = "";
        try {
            if (operacao.equalsIgnoreCase("incluir")) {
                incluir(req, resp);
            } else if (operacao.equalsIgnoreCase("alterar")) {
                alterar(req, resp);
            } else if (operacao.equalsIgnoreCase("excluir")) {
                excluir(req, resp);
            }
            listar(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
            resultado = "Falha inesperada: " + e.getMessage();
            // Adiciona a variável na requisição para o JSP trabalhar.
            req.setAttribute("resultado", resultado);
        }

        // Redireciona requisição para o JSP.
        req.getRequestDispatcher("/produto-view.jsp").forward(req, resp);

    }

    private void incluir(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String resultado = "";
        String codigoStr = req.getParameter("codigo");
        if (codigoStr != null) {
            Integer codigo = Integer.parseInt(codigoStr);
            String nome = req.getParameter("nome");
            String precoStr = req.getParameter("preco");
            Double preco = Double.parseDouble(precoStr);

            //resultado = ProdutoModel.incluir(codigo, nome, preco);
            resultado = ProdutoModel.incluir(new Produto(codigo, nome, preco));
        }
        // Adiciona a variável na requisição para o JSP trabalhar.
        req.setAttribute("resultado", resultado);
    }

    private void alterar(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String resultado = "";
        String codigoStr = req.getParameter("codigo");
        if (codigoStr != null) {
            Integer codigo = Integer.parseInt(codigoStr);
            String nome = req.getParameter("nome");
            String precoStr = req.getParameter("preco");
            Double preco = Double.parseDouble(precoStr);

            resultado = ProdutoModel.alterar(codigo, nome, preco);
        }
        // Adiciona a variável na requisição para o JSP trabalhar.
        req.setAttribute("resultado", resultado);
    }

    private void listar(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        //List produtos = ProdutoModel.listar();
        List<Produto> produtos = ProdutoModel.listarProdutos();
        req.setAttribute("produtos", produtos);
    }

    private void excluir(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String codigoStr = req.getParameter("codigo");
        Integer codigo = Integer.parseInt(codigoStr);
        ProdutoModel.excluir(codigo);
    }
}
