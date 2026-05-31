package Driver;

import Dao.Dbutil;
import Entity.Book;

import java.util.Scanner;

public class BookDriver {

    private static int choice = 0;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Dbutil dbutil = new Dbutil();

        Dbutil.connecToDb();

        do {

            System.out.println(
                    "1.Insert\n2.Delete\n3.Update\n4.DisplayAll\n5.GetById\n0.Exit"
            );

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    Book book = new Book();

                    System.out.println("Enter Id");
                    book.setId(sc.nextInt());

                    System.out.println("Enter Book Name");
                    sc.nextLine();
                    book.setName(sc.nextLine());

                    System.out.println("Enter Subject");
                    book.setSubject(sc.nextLine());

                    int rows = dbutil.insert(book);

                    if (rows > 0) {
                        System.out.println("Book Inserted Successfully");
                    } else {
                        System.out.println("Issue In Inserting");
                    }

                    break;

                case 2:

                    System.out.println("Enter Id");

                    if (dbutil.deleteByid(sc.nextInt())) {
                        System.out.println("Data Deleted");
                    } else {
                        System.out.println("Issue In Deleting");
                    }

                    break;

                case 3:

                    Book b = new Book();

                    System.out.println("Enter Id");
                    b.setId(sc.nextInt());

                    System.out.println("Enter Updated Book Name");
                    sc.nextLine();
                    b.setName(sc.nextLine());

                    System.out.println("Enter Updated Subject");
                    b.setSubject(sc.nextLine());

                    if (dbutil.update(b) > 0) {
                        System.out.println("Updated Successfully");
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