package pruebaAnnotations;

import org.springframework.stereotype.Component;

@Component
public class FinalcialReportTrimester1 implements CreateFinancialReport {

	@Override
	public String getFinalcialReport() {
		// TODO Auto-generated method stub
		return "Financial report of trimester1";
	}

}
