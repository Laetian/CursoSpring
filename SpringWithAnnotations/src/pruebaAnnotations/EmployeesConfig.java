package pruebaAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("pruebaAnnotations")
public class EmployeesConfig {

	
	//Definir el bean para FinancialReportBuysDepartment
	
	@Bean
	public CreateFinancialReport financialReportBuysDepartment() {
		
		return new FinancialReportBuysDepartment();
	}
	
	//Definir el bean para el FinancialDirector e inyectar dependencias
	
	@Bean
	public Employees financialDirector() {
		
		return new FinancialDirector(financialReportBuysDepartment());
	}
}
