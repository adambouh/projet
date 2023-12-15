package businessLayer;

import java.util.ArrayList;
import java.util.Hashtable;

import dataLayer.DataAccountsManager;
import models.*;

public class AccountsManager implements InterfaceAccountsManager  {
	public AccountsManager(){}
	DataAccountsManager db=new 	DataAccountsManager();
	@Override
	public void AddAccount(User p) {
		// TODO Auto-generated method stub
		db.AddAccount(p);
	}
	public User getUserByUsername(String userName) {
		// TODO Auto-generated method stub
		return db.getUserByUsername( userName);
	}

	@Override
	public void AddAccount(String userName, String password) {
		// TODO Auto-generated method stub
		User x=new User(userName, password);
		AddAccount(x);
	}

	@Override
	public Boolean ValidateAccount(String userName, String password) {
		// TODO Auto-generated method stub
		User x=new User(userName, password);
		return db.ValidateAccount(x);
	}

	@Override
	public Boolean ValidateAccount(User p) {
		// TODO Auto-generated method stub
		return db.ValidateAccount(p);
	}
	@Override
	public User getUserbyUsername(String username) {
		return db.getUserByUsername(username);
	}
	
	@Override
	public Hashtable<String, String> GetAccounts() {
		// TODO Auto-generated method stub
		return db.GetAccounts();
	}
	@Override
	public boolean isDirecteur(String username){
		return db.isDirecteur(username);
	}
	@Override
	public boolean isChefDeProjet(String username,Projet p){
		return db.isChefProjet(username, p);
	}
	@Override
	public ArrayList<User> getDevs(){
		return db.getDevs();

	}
	@Override
	public boolean isDeveloppeur(String username) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public ArrayList<Methodologie> getDeveloperMethodology(int Id)
	{
		return db. getDeveloperMethodology(Id);
	}
	@Override 
	public ArrayList<Technologie> getDeveloperTechnology(int Id)
	{
		return db. getDeveloperTechnology(Id);
	}
	  public void updateUser(User user) {
	        db.updateUser(user);
	    }

		

}
