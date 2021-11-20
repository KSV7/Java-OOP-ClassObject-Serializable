package com.gmail.kutepov89.sergey;

public class Main {
	
	public static void main(String[] args) {
		
		Group PN121 = new Group();
		
		PN121.addHuman("Alexander", 21, 'м');
		PN121.addHuman("Alexey", 18, 'м');
		PN121.addHuman("Katia", 18, 'ж');
		
		System.out.println();
		System.out.println("Вывод данных исходного объекта");
		System.out.println();
		
		PN121.printgroup();

		Group.saveStudentToDB(PN121);
		
		Group PN122 = null;
		PN122 = Group.readStudentFromDB(PN122);
		
		System.out.println();
		System.out.println("Вывод данных считанного объекта из мини базы данных");
		System.out.println();
		
		PN122.printgroup();
	}
	
}