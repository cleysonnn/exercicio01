package br.com.ufpb.quark.Exercicio1.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Consumer {
	
	
	
	
	@Id
	private long user_id;
	@Column(unique=true)
	private String username;
	
	
	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	public Consumer(long user_id, String username) {
		super();
		this.user_id = user_id;
		this.username = username;
	}




	public long getUser_id() {
		return user_id;
	}


	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}




	@Override
	public String toString() {
		return "Consumer [user_id=" + user_id + ", username=" + username + "]";
	}


	
	
	
	 
	
	
	

}
