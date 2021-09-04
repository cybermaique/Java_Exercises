package senai_2021_tp.aula3;


public class Main {

	public static void main(String[] args) {
		Televisao tv1 = new Televisao("samsung",42);
		Cadastrar c = new Cadastrar();
		c.adiciona(tv1);
		
		System.out.println(c.buscaTelevisao("cce"));
		

	}

}
