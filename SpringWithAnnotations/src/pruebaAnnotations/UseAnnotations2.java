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
		
		
		FinancialDirector employee=context.getBean("financialDirector", FinancialDirector.class);
		
		System.out.println("Email del director: "+ employee.getEmail());
		System.out.println("Nombre de la empresa: "+ employee.getCompanyName());
		/*
		Employees employee=context.getBean("financialDirector", Employees.class);
		
		System.out.println(employee.getTasks());
		System.out.println(employee.getReport());
		*/
		
		
		/*
		
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
		*/
		
		//cerrar el contexto
		
		context.close();
	}

}
