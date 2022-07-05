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
		
		Employees Juan = context.getBean("myEmployee", Employees.class);
		
		System.out.println(Juan.getTasks());
		
		System.out.println(Juan.getReport());
		
		context.close();
	}

}
