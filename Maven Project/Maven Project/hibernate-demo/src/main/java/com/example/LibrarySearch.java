package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

public class LibrarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter book name to search:");
        String bookName = sc.nextLine();

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        try {

            session.beginTransaction();

            
            Query<Student> query = session.createQuery(
                    "from Student where books = :book", Student.class);

            query.setParameter("book", bookName);

            List<Student> result = query.getResultList();

            if(result.isEmpty()){
                System.out.println("No record found!");
            }
            else{

                for(Student s : result){

                    System.out.println("Student Name: " + s.getName());
                    System.out.println("Book: " + s.getBooks());
                    System.out.println("Issued Date: " + s.getIssuedDate());
                    System.out.println("---------------------");

                }

            }

            session.getTransaction().commit();

        }
        finally {

            session.close();
            factory.close();

        }
        sc.close();
    }


}