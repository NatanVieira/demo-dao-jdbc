package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println(" === findById === ");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println(" === findAll === ");
		List<Department> list = departmentDao.findAll();
		for(Department d : list) {
			System.out.println(d);
		}
		
		/*System.out.println(" === insert === ");
		Department dep2 = new Department(null, "Music");
		departmentDao.insert(dep2);
		System.out.println(dep2);*/
		
		/*System.out.println(" === update === ");
		dep2.setName("Rock");
		departmentDao.update(dep2);
		Department dep3 = departmentDao.findById(7);
		System.out.println(dep3);*/
		
		/*System.out.println(" === delete === ");
		departmentDao.deleteById(9);*/
	}

}
