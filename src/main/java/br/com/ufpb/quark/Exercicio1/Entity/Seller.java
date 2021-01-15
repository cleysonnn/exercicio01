package br.com.ufpb.quark.Exercicio1.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seller {
		
	@Id
	private long user_id;
	
	@Column(unique = true) 
	private String username;

	private String cnpj;
	private String fantasy_name;
	private String social_name;
	
	


	
	
	

	public Seller(long user_id, String username, String cnpj, String fantasy_name, String social_name, User user) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.cnpj = cnpj;
		this.fantasy_name = fantasy_name;
		this.social_name = social_name;
		//this.user = user;
	}

	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}



	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getFantasy_name() {
		return fantasy_name;
	}

	public void setFantasy_name(String fantasy_name) {
		this.fantasy_name = fantasy_name;
	}

	public String getSocial_name() {
		return social_name;
	}

	public void setSocial_name(String social_name) {
		this.social_name = social_name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Seller [user_id=" + user_id + ", username=" + username + ", cnpj=" + cnpj + ", fantasy_name="
				+ fantasy_name + ", social_name=" + social_name + ", user="+ "]";
	}






	
	
	
	
	

}
