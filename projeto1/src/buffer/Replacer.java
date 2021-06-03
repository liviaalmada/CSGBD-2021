package buffer;

import storage.Page;

public abstract class Replacer {
	
	/**
	 * Remove a página vítima de acordo com a política de substituição.
	 * 
	 * @return armazena o conteúdo da página vítima no parâmetro de saída e o
	 *         retorna. Se o Replacer estiver vazio, retorne null.
	 */
	abstract Page victim();

	/**
	 *  Marca um frame, indicando que ele não deve ser vítima 
	 *  até que seja liberado.
	 *  Este método deve ser chamado depois que uma página
	 *  é alocada em um frame no BufferPoolManager.
	 */
	void pin(int frameId) {
		
	}

	/**
	 * Libera um frame, indicando que agora ele pode ser vítima.
	 * Este método deve ser chamado quando o pinCount de uma página
	 * torna-se 0. Este método deve adicionar o frame que contém 
	 * a página desmarcada ao Replacer.
	 */
	void unpin(int frameId) {
		
	}

	/**Este método retorna o número de frames
	 * que podem ser escolhidos como vítimas .	  
	 */
	int size() {
		return 0;
	}

}
