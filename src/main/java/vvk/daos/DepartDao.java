package vvk.daos;

import java.util.List;

import vvk.pojos.Department;
public interface DepartDao {
	public void create(Department dept);
	public Department read(int dno);
	public void update(Department dept);
	public void delete(Department d);
	public List<Department> getAll();
	public List<Department> getByName(String name);
}
