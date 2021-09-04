package senai_2021_tp.aula3.exercicios;


public class Main {

	public static void main(String[] args) {
		Televisao televisao01 = new Televisao("samsung",42);
		CadastroProduto cadastrar = new CadastroProduto();
		cadastrar.adicionar(televisao01);
		
		Televisao tvBuscada = cadastrar.buscaTelevisao("CCE");		
		System.out.println(tvBuscada.nome);
		

	}

}
