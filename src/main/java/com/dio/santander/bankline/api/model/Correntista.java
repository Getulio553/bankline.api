package com.dio.santander.bankline.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Embedded;

@Entity
@Table(name = "tab_correntista")
public class Correntista {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 20)
	private String cpf;
	
	@Column(length = 60)
	private String nome;
	
	@Embedded
	private String conta;
	
	public String getConta() {
		return conta;
	}
	public void setConta(String conta2) {
		this.conta = conta2;
	}
	public void setNome(String nome2) {
		// TODO Auto-generated method stub
		
	}
	public void setConta(Conta conta2) {
		// TODO Auto-generated method stub
		
	}
	public void setCpf(String cpf2) {
		// TODO Auto-generated method stub
		
	}

}
