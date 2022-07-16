package InversionofControl;

public class DirectorEmployee implements Employees {
	
	//Creación de campo tipo ReportCreation (Interfaz)
	
	private ReportCreation newReport;
	private String email;
	private String companyName;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	//Creación de constructor que inyecta la dependencia
	public DirectorEmployee(ReportCreation newReport) {
		this.newReport= newReport;
	}
	@Override
	public String getTasks() {
		// TODO Auto-generated method stub
		return "I manage the workers of the company";
	}

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return "Report created by director: "+ newReport.getReport();
	}
	
	//Crear método init. Ejecutar tareas justo antes que el bean este disponible
	
	public void initialMethod() {
		
		System.out.println("Dentro del método Init, aquí irían las tareas a ejecutar antes de que el bean esté listo");
	}
	
	
	//Método Destroy. Ejecutar tareas después de que el bean haya sido utilizado
	
public void finalMethod() {
		
		System.out.println("Dentro del método Destroy, aquí irían las tareas a ejecutar después de utilizar el bean");
	}

}
