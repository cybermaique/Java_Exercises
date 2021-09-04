package senai_2021_tp.aula3.exercicios;

import java.util.ArrayList;
import java.util.List;

public class CadastroProduto {

	TelevisaoValidador televisaoVAlidador = new TelevisaoValidador();
	List<Televisao> listaTv = new ArrayList<>();

	public void adicionar(Televisao televisao) {
		try {
			processaAdicionar(televisao);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void processaAdicionar(Televisao televisao) throws Exception {
			televisaoVAlidador.valida(televisao);
			listaTv.add(televisao);
	}
	
	public Televisao buscaTelevisao(String nome) {
		Televisao retorno = null;
		for (Televisao tv : listaTv) {
			if (tv.nome.equals(nome)) {
				retorno = tv;
			}
		}
		if(retorno == null) {
			retorno = new TelevisaoNaoEncontrada("", 0);
		}
		return retorno;
	}	

}
