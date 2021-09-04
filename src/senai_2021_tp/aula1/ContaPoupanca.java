package senai_2021_tp.aula1;

public class ContaPoupanca implements Conta{

	@Override
	public void depositar(float valor) {
		System.out.println("executando depositar de ContaPoupanca: " + valor);
		
	}

	@Override
	public void sacar(float valor) {
		System.out.println("executando depositar de ContaPoupanca: " + valor);		
	}

}
