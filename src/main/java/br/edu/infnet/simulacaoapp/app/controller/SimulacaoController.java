package br.edu.infnet.simulacaoapp.app.controller ;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.stereotype.Controller ;
import org.springframework.ui.Model ;
import org.springframework.web.bind.annotation.PathVariable ;
import org.springframework.web.bind.annotation.RequestMapping ;
import org.springframework.web.bind.annotation.RequestMethod ;

import br.edu.infnet.simulacaoapp.app.model.Simulacao ;

@Controller
public class SimulacaoController
{

	@Autowired
	private SimulacaoService service ;


	@RequestMapping ( value = "/simulacoes/list" , method = RequestMethod.GET )
	public String list( Model model )
	{

		List< Simulacao > simulacao = service.getSimulacao( ) ;
		model.addAttribute( "listaSimulacao" , simulacao ) ;
		return "simulacoes/list" ;
	}


	@RequestMapping ( value = "/simulacoes/form" , method = RequestMethod.GET )
	public String viewForm( Model model )
	{

		return "simulacoes/form" ;
	}


	@RequestMapping ( value = "/simulacoes/add" , method = RequestMethod.POST )
	public String save( Model model , Simulacao simulacao )
	{

		service.persite( simulacao ) ;
		return "redirect:/simulacoes/list" ;
	}


	@RequestMapping ( value = "/simulacoes/edit/{id}" , method = RequestMethod.GET )
	public String edit( @PathVariable ( "id" ) String id , Model model )
	{

		Simulacao simulacao = service.getSimulacao( id ) ;
		model.addAttribute( "simulacao" , simulacao ) ;
		return "simulacoes/edit" ;
	}


	@RequestMapping ( value = "/simulacoes/remove/{id}" , method = RequestMethod.GET )
	public String remove( @PathVariable ( "id" ) String id , Model model )
	{

		Simulacao simulacao = service.getSimulacao( id ) ;
		model.addAttribute( "simulacao" , simulacao ) ;
		service.delete( Integer.valueOf( id ) ) ;
		return "redirect:/simulacoes/list" ;

	}


	@RequestMapping ( value = "/simulacoes/update" , method = RequestMethod.POST )
	public String update( Model model , Simulacao simulacao )
	{

		service.update( simulacao ) ;
		return "redirect:/simulacoes/list" ;
	}


	public SimulacaoService getService( )
	{

		return service ;
	}


	public void setService( SimulacaoService service )
	{

		this.service = service ;
	}

}
