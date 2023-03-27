package com.yxz.hibernate.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.yxz.hibernate.model.Address;
import com.yxz.hibernate.model.Cart;
import com.yxz.hibernate.model.Cart1;
import com.yxz.hibernate.model.Employee;
import com.yxz.hibernate.model.Item;
import com.yxz.hibernate.model.Items;
import com.yxz.hibernate.util.HibernateUtil;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//Prep work
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		//Get All Employees
		Transaction tx = session.beginTransaction();
//		Query query = session.createQuery("from Employee");
//		List<Employee> empList = query.list();
//		for(Employee emp : empList){
//			System.out.println("List of Employees::"+emp.getId()+","+emp.getAddress().getCity());
//		}
		
		/*one to one*/
//		Address address = new Address();
//		address.setAddressLine1("kkk");
//		address.setCity("new york");
//		address.setZipcode("10001");
//		
//		Employee employee = new Employee();
//		employee.setName("silva");
//		employee.setSalary(500);
//		address.setEmployee(employee);
//		
//		session.persist(address);
		
		//tx.commit();
		
		/*one to many*/
//		Cart cart = new Cart();
//		cart.setName("MyCart");
//		
//		Items item1 = new Items("I1", 10, 1, cart);
//		Items item2 = new Items("I2", 20, 2, cart);
//		Set<Items> itemsSet = new HashSet<Items>();
//		itemsSet.add(item1); 
//		itemsSet.add(item2);
//		
//		cart.setItems(itemsSet);
//		cart.setTotal(10*1 + 20*2);
//		
//		session.persist(cart);
//		session.persist(item1);
//		session.persist(item2);
		//tx.commit();
		

//		Query oneToone = session.createQuery(hql);
//		int result = oneToone.executeUpdate();
//		System.out.println("Rows affected: " + result);
		//rolling back to save the test data
		tx.rollback();
		
		//closing hibernate resources
		sessionFactory.close();
	}

}
