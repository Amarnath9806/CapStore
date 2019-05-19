package com.cg.capStore.service;

import java.util.ArrayList;

import com.cg.capStore.model.Refund;
import com.cg.capStore.model.Return;

public interface IRefundService {
public ArrayList<Return> getAll();
public Return refundProduct(Return return1);
public ArrayList<Refund> getRefunds();
}
