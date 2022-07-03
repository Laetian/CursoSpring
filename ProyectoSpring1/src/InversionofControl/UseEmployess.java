package InversionofControl;

public class UseEmployess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creación de objetos de tipo empleado
		
		Employees Employee1= new DirectorEmployee();
		
		//Uso de los objetos creados
		
		System.out.println(Employee1.getTasks());
		
	}

}
