package models;

public class User {
	private String username;
	private String nom;
	private String prenom;
	private String password;
	private String role;

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public User(String username, String password,String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;	
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}