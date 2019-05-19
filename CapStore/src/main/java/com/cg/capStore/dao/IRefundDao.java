package com.cg.capStore.dao;

import java.util.ArrayList;

import com.cg.capStore.model.Refund;
import com.cg.capStore.model.Return;

public interface IRefundDao {
	public ArrayList<Return> getAll();
	public Return refundProduct(Return return1);
	public ArrayList<Refund> getRefunds();
}
