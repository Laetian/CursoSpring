package InversionofControl;

public class SecretaryEmployee implements Employees {
	
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


	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return "Report generated by secretary " + newReport.getReport();
	}

	public void setNewReport(ReportCreation newReport) {
		this.newReport = newReport;
	}
	

	@Override
	public String getTasks() {
		
		return "I manage the agenda of the bosses";
	}

}
