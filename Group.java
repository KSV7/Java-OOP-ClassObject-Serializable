package com.gmail.kutepov89.sergey;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Group implements Serializable {
	private Human[] group;
	private static final long serialVersionUID = 1L;

	Group() {
		group = new Human[0];
	}

	public void addHuman(String name, int age, char sex) {
		Human[] c = new Human[group.length + 1];
		System.arraycopy(group, 0, c, 0, group.length);
		c[c.length - 1] = new Human(name, age, sex);
		group = c;
	}
	
	public static void saveStudentToDB(Group group) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("fil"))) {
			oos.writeObject(group);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Group readStudentFromDB(Group group) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("fil"))) {
			return (Group) ois.readObject();
		} catch (Exception e) {
			return null;
		}
	}
	
	public void printgroup() {
		for (Human k : group) {
			System.out.println(k);
		}
	}
}