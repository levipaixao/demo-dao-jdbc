package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department("Books", 1);

        Seller seller = new Seller(21, "bob", "bob@gmail.com", new Date(), 3000.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();
        
        System.out.println(seller);
    }
}
