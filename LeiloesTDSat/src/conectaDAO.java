
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class conectaDAO {
    
    public Connection connectDB(){
        Connection conn = null;
        
        try {
        
            //conn = DriverManager.getConnection("jdbc:mysql://localhost/uc11?user=root&password=Lipe3939@");
            //conn = DriverManager.getConnection("jdbc:mysql://localhost/uc11?user=root&password=Lipe3939@&useSSL=false");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/uc11?user=root&password=Lipe3939@&useSSL=false&allowPublicKeyRetrieval=true");

            
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO" + erro.getMessage());
        }
        return conn;
    }
    
}
