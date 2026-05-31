package Driver;

import Dao.Dbutil;
import Entity.Employee;

import java.util.Scanner;

public class EmployeeDriver {

    private static int choice = 0;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Dbutil dbutil = new Dbutil();
        Dbutil.connecToDb();

        do {

            System.out.println("1.Insert\n2.Delete\n3.Update\n4.DisplayAll\n5.GetById\n0.Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    Employee emp = new Employee();

                    System.out.println("Enter Id");
                    emp.setId(sc.nextInt());

                    System.out.println("Enter Name");
                    sc.nextLine();
                    emp.setName(sc.nextLine());

                    System.out.println("Enter Department");
                    emp.setDepartment(sc.nextLine());

                    int rows = dbutil.insert(emp);

                    if (rows > 0) {
                        System.out.println(emp.getName() + " Employee Inserted Successfully");
                    } else {
                        System.out.println("Issue In Inserting");
                    }

                    break;

                case 2:

                    System.out.println("Enter Id");

                    if (dbutil.deleteByid(sc.nextInt())) {
                        System.out.println("Data Deleted");
                    } else {
                        System.out.println("Issue In Deleting Data");
                    }

                    break;

                case 3:

                    Employee e = new Employee();

                    System.out.println("Enter Id You Want To Update");
                    e.setId(sc.nextInt());

                    System.out.println("Enter Updated Name");
                    sc.nextLine();
                    e.setName(sc.nextLine());

                    System.out.println("Enter Updated Department");
                    e.setDepartment(sc.nextLine());

                    if (dbutil.update(e) > 0) {
                        System.out.println("Updated...");
                    } else {
                        System.out.println("Issue In Updating");
                    }

                    break;

                case 4:

                    dbutil.DisplayAll();

                    break;

                case 5:

                    System.out.println("Enter Id");
                    dbutil.getByid(sc.nextInt());

                    break;

                case 0:

                    System.out.println("Thank You");

                    break;

                default:

                    System.out.println("Enter Valid Choice");
            }

        } while (choice != 0);
    }
}