package com.cg.capStore.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.capStore.dao.IRefundDao;
import com.cg.capStore.model.Refund;
import com.cg.capStore.model.Return;

@Transactional
@Service
@Component("refund1`")
public class RefunndServiceImpl implements IRefundService{
	@Autowired
	IRefundDao refund;
	@Override
	public ArrayList<Return> getAll() {
		
		return refund.getAll();
	}
	@Override
	public Return refundProduct(Return return1) {
		// TODO Auto-generated method stub
		return refund.refundProduct(return1);
	}
	@Override
	public ArrayList<Refund> getRefunds() {
		// TODO Auto-generated method stub
		return refund.getRefunds();
	}

}
