package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import services.IPaymentService;

@Component
public class ServiceCaller {

	@Autowired
	@Qualifier("venmoPaymentService") 
	private IPaymentService paymentService;
	
	public void executePayment() {
		paymentService.processPayment();
	}
}
