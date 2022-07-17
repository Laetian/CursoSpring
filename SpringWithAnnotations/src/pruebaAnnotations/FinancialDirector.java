package pruebaAnnotations;



public class FinancialDirector implements Employees {

	@Override
	public String getTasks() {
		// TODO Auto-generated method stub
		return "Manage the financial directionof the company";
	}

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return financialReport.getFinalcialReport();
	}

	private CreateFinancialReport financialReport;

	public FinancialDirector(CreateFinancialReport financialReport) {
		this.financialReport = financialReport;
	}
	
}
