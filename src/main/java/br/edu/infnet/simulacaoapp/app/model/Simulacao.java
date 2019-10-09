package br.edu.infnet.simulacaoapp.app.model ;

import javax.persistence.Entity ;
import javax.persistence.GeneratedValue ;
import javax.persistence.GenerationType ;
import javax.persistence.Id ;

@Entity
public class Simulacao
{


	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY )
	private Integer id ;

	private String nome ;

	private Boolean versao_final ; 

	private Integer versao ; 

	public Simulacao( )
	{

	}


	public Simulacao( String nome , Boolean vf )
	{

		super( ) ;
		this.setNome( nome ) ;
		this.setVersao_final( vf ) ;
	}

	public Integer getId( )
	{

		return id ;
	}


	public void setId( Integer id )
	{

		this.id = id ;
	}


	public String getNome( )
	{

		return nome;
	}


	public void setNome( String nome )
	{

		this.nome = nome;
	}


	public Boolean getVersao_final( )
	{

		return versao_final;
	}


	public void setVersao_final( Boolean versao_final )
	{

		this.versao_final = versao_final;
	}


	public Integer getVersao( )
	{

		return versao;
	}


	public void setVersao( Integer versao )
	{

		this.versao = versao;
	}


}
