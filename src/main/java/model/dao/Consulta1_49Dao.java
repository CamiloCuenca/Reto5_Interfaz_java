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

public class Consulta1_49Dao {
    public ArrayList<Consulta1VO_49> consulta1DAO() throws SQLException {
        ArrayList<Consulta1VO_49> lista = new ArrayList<>();
        String consulta = "SELECT Nombre, Salario FROM Lider WHERE Ciudad_Residencia = 'Bogota' ; ";
        Connection conexion = JDBCUtilities.getConnection();
        PreparedStatement statement = conexion.prepareStatement(consulta);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            Consulta1VO_49 consul1 = new Consulta1VO_49();
            consul1.setNombre(rs.getString("Nombre"));
            consul1.setSalario(rs.getInt("Salario"));
            lista.add(consul1);
        }
        rs.close();
        statement.close();
        if (conexion != null) {
            conexion.close();
        }

        return lista;
    }
}