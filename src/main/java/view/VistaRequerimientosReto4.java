package view;

import controller.*;
import model.vo.*;

import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientosReto4 {

    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

    public static void consulta1() {
        System.out.println("-----Consulta 1-------");
        try {

            ArrayList<Consulta1VO_49> lista = controlador.realizarConsulta1();

            // Encabezado del resultado
            System.out.println("nombre, salario");

            // Cada VO cargado, mostrarlo en la vista
            for (Consulta1VO_49 consulta1vo_49 : lista) {
                System.out.printf("%s %d\n", consulta1vo_49.getNombre(), consulta1vo_49.getSalario());

            }

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void consulta2() {
        System.out.println("-----Consulta 2-------");
        try {

            ArrayList<Consulta2VO_49> lista = controlador.realizarConsulta2();

            // Encabezado del resultado
            System.out.println("nombre, salario, isr, ape");

            for (Consulta2VO_49 consulta2vo_49 : lista) {
                System.out.printf("%s %d %f %s\n", consulta2vo_49.getNombre(), consulta2vo_49.getSalario(),
                        consulta2vo_49.getIsr(), consulta2vo_49.getApe());

            }

            // Cada VO cargado, mostrarlo en la vista

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void consulta3() {
        System.out.println("-----Consulta 3-------");
        try {

            ArrayList<Consulta3VO_49> lista = controlador.realizarConsulta3();

            // Encabezado del resultado
            System.out.println("constructora, numero_banos, nombre");

            // Cada VO cargado, mostrarlo en la
            for (Consulta3VO_49 consulta3vo_49 : lista) {
                System.out.printf("%s %d %s\n", consulta3vo_49.getConstructora(), consulta3vo_49.getBanos(),
                        consulta3vo_49.getNombre());

            }

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }
}

