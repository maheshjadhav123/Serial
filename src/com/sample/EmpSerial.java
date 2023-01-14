package com.sample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmpSerial {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		;
		Employee emp = new Employee();

		emp.setCity("pune");
		emp.setName("ram");

		try {

			fos = new FileOutputStream("C:\\Users\\Galaxy\\Desktop\\abcd.txt");

			oos = new ObjectOutputStream(fos);

			oos.writeObject(emp);

			System.out.println("serialization is done");

		} catch (Exception e) {

			System.out.println(e);
		} finally {
			fos.close();
			oos.close();

		}

	}
}