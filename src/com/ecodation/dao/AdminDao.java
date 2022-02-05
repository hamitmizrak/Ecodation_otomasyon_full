package com.ecodation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ecodation.dto.AdminDto;
import com.ecodation.util.IDaoConnection;

public class AdminDao implements IDaoConnection<AdminDto> {

	@Override
	public void create(AdminDto adminDto) {
		try (Connection connection = getInterfaceConnection()) {
			String sql = "insert into admin (admin_name,admin_surname) values (?,?) ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, adminDto.getAdminName());
			preparedStatement.setString(2, adminDto.getAdminSurname());
			int rowEffected = preparedStatement.executeUpdate();
			if (rowEffected > 0) {
				System.out.println(AdminDto.class + " başarıyla eklendi");
			} else {
				System.out.println("!!!! " + AdminDto.class + " başarısız eklenemedi");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(AdminDto adminDto) {
		try (Connection connection = getInterfaceConnection()) {
			String sql = "update  admin set admin_name=?,admin_surname=? where admin_id=? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, adminDto.getAdminName());
			preparedStatement.setString(2, adminDto.getAdminSurname());
			preparedStatement.setInt(3, adminDto.getAdminId());
			int rowEffected = preparedStatement.executeUpdate();
			if (rowEffected > 0) {
				System.out.println(AdminDto.class + " başarıyla güncellendi");
			} else {
				System.out.println("!!!! " + AdminDto.class + " başarısız güncellendi");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(AdminDto adminDto) {
		try (Connection connection = getInterfaceConnection()) {
			String sql = "delete from  admin where admin_id=? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, adminDto.getAdminId());
			int rowEffected = preparedStatement.executeUpdate();
			if (rowEffected > 0) {
				System.out.println(AdminDto.class + " başarıyla silindi");
			} else {
				System.out.println("!!!! " + AdminDto.class + " başarısız silindi");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public ArrayList<AdminDto> list() {
		ArrayList<AdminDto> listem = new ArrayList<>();
		AdminDto adminDto;
		try (Connection connection = getInterfaceConnection()) {
			String sql = "select * from admin  ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				adminDto = new AdminDto();
				adminDto.setAdminId(resultSet.getInt("admin_id"));
				adminDto.setAdminName(resultSet.getString("admin_name"));
				adminDto.setAdminSurname(resultSet.getString("admin_surname"));
				listem.add(adminDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listem;
	}

}
