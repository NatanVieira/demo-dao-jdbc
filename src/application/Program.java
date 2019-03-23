package application;

import java.text.ParseException;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException{
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(" === TESTE 1:  seller by id === ");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println(" === TESTE 2: seller by departmentId === ");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
	}
}

