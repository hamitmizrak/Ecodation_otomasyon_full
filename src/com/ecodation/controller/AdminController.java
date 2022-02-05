package com.ecodation.controller;

import java.util.ArrayList;

import com.ecodation.dao.AdminDao;
import com.ecodation.dto.AdminDto;
import com.ecodation.util.IDaoConnection;

public class AdminController implements IDaoConnection<AdminDto> {

	@Override
	public void create(AdminDto adminDto) {
		AdminDao adminDao = new AdminDao();
		adminDao.create(adminDto);
	}

	@Override
	public void update(AdminDto adminDto) {
		AdminDao adminDao = new AdminDao();
		adminDao.update(adminDto);

	}

	@Override
	public void delete(AdminDto adminDto) {
		AdminDao adminDao = new AdminDao();
		adminDao.delete(adminDto);

	}

	@Override
	public ArrayList<AdminDto> list() {
		AdminDao adminDao = new AdminDao();
		return adminDao.list();
	}

}
