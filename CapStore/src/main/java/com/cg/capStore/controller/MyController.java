package com.cg.capStore.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.capStore.model.Refund;
import com.cg.capStore.model.Return;
import com.cg.capStore.service.IRefundService;



@CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*")
@RestController
public class MyController {
	@Autowired
	IRefundService refund1;
	
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ArrayList<Return> getAll() {
		ArrayList<Return> returns = refund1.getAll();
		System.out.println(returns);
		return returns;
	}
	@RequestMapping(value="/delete",method = RequestMethod.PUT)
	public  Return refundProduct(@RequestBody Return return1) {
		refund1.refundProduct(return1);
		return return1;
		}
	@RequestMapping(value = "/getRefunds", method = RequestMethod.GET)
	public ArrayList<Refund> getRefuds() {
		ArrayList<Refund> returns = refund1.getRefunds();
	//	System.out.println(returns);
		return returns;
	}
}
