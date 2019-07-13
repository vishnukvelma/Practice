package vvk.daos;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import vvk.misc.OracleJPAUtils;
import vvk.pojos.Department;

public class DepartDaoImpl implements DepartDao{
	//@Override
	public void create(Department dept){
		EntityManager em = OracleJPAUtils.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(dept); // Persist entity in persistence context.
		em.flush();
		tx.commit();// Commit Transaction
		em.close();
		System.out.println("Department Created SuccessFully");
	}
	
	//@Override
	public Department read(int dno){
		EntityManager em = OracleJPAUtils.createEntityManager();
		return em.find(Department.class, dno);
	}
	
	//@Override
	public void update(Department dept){
		EntityManager em = OracleJPAUtils.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(dept);
		em.flush();
		tx.commit();
		em.close();
		System.out.println("Deprtment Updated Successfully");
	}
	
	//@Override
	public void delete(Department d){
		EntityManager em = OracleJPAUtils.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.remove(d);
		em.flush();
		tx.commit();
		em.close();
		System.out.println("Department Deleted Successfully");
	}
	
	//@Override
	public List<Department> getAll(){
		EntityManager em = OracleJPAUtils.createEntityManager();
		Query q = em.createNamedQuery("dept.findAll");
		return q.getResultList();
	}
	
	//@Override
	public List<Department> getByName(String name){
		EntityManager em = OracleJPAUtils.createEntityManager();
		Query q = em.createNamedQuery("dept.findByName");
		q.setParameter(1, name);
		return q.getResultList();
	}
}