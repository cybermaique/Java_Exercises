package senai_2021_tp.aula2;

public class PrincipalExercicio {

	private String nome; // armazena o nome.
	
	
	public static void main(String[] args) {
		
		float salario = 1000f;	
		boolean eSalarioAlto = salario > 1000f;
		
		if(eSalarioAlto(salario)) { // sallario > 1000 e alto
			System.out.println("salario alto");
		}		
		
	}
	
	public static boolean eSalarioAlto(float salario) {
		return salario > 1000;
	}
	
	public void executarAlgumaCoisa() {
		try {
			executarOperacoes();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Deu erro, desculpa");			
		}
	}
	
	public void executarOperacoes() {
		// executa operacao 1
		// executa operacao 2
		// executa operacao 3
	}
	
	// se retornar -1 = error, senão 1 é ok
	public int processarComRetornoNumerico() {
		// processa a
		// processa b
		if(true) {
			return -1 ;// -1 significa error;
		}else {
			return 1;
		}
	}
	
	public int processarComExcessao() throws Exception{
		// processa a
		// processa b
		if(true) {
			throw new Exception("ocorreu um erro ao salvar no hd");
		}
		return 0;
	}
	
	 int buscarChave(String id) throws Exception{
		 boolean idInvalido = id == null || id == "";
		 
		 if(idInvalido){
			      throw new Exception("ID invalido");
		}else{
		  /// busca chave			 
			return 10; // iria no banco de dados, e retornaria o id (pk). 
		}
	 }
	 
	 

}
