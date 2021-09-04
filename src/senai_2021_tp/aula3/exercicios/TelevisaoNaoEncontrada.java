package senai_2021_tp.aula3.exercicios;



public class TelevisaoNaoEncontrada extends Televisao{

	public TelevisaoNaoEncontrada(String nome, int tamanho) {
		super(nome, tamanho);
		this.nome = "TV_NAO_ENCONTRADO";
		tamanho = 0;
	}

}
