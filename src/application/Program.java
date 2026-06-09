package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: Seller FindById ===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("\n=== TEST 2: Seller FindById ===");
        Department department = new Department(null, 2);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: Seller FindAll ===");

        list = sellerDao.findAll();

        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 4: Seller Insert ===");
        Seller newSeller = new Seller(null,"Greg", "Greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted new Id = " + newSeller.getId());
    }
}
