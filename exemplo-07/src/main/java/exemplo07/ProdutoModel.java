package exemplo07;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Responsável pela parte "Model".
 */
public class ProdutoModel {

  public static Connection getConnection() throws Exception {
    String url = "jdbc:derby://localhost:1527/db;create=true";
    String user = "app";
    String password = "app";
    //Obtendo uma conexão com o banco de dados.
    return DriverManager.getConnection(url, user, password);
  }

  private static EntityManagerFactory emf =
      Persistence.createEntityManagerFactory("petshop");

  public static String incluir(Produto produto) throws Exception {
    // Obter "conexão".
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    // Grava o objeto no banco de dados.
    em.persist(produto);
    em.getTransaction().commit();
    em.close();
    return "Produto incluído com sucesso.";
  }

  public static String incluir(Integer codigo, String nome, Double preco) throws Exception {
    Connection conn = getConnection();

    String sql = "insert into produto (codigo, nome, preco) values (?, ?, ?)";

    //Prepara uma sentença SQL.
    PreparedStatement pstmt = conn.prepareStatement(sql);
    pstmt.setInt(1, codigo);
    pstmt.setString(2, nome);
    pstmt.setDouble(3, preco);

    //Executa sentença SQL.
    pstmt.execute();
    return "Produto incluído com sucesso.";
  }

  public static String alterar(Integer codigo, String nome, Double preco) throws Exception {
    Connection conn = getConnection();

    String sql = "update produto set nome = ?, preco = ? where codigo = ?";

    //Prepara uma sentença SQL.
    PreparedStatement pstmt = conn.prepareStatement(sql);
    pstmt.setString(1, nome);
    pstmt.setDouble(2, preco);
    pstmt.setInt(3, codigo);

    //Executa sentença SQL.
    pstmt.execute();
    return "Produto alterado com sucesso.";
  }

  public static List<Produto> listarProdutos() throws Exception {
    EntityManager em = emf.createEntityManager();
    // Não é SQL! É JPQL.
    String jpql = "from Produto";
    TypedQuery<Produto> query = em.createQuery(jpql, Produto.class);
    List<Produto> result = query.getResultList();
    em.close();
    return result;
  }

  public static List listar() throws Exception {
    Connection conn = getConnection();

    String sql = "select codigo, nome, preco from produto";

    //Prepara uma sentença SQL.
    PreparedStatement pstmt = conn.prepareStatement(sql);

    //Executa sentença SQL.
    ResultSet rs = pstmt.executeQuery();

    List<Produto> res = new ArrayList();
    while (rs.next()) {
      res.add(new Produto(
          rs.getInt(1),
          rs.getString(2),
          rs.getDouble(3)));
    }
    return res;
  }

  public static void excluir(Integer codigo) throws Exception {
    Connection conn = getConnection();

    String sql = "delete from produto where codigo = ?";

    //Prepara uma sentença SQL.
    PreparedStatement pstmt = conn.prepareStatement(sql);
    pstmt.setInt(1, codigo);

    //Executa sentença SQL.
    pstmt.execute();
  }
}
