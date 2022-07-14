package InversionofControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoUseSingletonPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Carga del xml de configuración
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//Petición de beans al contenedor Spring
		SecretaryEmployee Manuel = context.getBean("mySecretaryEmployee", SecretaryEmployee.class);
		
		SecretaryEmployee Maria = context.getBean("mySecretaryEmployee", SecretaryEmployee.class);
		
		
		//Modíficamos el bean, campo scope, singleton por defecto podemos hacer que sea igual a prototype si lo necesitamos
		
		//Pedimos que nos imprima la dirección de memoria, al ser singleton dbería dar el mismo resultado, si es prototype no
		System.out.println(Maria);
		System.out.println(Manuel);
		
		//también podemos comprobarlo de diferente forma
		if(Maria==Manuel) System.out.println("Mismo objeto");
		else System.out.println("Objetos diferentes");
	}

}
