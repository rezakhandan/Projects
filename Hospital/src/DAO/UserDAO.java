package DAO;

import Models.UserModel;

public interface UserDAO {
	public UserModel getone(String name, String pass);
}
