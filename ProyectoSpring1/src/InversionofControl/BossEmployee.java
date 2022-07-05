package InversionofControl;

public class BossEmployee implements Employees {
	
	public BossEmployee(ReportCreation newReport) {
		this.newReport = newReport;
	}

	private ReportCreation newReport;
	
	public String getTasks() {
		
		return "I manage issues related to my employees";
	}

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return "Report presented by boss " + newReport.getReport();
	}

}
