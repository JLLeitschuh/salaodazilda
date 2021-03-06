package br.com.pirone.salaodazilda.web.categoriaservico;

import java.io.Serializable;

import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import br.com.pirone.salaodazilda.domain.CategoriaServico;

@Named
@ViewScoped
public class IncluirCategoriaView implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private CategoriaServico categoriaInclusao = new CategoriaServico();
	
	public CategoriaServico getCategoriaInclusao() {
		return categoriaInclusao;
	}

	public void setCategoriaInclusao(CategoriaServico categoriaInclusao) {
		this.categoriaInclusao = categoriaInclusao;
	}

}

