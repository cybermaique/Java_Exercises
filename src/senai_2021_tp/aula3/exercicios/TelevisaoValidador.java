package senai_2021_tp.aula3.exercicios;

public class TelevisaoValidador {

	public void valida(Televisao televisao) throws Exception {
		
		if (televisao == null) {
			throw new Exception("Objecto Tv esta null");
		}
		
		boolean estaErradoParametros = televisao.nome.equals("") || (televisao.tamanho < 0 || televisao.tamanho > 100);
		
		if (estaErradoParametros) {
			throw new Exception("dados da tv estao incorretos");
		}
	}
}
