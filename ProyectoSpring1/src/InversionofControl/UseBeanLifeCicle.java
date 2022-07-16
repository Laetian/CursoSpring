package InversionofControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseBeanLifeCicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Primero cargar el XML de configuración
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContextDestroyInitMethod.xml");
		
		//Obtención del Bean
		
		Employees Juan=context.getBean("myEmployee", Employees.class);
		
		//Le pedimos al bean que ejecute una función
		
		System.out.println(Juan.getReport());
		
		//Cerrar el context
		
		context.close();

	}

}
