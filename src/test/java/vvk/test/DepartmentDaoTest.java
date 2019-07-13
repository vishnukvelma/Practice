package vvk.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import vvk.daos.DepartDaoImpl;
import vvk.pojos.Department;

public class DepartmentDaoTest extends TestCase {
	public DepartmentDaoTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(DepartmentDaoTest.class);
	}

	public void testApp() {
		DepartDaoImpl deptdao = new DepartDaoImpl();
		Department dept = new Department();
		// dept.setDno(1); //not req because of sequence generator
		dept.setDname("CSE");
		deptdao.create(dept);

		Department dept1 = deptdao.read(1);
		System.out.println(dept1.getDname());

		dept1.setDname("IT");
		deptdao.update(dept1);
	}
}
