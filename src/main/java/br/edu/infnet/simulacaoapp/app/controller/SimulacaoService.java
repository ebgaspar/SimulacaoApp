package br.edu.infnet.simulacaoapp.app.controller ;

import java.util.List ;
import java.util.Objects ;

import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.stereotype.Service ;
import org.springframework.transaction.annotation.Propagation ;
import org.springframework.transaction.annotation.Transactional ;

import br.edu.infnet.simulacaoapp.app.model.Simulacao ;
import br.edu.infnet.simulacaoapp.app.model.persistence.SimulacaoDao ;


@Service
public class SimulacaoService
{

	@Autowired
	private SimulacaoDao dao ;


	public SimulacaoService( )
	{

	}


	@Transactional ( propagation = Propagation.NEVER )
	public List< Simulacao > getSimulacao( )
	{

		return dao.getAll( ) ;
	}


	@Transactional ( propagation = Propagation.REQUIRED )
	public void persite( Simulacao simulacao )
	{

		dao.salvar( simulacao ) ;
	}


	@Transactional ( propagation = Propagation.REQUIRED )
	public void update( Simulacao simulacao )
	{

		dao.editar( simulacao ) ;
	}


	@Transactional ( propagation = Propagation.REQUIRED )
	public void delete( Integer id )
	{

		dao.deletar( id ) ;
	}


	@Transactional ( propagation = Propagation.NEVER )
	public Simulacao getSimulacao( String id )
	{

		Objects.requireNonNull( id , "nulo" ) ;

		Integer integer = Integer.valueOf( id ) ;
		return dao.findOne( integer ) ;
	}


	public SimulacaoDao getDao( )
	{

		return dao ;
	}


	public void setDao( SimulacaoDao dao )
	{

		this.dao = dao ;
	}

}
