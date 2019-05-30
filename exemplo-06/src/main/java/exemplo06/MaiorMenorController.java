package exemplo06;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/")
public class MaiorMenorController extends HttpServlet {

    @Override
    protected void service(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        String resultado = "";

        String idadeStr = request.getParameter("idade");
        if (idadeStr != null) {
            int idade = Integer.parseInt(idadeStr);
            resultado = MaiorMenorModel.maiorOuMenor(idade);
        }

        // Adiciona a variável na requisição para o JSP trabalhar.
        request.setAttribute("resultado", resultado);

        // Redireciona requisição para o JSP.
        request.getRequestDispatcher("/maior-menor-view.jsp").forward(request, response);
    }
}
