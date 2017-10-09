package controller;

import java.util.ArrayList;
import java.util.List;

import database.IDatabase;
import database.DatabaseProvider;
import database.DerbyDatabase;

import model.User;

public class projectController {
	private IDatabase db;
	
	public projectController() {
		DatabaseProvider.setInstance(new DerbyDatabase());
		db = DatabaseProvider.getInstance();
	}

	
	public static boolean authenticate(User u, String pswd)
	{
		boolean real = false;
		if(u.getPassword().equals(pswd)){

			real = true;
		}

		return real;
	}
	
	
	//have the option for later options 
}
