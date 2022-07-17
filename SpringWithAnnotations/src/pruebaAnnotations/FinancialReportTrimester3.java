package pruebaAnnotations;

import org.springframework.stereotype.Component;

@Component
public class FinancialReportTrimester3 implements CreateFinancialReport {

	@Override
	public String getFinalcialReport() {
		// TODO Auto-generated method stub
		return "Financial report trimester3";
	}

}
