package senai_2021_tp.aula2;



public class CalculadoraPagamento {
    
    float resultadoFinal = 0; 
    public CalculadoraPagamento(CalculadoraPagamentoParameter parameterObject){
        Funcionario funcionario = new Funcionario();
        funcionario.dataNascimento = parameterObject.dataNascimento;
        funcionario.idade = parameterObject.idade;
        funcionario.nome = parameterObject.nome;
        funcionario.salario = parameterObject.salario;    
		try{
			validaFuncionario(funcionario);
		}catch(Exception i){
			System.out.println("errro na validcao");
		}
        resultadoFinal = calcularSalarioFuncionario(funcionario);
    }
    
	void validaFuncionario(Funcionario funcionario) throws Exception{
		if(funcionario.nome.equals("") || funcionario.idade ==0){
			throw new Exception("error funcionario");
		}
	}
	
    public float retornaCalculoFuncionario(){
        return resultadoFinal;
    }

    private float calcularSalarioFuncionario(Funcionario funcionario){
		
        float resultado = 0;
        if(salarioBaixo(funcionario)){
            float UmPorcento = 0.1f;
			resultado = calcularSalario(funcionario, UmPorcento);
        }
        if(salarioAlto(funcionario)){        	
            float doisPorcento = 0.2f;
			resultado = calcularSalario(funcionario, doisPorcento);
        }
        
        return resultado;        
    }

	private float calcularSalario(Funcionario funcionario, float UmPorcento) {
		return (funcionario.salario * UmPorcento) + funcionario.salario;
	}

	private boolean salarioAlto(Funcionario funcionario) {
		return funcionario.salario > 1000;
	}

	private boolean salarioBaixo(Funcionario funcionario) {
		return funcionario.salario < 1000;
	}
    
}




       



