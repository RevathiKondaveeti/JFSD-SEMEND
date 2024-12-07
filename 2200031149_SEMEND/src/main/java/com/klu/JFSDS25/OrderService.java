package com.klu.JFSDS25;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired
	private Orderrepo orderepo;
	
	public void  addorder(Order ord) {
		orderepo.save(ord);
	}
	

}
