package InversionofControl;

public class SecretaryEmployee implements Employees {
	
	private ReportCreation newReport;

	@Override
	public String getTasks() {
		
		return "I manage the agenda of the bosses";
	}

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return "Report generated by secretary " + newReport.getReport();
	}

	public void setNewReport(ReportCreation newReport) {
		this.newReport = newReport;
	}

}
