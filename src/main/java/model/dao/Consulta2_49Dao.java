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

public class Consulta2_49Dao {
    public ArrayList<Consulta2VO_49> consulta2DAO() throws SQLException {
        ArrayList<Consulta2VO_49> lista = new ArrayList<>();
        String consulta = "SELECT Nombre , Salario , Salario*16.0/100 as isr , Primer_Apellido||' '|| Segundo_Apellido as ape FROM Lider WHERE Salario > 10000;";
        Connection conexion = JDBCUtilities.getConnection();
        PreparedStatement statement = conexion.prepareStatement(consulta);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            Consulta2VO_49 consul2 = new Consulta2VO_49();
            consul2.setNombre(rs.getString("Nombre"));
            consul2.setSalario(rs.getInt("Salario"));
            consul2.setIsr(rs.getDouble("isr"));
            consul2.setApe(rs.getString("ape"));

            lista.add(consul2);
        }
        rs.close();
        statement.close();
        if (conexion != null) {
            conexion.close();
        }

        return lista;

    }
}

