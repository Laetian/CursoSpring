package pruebaAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Primer paso, leer el XML de configuración
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Segundo paso pedir bean al contenedor
		
		Employees Antonio=context.getBean("ExperiencedSeller", Employees.class);
		
		//Tercero usar el bean
		
		System.out.println(Antonio.getReport());
		System.out.println(Antonio.getTasks());
	
		
		//Cuarto cerrar el contexto
		
		context.close();
	}
}
