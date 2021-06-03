package buffer;

import storage.Page;

public abstract class Replacer {
	
	/**
	 * Remove a p�gina v�tima de acordo com a pol�tica de substitui��o.
	 * 
	 * @return armazena o conte�do da p�gina v�tima no par�metro de sa�da e o
	 *         retorna. Se o Replacer estiver vazio, retorne null.
	 */
	abstract Page victim();

	/**
	 *  Marca um frame, indicando que ele n�o deve ser v�tima 
	 *  at� que seja liberado.
	 *  Este m�todo deve ser chamado depois que uma p�gina
	 *  � alocada em um frame no BufferPoolManager.
	 */
	void pin(int frameId) {
		
	}

	/**
	 * Libera um frame, indicando que agora ele pode ser v�tima.
	 * Este m�todo deve ser chamado quando o pinCount de uma p�gina
	 * torna-se 0. Este m�todo deve adicionar o frame que cont�m 
	 * a p�gina desmarcada ao Replacer.
	 */
	void unpin(int frameId) {
		
	}

	/**Este m�todo retorna o n�mero de frames
	 * que podem ser escolhidos como v�timas .	  
	 */
	int size() {
		return 0;
	}

}
