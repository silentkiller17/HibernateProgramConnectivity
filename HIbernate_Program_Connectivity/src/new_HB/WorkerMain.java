package new_HB;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class WorkerMain {

	public static void main(String[] args) {
		SessionFactory sfactory = new Configuration().configure("Workerconfig.cfg.xml").buildSessionFactory();// Session
																												// factory
		Session ses = sfactory.openSession();// Session creation
		Transaction tx = null;
		tx = ses.beginTransaction();// start transaction
		Worker work = new Worker();// init object for jpa class
		ses.persist(work);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Your name");
		String st1 = sc.nextLine();

		System.out.println("enter Your salary");
		int sal = sc.nextInt();

		work.setWname(st1);// CRUD operation
		work.setWsalary(sal);
		String st;
		System.out.println(work.getId() + "   " + work.getWname() + "    " + work.getWsalary());// display the value
		ses.flush();
		tx.commit();
		ses.close();

	}

}