package com.ecodation.main;

import com.ecodation.controller.AdminController;

public class AdminMainTest {

	public static void main(String[] args) {

		// // create
		// String adminName = JOptionPane.showInputDialog("lütfen admin adını giriniz");
		// String adminSurname = JOptionPane.showInputDialog("lütfen admin soyadını giriniz");
		// AdminDto adminDto = AdminDto.builder().adminName(adminName).adminSurname(adminSurname).build();
		// AdminController adminController = new AdminController();
		// adminController.create(adminDto);

		// update
		// String adminId = JOptionPane.showInputDialog("lütfen admin id giriniz");
		// int id = Integer.valueOf(adminId);
		// String adminName = JOptionPane.showInputDialog("lütfen admin adını giriniz");
		// String adminSurname = JOptionPane.showInputDialog("lütfen admin soyadını giriniz");
		// AdminDto adminDto = AdminDto.builder().adminName(adminName).adminSurname(adminSurname).adminId(id).build();
		// AdminController adminController = new AdminController();
		// adminController.update(adminDto);

		// // delete
		// String adminId = JOptionPane.showInputDialog("lütfen silmek istediğiniz admin id giriniz");
		// int id = Integer.valueOf(adminId);
		// AdminDto adminDto = AdminDto.builder().adminId(id).build();
		// AdminController adminController = new AdminController();
		// adminController.delete(adminDto);

		// liste

		AdminController adminController = new AdminController();
		// 1.YOL
		adminController.list().forEach(System.out::println);

		// 2.YOL
		// for (AdminDto temp : adminController.list()) {
		// System.out.println(temp + " ");
		// }
		//

	}

}
