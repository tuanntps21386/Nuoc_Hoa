package com.poly.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poly.dao.AccountDAO;
import com.poly.entity.Account;
import com.poly.service.AccountService;




@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountDAO adao;
 

	@Override
	public Account findById(String username) {
		return adao.findById(username).get();
 	}

	@Override
	public List<Account> findAll() {
		return adao.findAll();
	}

	@Override
	public List<Account> getAdministrators() {
		return adao.getAdministrators();
	}

	@Override
	public Account update(Account account) {
		return adao.save(account); 
	}

	@Override
	public void deleteById(String username) {
		adao.deleteById(username); 	
	}



	@Override
	public List<Account> findRequest(String string) {
		return adao.findRequest(string); 
	}

	@Override
	public Account create(Account account) {
	    // Lưu đối tượng account vào cơ sở dữ liệu
	    return adao.save(account); 
	}


}
