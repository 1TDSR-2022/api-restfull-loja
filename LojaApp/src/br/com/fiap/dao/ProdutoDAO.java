package br.com.fiap.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.to.ProdutoTO;

public class ProdutoDAO {

	public static List<ProdutoTO> listaProduto;

	public ProdutoDAO() {
		
		if (listaProduto == null) {
			listaProduto = new ArrayList<ProdutoTO>();
			ProdutoTO pto = new ProdutoTO();
			pto.setCodigo(1);
			pto.setPreco(27.99);
			pto.setQuantidade(10);
			pto.setTitulo("Grampeador");
			listaProduto.add(pto);
			// mais 4 produtos
			
			pto = new ProdutoTO();
			pto.setCodigo(2);
			pto.setPreco(45.44);
			pto.setQuantidade(33);
			pto.setTitulo("Vassoura");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(3);
			pto.setPreco(137.90);
			pto.setQuantidade(80);
			pto.setTitulo("Mouse");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(4);
			pto.setPreco(99.90);
			pto.setQuantidade(120);
			pto.setTitulo("Teclado MK");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(5);
			pto.setPreco(32.99);
			pto.setQuantidade(500);
			pto.setTitulo("Chinelo");
			listaProduto.add(pto);
		}
	}
	
	//GET-ALL
	public List<ProdutoTO> select(){
		return listaProduto;
	}
	
	//GET-ID
	public ProdutoTO select(int id){
		for (int i = 0; i < listaProduto.size(); i++) {
			if (listaProduto.get(i).getCodigo() == id) {
				return listaProduto.get(i);
			}
		}
		return null;
	}

	public boolean insert(ProdutoTO pto) {
		pto.setCodigo(listaProduto.size() + 1);
		return listaProduto.add(pto);
	}
	
}