package com.ecodation.main;

import javax.swing.JOptionPane;

import com.ecodation.controller.AdminController;
import com.ecodation.dto.AdminDto;

public class AdminMainTest {

	public static void main(String[] args) {

		// // create
		String adminName = JOptionPane.showInputDialog("lütfen admin adını giriniz");
		String adminSurname = JOptionPane.showInputDialog("lütfen admin soyadını giriniz");
		AdminDto adminDto = AdminDto.builder().adminName(adminName).adminSurname(adminSurname).build();
		AdminController adminController1 = new AdminController();
		adminController1.create(adminDto);

		// update
		// String adminId = JOptionPane.showInputDialog("lütfen admin id giriniz");
		// int id = Integer.valueOf(adminId);
		// String adminName = JOptionPane.showInputDialog("lütfen admin adını giriniz");
		// String adminSurname = JOptionPane.showInputDialog("lütfen admin soyadını giriniz");
		// AdminDto adminDto = AdminDto.builder().adminName(adminName).adminSurname(adminSurname).adminId(id).build();
		// AdminController adminController2 = new AdminController();
		// adminController2.update(adminDto);

		// // delete
		// String adminId = JOptionPane.showInputDialog("lütfen silmek istediğiniz admin id giriniz");
		// int id = Integer.valueOf(adminId);
		// AdminDto adminDto = AdminDto.builder().adminId(id).build();
		// AdminController adminController3 = new AdminController();
		// adminController3.delete(adminDto);

		// liste

		AdminController adminController4 = new AdminController();
		// 1.YOL
		adminController4.list().forEach(System.out::println);

		// 2.YOL
		// for (AdminDto temp : adminController.list()) {
		// System.out.println(temp + " ");
		// }
		//

	}

}
