import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;





/**
 *
 * @author vitor
 */
public class ControladorBD {
    
    
    
    public static void CreateDB(String nome){
        String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "\\" + nome + ".db";
        System.out.println(url);
        
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("Nome do driver:  " + meta.getDriverName());
                System.out.println("NOVO BANCO DE DADOS CRIADO.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    
    public static void InsereMOrador(String nome, Morador morador){
        String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "\\" + nome + ".db";
        String sql = "INSERT OR REPLACE INTO moradores VALUES(" + morador.apartamento +",'"+ morador.nome +"',"+ morador.ADM + ");";
        
        try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement(); ){    
            stmt.execute(sql);
            System.out.println("MORADOR INSERIDO");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }  
    }
    
    public static void InsereSolicitacao(String nome, Solicitacao solicitacao){
        String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "\\" + nome + ".db";
        String sql = "INSERT OR REPLACE INTO solicitacoes VALUES("+ solicitacao.apartamento + ",'" + solicitacao.nome + "','" + solicitacao.CPF + "','" + solicitacao.foto + "'," + solicitacao.ativo + "," + solicitacao.ativo + ");";
        
        try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement(); ){    
            stmt.execute(sql);
            System.out.println("SOLICITACAO INSERIDA");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }  
    }
    
    public int getQauntidadeHistorico(String nome,int ap){
        int quantidade = 333;
        
        String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "\\" + nome + ".db";
        String sql = "SELECT COUNT(*) AS total FROM solicitacoes WHERE apartamento = "+ ap + " AND ativo = 0;";
        
        try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql); ){    
          quantidade = rs.getInt("total");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }  
        
        return quantidade;
    }
    
    public static Morador getApartamento(String nome, int apartamento){
        Morador morador = new Morador();
        
        String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "\\" + nome + ".db";
        String sql = "SELECT nome, apartamento, adm FROM moradores WHERE apartamento = "+ apartamento + ";";
        
        try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql); ){    
            morador.nome = rs.getString("nome");
            morador.apartamento = rs.getInt("apartamento");
            morador.ADM = rs.getBoolean("adm");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }  
        return morador;
    }
    
    public String[] getHisotricoNomes(String banco, int ap, int quantidade){
        String[] nomes = new String[quantidade];
        
        String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "\\" + banco + ".db";
        String sql = "SELECT nome FROM solicitacoes WHERE apartamento = "+ ap + " AND ativo = 0;";
        int i = 0;
        
        try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql); ){    
            
            while(rs.next()){
                nomes[i] = rs.getString("nome");
                i++;
            }
             
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }  
        return nomes;
    }
    
    public String[] getHisotricoCPFS(String banco, int ap, int quantidade){
        String[] CPFS = new String[quantidade];
        
        String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "\\" + banco + ".db";
        String sql = "SELECT CPF FROM solicitacoes WHERE apartamento = "+ ap + " AND ativo = 0;";
        int i = 0;
        
        try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql); ){    
            
            while(rs.next()){
                CPFS[i] = rs.getString("CPF");
                i++;
            }
             
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }  
        return CPFS;
    }
    
    public boolean[] getHisotricoAceitos(String banco, int ap, int quantidade){
        boolean[] aceitos = new boolean[quantidade];
        
        String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "\\" + banco + ".db";
        String sql = "SELECT aceito FROM solicitacoes WHERE apartamento = "+ ap + " AND ativo = 0;";
        int i = 0;
        
        try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql); ){    
            
            while(rs.next()){
                aceitos[i] = rs.getBoolean("aceito");
                i++;
            }
             
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }  
        return aceitos;
    }
    
    
    
    public static void main(String[] args) throws SQLException{
        System.out.println("Inicializando Programa!");
        String nomeBanco = "banco";
        Connection conn = null;
        
        Morador teste = new Morador();
        teste.ADM = false;
        teste.apartamento = 222;
        teste.nome = "Meu pau de oculos";
        
        Solicitacao soliTeste = new Solicitacao();
        soliTeste.apartamento = 666;
        soliTeste.nome = "joaquein";
        soliTeste.CPF = "1124666";
        soliTeste.aceito = false;
        soliTeste.ativo = true;
        soliTeste.foto = "pornhub/nude01.png";
        
        
        
        // CRIA CONEXÂO COM BANCO
        String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "\\" + nomeBanco + ".db";
        try{
            conn = DriverManager.getConnection(url);
            System.out.println("Conexao criada.");
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        // CONEXAO CRIADA
        
        
       
        

    }
    
}
