package InversionofControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//Creación de objetos de tipo empleado
		
		Employees Employee1= new DirectorEmployee();
		
		//Uso de los objetos creados
		
		System.out.println(Employee1.getTasks());
		*/
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*  Hasta clase 9
		Employees Juan = context.getBean("myEmployee", Employees.class);

		
		System.out.println(Juan.getTasks());
		
		System.out.println(Juan.getReport());
		
		context.close();
		*/
		
		/* Clase 10
		Employees Manuel = context.getBean("mySecretaryEmployee", Employees.class);
		
		System.out.println(Manuel.getTasks());
		
		System.out.println(Manuel.getReport());
		
		context.close();
		*/
		
		/* Clase 11
		SecretaryEmployee Manuel = context.getBean("mySecretaryEmployee", SecretaryEmployee.class);
		
		System.out.println(Manuel.getTasks());
		System.out.println(Manuel.getReport());
		System.out.println("Company name: "+Manuel.getCompanyName());
		System.out.println("Company mail: "+Manuel.getEmail());
		*/
		DirectorEmployee Manuel = context.getBean("myEmployee", DirectorEmployee.class);
		
		System.out.println(Manuel.getTasks());
		System.out.println(Manuel.getReport());
		System.out.println("Company name: "+Manuel.getCompanyName());
		System.out.println("Company mail: "+Manuel.getEmail());
		
		
		context.close();
		
	}

}
