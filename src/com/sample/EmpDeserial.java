package com.sample;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmpDeserial {

	

	public static void main(String[] args) {

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {

			fis = new FileInputStream("C:\\Users\\Galaxy\\Desktop\\abcd.txt");

			ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			Employee emp = (Employee) o;
			System.out.println(emp.getCity());
			System.out.println(emp.getName());

		} catch (Exception e) {

			System.out.println(e);

		} finally {

		}

	}

}
