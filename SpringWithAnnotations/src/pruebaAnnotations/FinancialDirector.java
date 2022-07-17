package pruebaAnnotations;

import org.springframework.beans.factory.annotation.Value;

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
	
	@Value("${email}")
	private String email;
	
	@Value("${companyName}")
	private String companyName;

	public String getEmail() {
		return email;
	}

	public String getCompanyName() {
		return companyName;
	}
	
	
}
