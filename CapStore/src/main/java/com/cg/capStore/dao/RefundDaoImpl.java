package com.cg.capStore.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cg.capStore.model.Refund;
import com.cg.capStore.model.Return;




@Repository
@Component("refund")
public class RefundDaoImpl implements IRefundDao {
	ArrayList<Return> returns;
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public ArrayList<Return> getAll() {
		Query query = (Query) entityManager.createQuery("from Return ");
		ArrayList<Return> list = (ArrayList<Return>) query.list();
		return list;
		
	}

	@Override
	public Return refundProduct(Return return1) {
		// TODO Auto-generated method stub
		
		Return return2 =new Return();
		Refund refund = addProduct(return1);
		return1.setRefundId(return1.getRefundId());
		entityManager.remove(getByRefundId(return1.getRefundId()));
		return return1;
		
	}

	private Return getByRefundId(int refundId) {
		// TODO Auto-generated method stub
		Return return1=entityManager.find(Return.class, refundId);
		return return1;
		
	}
	public Refund addProduct(Return return1) {
		Refund refund = new Refund();
		refund.setCustomerId(return1.getCustomerId());
		refund.setOrderId(return1.getOrderId());
		refund.setProductId(return1.getProductId());
		refund.setProductPrice((int)return1.getProductPrice());
		refund.setRefundId(return1.getRefundId());
		refund.setProductQuantity(return1.getProductQuantity());
		entityManager.persist(refund);
		return refund;
	}

	@Override
	public ArrayList<Refund> getRefunds() {
		// TODO Auto-generated method stub
		Query query = (Query) entityManager.createQuery("from Refund ");
		ArrayList<Refund> list = (ArrayList<Refund>) query.list();
		return list;
		
	}
}
