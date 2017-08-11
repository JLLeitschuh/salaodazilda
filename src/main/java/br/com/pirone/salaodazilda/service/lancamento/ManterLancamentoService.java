package br.com.pirone.salaodazilda.service.lancamento;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import br.com.pirone.salaodazilda.repository.ManterFuncionarioRepository;
import br.com.pirone.salaodazilda.repository.ManterLancamentoRepository;
import br.com.pirone.salaodazilda.repository.ManterServicoRepository;

@RequestScoped
public class ManterLancamentoService {
	
	@Inject
	private ManterLancamentoRepository repository;
	
	@Inject 
	private ManterServicoRepository servicoRepository;
	
	@Inject 
	private ManterFuncionarioRepository funcionarioRepository;

	public ManterLancamentoRepository getRepository() {
		return repository;
	}
	
	public ManterServicoRepository getServicoRepository() {
		return servicoRepository;
	}

	public ManterFuncionarioRepository getFuncionarioRepository() {
		return funcionarioRepository;
	}

}
