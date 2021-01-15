package br.com.ufpb.quark.Exercicio1.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	private String Fullname;
	
	@Column(unique=true)
	private String CPF;
	
	private String telefone ;
	
	@Column(unique=true)
	private String email;
	
	private String senha;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER )
	@JoinTable(name = "seller" , joinColumns = {@JoinColumn(name = "user_id" , referencedColumnName = "id")}, inverseJoinColumns = {@JoinColumn(name = "id" , referencedColumnName = "user_id" )})
	//@JoinColumn(name = "seller_id", referencedColumnName = "user_id")
	
	private Seller seller;
	
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER )
	@JoinTable(name = "consumer" , joinColumns = {@JoinColumn(name = "user_id" , referencedColumnName = "id")}, inverseJoinColumns = {@JoinColumn(name = "id" , referencedColumnName = "user_id" )})
	private Consumer consumer;
	
	
	
	
	public Consumer getConsumer() {
		return consumer;
	}




	public void setConsumer(Consumer consumer) {
		this.consumer = consumer;
	}




	public long getId() {
		return id;
	}


	

	public User(long id, String fullname, String cPF, String telefone, String email, String senha, Seller seller,
			Consumer consumer) {
		super();
		this.id = id;
		Fullname = fullname;
		CPF = cPF;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.seller = seller;
		this.consumer = consumer;
	}




	public User() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", Fullname=" + Fullname + ", CPF=" + CPF + ", telefone=" + telefone + ", email="
				+ email + ", senha=" + senha + ", seller=" + seller + ", consumer=" + consumer + "]";
	}

	


	
	

}
