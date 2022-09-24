package br.com.fiap.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/dados")
public class PessoaResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String[][] informacoes(){
		
		String[][] nomes = {{"Alê","1234567890","profale@fiap.com.br"},
							{"Fusaro","00000000","valevale@fiap.com.br"},
							{"Picabuloso","66666666666","cabuloto@fiap.com.br"},
							{"Emersão","3434343434","emerson@fiap.com.br"},
							{"Robert","092092328080","robert@fiap.com.br"}};
		return nomes;
	}

}
