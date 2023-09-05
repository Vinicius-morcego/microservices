package br.com.vinicius.payrollapi.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vinicius.payrollapi.domain.Payroll;

@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {

	@GetMapping(value = "/{workerId}")
	public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment){
		return ResponseEntity.ok().body(
					new Payroll(
								"Vinicius",
								payment.getDescription(), 
								payment.getHourlyPrice(), 
								100.0, 
								payment.getHourlyPrice() * payment.getWorkedHours()
							)
				);
	}
}
