package pruebaAnnotations;

import org.springframework.stereotype.Component;

@Component
public class FinancialReportTrimester2 implements CreateFinancialReport {

	@Override
	public String getFinalcialReport() {
		// TODO Auto-generated method stub
		return "Financial report trimester 2";
	}

}
