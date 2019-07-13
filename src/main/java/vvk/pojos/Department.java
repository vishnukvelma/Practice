package vvk.pojos;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the DEPARTMENT database table.
 * 
 */
@Entity
@NamedQuery(name="Department.findAll", query="SELECT d FROM Department d")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DEPARTMENT_DNO_GENERATOR", sequenceName="DEPARTMENT_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DEPARTMENT_DNO_GENERATOR")
	private int dno;

	private String dname;

	public Department() {
	}

	public int getDno() {
		return this.dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

}