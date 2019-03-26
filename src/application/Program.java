package application;

import java.text.ParseException;
import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException{
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		/*System.out.println(" === TESTE 1:  seller by id === ");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println(" === TESTE 2: seller by departmentId === ");*/
		Department department = new Department(2, null);
		/*List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj: list) {
			System.out.println(obj);
		}	
		System.out.println(" === TESTE 3: seller findAll === ");
		List<Seller> list = sellerDao.findAll();
		for(Seller obj: list) {
			System.out.println(obj);
		}
		System.out.println(" === TESTE 4: seller inserts === ");
		Seller newSeller = new Seller(null, "greg", "greg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new Seller id = " + newSeller.getId());
		*/
		
		System.out.println(" === TESTE 4: seller update === ");
		Seller seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("update complete");
	}
}

