package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;
import model.entites.Seller;

import java.util.List;
import java.util.Scanner;


public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();


        System.out.println("\n=== TEST 1: Department Insert ===");
        Department newDepartment = new Department(null, "Ifood");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted new Id = " + newDepartment.getId());

        System.out.println("=== TEST 2: Department FindById ===");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n=== TEST 3: Department Update ===");
        department = departmentDao.findById(1);
        department.setName("Smartphone");
        departmentDao.update(department);
        System.out.println("Update Completed! ");

        System.out.println("\n=== TEST 4: Department FindById ===");
        department = departmentDao.findById(1);
        System.out.println(department);

        System.out.println("\n=== TEST 5: Department FindAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 6: Department Delete ===");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Deleted completed!");

    }
}
