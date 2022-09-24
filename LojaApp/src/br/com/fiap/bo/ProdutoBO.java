package br.com.fiap.bo;

import java.util.List;

import br.com.fiap.dao.ProdutoDAO;
import br.com.fiap.to.ProdutoTO;

public class ProdutoBO {
	
	private ProdutoDAO pd;
	
	public List<ProdutoTO> listar(){
		pd = new ProdutoDAO();
		return pd.select();
	}
	

}
