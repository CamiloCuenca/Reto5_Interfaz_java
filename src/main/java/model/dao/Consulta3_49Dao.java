package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.*;

public class Consulta3_49Dao {
    public ArrayList<Consulta3VO_49> consulta3DAO() throws SQLException {
        ArrayList<Consulta3VO_49> lista = new ArrayList<>();
        String consulta = "SELECT Constructora , Numero_Banos , l.Nombre FROM Proyecto p "+
        "JOIN Lider l ON l.ID_Lider = p.ID_Lider "+
        "WHERE ID_Proyecto >= 5 AND ID_Proyecto <= 17;";

        Connection conexion = JDBCUtilities.getConnection();
        PreparedStatement statement = conexion.prepareStatement(consulta);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            Consulta3VO_49 consul3 = new Consulta3VO_49();
            consul3.setConstructora(rs.getString("Constructora"));
            consul3.setNombre(rs.getString("Nombre"));
            consul3.setBanos(rs.getInt("Numero_Banos"));
            

            lista.add(consul3);
        }
        rs.close();
        statement.close();
        if (conexion != null) {
            conexion.close();
        }

        return lista;
       
    }  
}