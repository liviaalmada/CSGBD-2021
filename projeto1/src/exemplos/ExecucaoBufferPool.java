package exemplos;

import buffer.BufferPoolManager;

public class ExecucaoBufferPool {
	public static void main(String[] args) {
		int poolSize = 3;
		BufferPoolManager buffer = new BufferPoolManager(poolSize);
		
		// Lê página 
		// A página não está alocada, portanto nesse momento o buffer pool
		// deverá também alocar a página no buffer
		// A leitura deve também atualizar o pincount
		buffer.fetchPageImpl(10);
		
		
		// Lê página. Dessa vez a página já está em memória, portanto
		// não vai precisar alocar no buffer 
		// A leitura deve também atualizar o pincount
		buffer.fetchPageImpl(10);
		
		
		// Lê página 
		// A página não está alocada, portanto nesse momento o buffer pool
		// deverá também alocar a página no buffer
		// A leitura deve também atualizar o pincount
		buffer.fetchPageImpl(20);
		
		// Uma aplicação libera a página e escreve
		buffer.unpinPageImpl(20, true);
				
		
		// Uma aplicação libera a página, mas não escreve
		buffer.unpinPageImpl(10, false);
		
		// Uma aplicação libera a página, mas não escreve
		buffer.unpinPageImpl(10, true);
		
		// Lê página 
		// A página não está alocada, portanto nesse momento o buffer pool
		// deverá também alocar a página no buffer. 
		// A leitura deve também atualizar o pincount
		buffer.fetchPageImpl(30);	
		
		
		// Lê página 
		// A página não está alocada, portanto nesse momento o buffer pool
		// deverá também alocar a página no buffer.
		// Veja que o bufferestá cheio, então nessa leitura o buffer deve escolher um página vítima
		// A leitura deve também atualizar o pincount
		buffer.fetchPageImpl(40);
	}

}
