package pruebaAnnotations;

import org.springframework.stereotype.Component;

@Component("ExperiencedSeller")
public class ExperiencedSeller implements Employees {

	@Override
	public String getTasks() {
		// TODO Auto-generated method stub
		return "Sell, sell and sell";
	}

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return "Report generated by seller";
	}

}
