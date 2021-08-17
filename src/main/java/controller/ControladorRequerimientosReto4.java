package controller;

//Estructuras de datos (colecciones)
import java.util.ArrayList;

//Modelos (acceso y objetos contenedores)
import model.dao.*;
import model.vo.*;

//Librerías para bases de datos
import java.sql.SQLException;

public class ControladorRequerimientosReto4 {

    private Consulta1_49Dao listaConsulta1;
    private Consulta2_49Dao listaConsulta2;
    private Consulta3_49Dao listaConsulta3;

    public ControladorRequerimientosReto4() {
        listaConsulta1 = new Consulta1_49Dao();
        listaConsulta2 = new Consulta2_49Dao();
        listaConsulta3 = new Consulta3_49Dao();
    }

    public ArrayList<Consulta1VO_49> realizarConsulta1() throws SQLException {
        return listaConsulta1.consulta1DAO();
    }

    public ArrayList<Consulta2VO_49> realizarConsulta2() throws SQLException {
        return listaConsulta2.consulta2DAO();
    }

    public ArrayList<Consulta3VO_49> realizarConsulta3() throws SQLException {
        return listaConsulta3.consulta3DAO();
    }

}
