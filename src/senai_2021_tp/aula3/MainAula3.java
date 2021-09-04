package senai_2021_tp.aula3;

import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.CertPathTrustManagerParameters;

public class MainAula3 {

	// id, nome pessoa
	Map<Integer,String> mapa = new HashMap<Integer,String>();
	// id
	Map<Integer,Pessoa> mapaPessoa = new HashMap<Integer,Pessoa>();
	
	public static void main(String[] args) {

		MainAula3 main = new MainAula3();
		String nomePessoa = main.retornaNomePeloId(5);
		System.out.println("Nome buscado:" + nomePessoa);
		if(nomePessoa.length() > 5) {
			System.out.println("O nome da pessoa tem mais de 5 caracteres");
		}
		
		System.out.println("---------------");
		
		Pessoa pessoaProcurada = main.retornaPessoaPeloId(1);
		System.out.println("O nome da pessoa é: " + pessoaProcurada.nome);
		System.out.println("A idade da pessoa é: " + pessoaProcurada.idade);

		//--------------
		System.out.println("---------------");
		//--------
		
		Pessoa pessoaProcurada2 = main.retornaPessoaPeloId_2(5);
		if(pessoaProcurada2 instanceof PessoaNaoEncontrada) {
			System.out.println("não localizado");
		}else {
			System.out.println("O nome da pessoa é: " + pessoaProcurada2.nome);
			System.out.println("A idade da pessoa é: " + pessoaProcurada2.idade);
		}
		
	}
	
	public MainAula3() {
		mapa.put(1, "marcelo");
		mapa.put(2, "joao");
		mapa.put(3, "maria");
		mapa.put(4, "jesus");	
		//
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Patricia";
		pessoa1.idade = 40;
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Pedro";
		pessoa2.idade = 30;
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.nome = "Ines";		
		pessoa3.idade = 50;
		
		Pessoa pessoa4 = new Pessoa();
		pessoa4.idade = 30;
		
		mapaPessoa.put(1, pessoa1);
		mapaPessoa.put(2, pessoa2);
		mapaPessoa.put(3, pessoa3);
		mapaPessoa.put(4, pessoa4);
	}
	
	public void salvarPessoa(Pessoa pessoa) {
		validaPessoa(pessoa);
		mapaPessoa.put(1, pessoa);
	}
	
	private void validaPessoa(Pessoa pessoa) {
		if(pessoa.nome == null) {
			throw new IllegalArgumentException("nome invalido");
		}
		if(pessoa.idade < 0) {
			throw new IllegalArgumentException("idade invalida");
		}
	}
	
	public Pessoa retornaPessoaPeloId(Integer id) {
		Pessoa pessoaBuscada = mapaPessoa.get(id);
		if(pessoaBuscada == null) {
			pessoaBuscada = new Pessoa();
			pessoaBuscada.nome = "PESSOA_NAO_EXISTE";
			pessoaBuscada.idade = 0;
		}
		return pessoaBuscada;
	}
	
	public Pessoa retornaPessoaPeloId_2(Integer id) {
		Pessoa pessoaBuscada = mapaPessoa.get(id);
		if(pessoaBuscada == null) {
			pessoaBuscada =  new PessoaNaoEncontrada();
		}
		return pessoaBuscada;
	}
	
	public String retornaNomePeloId(Integer id) {
		String nomePessoa = mapa.get(id);
		if(nomePessoa == null) {
			nomePessoa = "";
		}
		return nomePessoa;
	}
	
	public void outroMetodo(String nomePessoa) {
		// faz alguma coisa.
	}
	
	
	private void executaCalculaFolhaPagamento(float salario) {
		// aqui executo a rotina de fato, do calculaFolhaPagamento
		// aqui poderia ter umas 20 linhas.
	}
	
	public void calculaFolhaPagamento(float salario) {
		try {
			executaCalculaFolhaPagamento(salario);		

		}catch(Exception e) {
			// aqui trato, caso houver algum erro no calculo da folha pagamento.
		}
	}
	
	

}
