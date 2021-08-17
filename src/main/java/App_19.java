import java.sql.SQLException;
import java.sql.Connection;
import util.JDBCUtilities;
import view.*;

/**
 * Persistencia Proyectos Construcción
 *
 */
public class App_19 {
    public static void main( String[] args ){        

        //Casos de prueba 
        //Consulta 1
        VistaRequerimientosReto4.consulta1();
        System.out.println();
        //Consulta 2
        VistaRequerimientosReto4.consulta2();
        System.out.println();
        //Consulta 3
        VistaRequerimientosReto4.consulta3();
        System.out.println();
        
        new NewJFrame().setVisible(true);
        System.out.println();
       
        //////////Fin de los llamados a los requerimientos

    }
}
