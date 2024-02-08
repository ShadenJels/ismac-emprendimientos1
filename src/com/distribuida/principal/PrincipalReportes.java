package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.distribuida.dao.ReportesDAO;
import com.distribuida.entities.Reportes;


import java.util.List;

public class PrincipalReportes {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ReportesDAO reportesDAO = context.getBean("reportesDAOImpl", ReportesDAO.class);

//        List<Empresa_detalles> empresa_detalles = empresa_detallesDAO.findAll();
//		
//		//Impresion
//		for(Reportes item : Reportes){
//		  		System.out.println(item.toString());
//		}
//        
       // Define la cadena de búsqueda
       String busqueda = "Reportes";

        // Usa el método findAll
        List<Reportes> resultados = reportesDAO.findCustom(busqueda);

        // Imprime los resultados
        for (Reportes perfil : resultados) {
            System.out.println(perfil);
        }

        context.close();
    }
}