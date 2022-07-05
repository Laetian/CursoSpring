package InversionofControl;

public class DirectorEmployee implements Employees {
	
	//Creación de campo tipo ReportCreation (Interfaz)
	
	private ReportCreation newReport;
	
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

}
