package pruebaAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Leer el class de configuración
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(EmployeesConfig.class);
		
		//Segundo paso pedir beans al contenedor
		
		Employees Antonio=context.getBean("ExperiencedSeller", Employees.class);
		
		Employees Lucia=context.getBean("ExperiencedSeller", Employees.class);
		
		//¿Apuntan Antonio y Lucia al mismo espacio en memoria?
		if(Antonio==Lucia) {
			System.out.println("Apuntan al mismo lugar en memoria");
			System.out.println(Antonio + "\n" +Lucia);
			
		}else {
			System.out.println("No apuntan al mismo lugar");
			System.out.println(Antonio + "\n" +Lucia);
		}
		
		
		//cerrar el contexto
		
		context.close();
	}

}
