package DAO;

import Models.LoginModel;

public interface LoginDAO {
	public LoginModel getone(String name, String pass);
}
