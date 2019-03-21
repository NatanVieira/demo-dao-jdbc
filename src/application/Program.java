package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Department dep = new Department(1,"BOOK");
		Seller sell = new Seller(1, "Natanael", "natanael.vieira@gelopar.com.br", sdf.parse("26/01/1995"), 3000.00,dep);
		System.out.println(dep);
		System.out.println(sell);
	}
}

