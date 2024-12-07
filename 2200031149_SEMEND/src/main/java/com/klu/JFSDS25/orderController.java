package com.klu.JFSDS25;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/order")
public class orderController {

	@Autowired
	private OrderService ser;
	
	@PostMapping("/addorder")
	public void addorder(@RequestBody Order order)
	{
		ser.addorder(order);
	}
	
	
}
