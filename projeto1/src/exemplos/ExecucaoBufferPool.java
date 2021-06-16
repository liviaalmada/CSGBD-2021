package exemplos;

import buffer.BufferPoolManager;

public class ExecucaoBufferPool {
	public static void main(String[] args) {
		int poolSize = 3;
		BufferPoolManager buffer = new BufferPoolManager(poolSize);
		
		// L� p�gina 
		// A p�gina n�o est� alocada, portanto nesse momento o buffer pool
		// dever� tamb�m alocar a p�gina no buffer
		// A leitura deve tamb�m atualizar o pincount
		buffer.fetchPageImpl(10);
		
		
		// L� p�gina. Dessa vez a p�gina j� est� em mem�ria, portanto
		// n�o vai precisar alocar no buffer 
		// A leitura deve tamb�m atualizar o pincount
		buffer.fetchPageImpl(10);
		
		
		// L� p�gina 
		// A p�gina n�o est� alocada, portanto nesse momento o buffer pool
		// dever� tamb�m alocar a p�gina no buffer
		// A leitura deve tamb�m atualizar o pincount
		buffer.fetchPageImpl(20);
		
		// Uma aplica��o libera a p�gina e escreve
		buffer.unpinPageImpl(20, true);
				
		
		// Uma aplica��o libera a p�gina, mas n�o escreve
		buffer.unpinPageImpl(10, false);
		
		// Uma aplica��o libera a p�gina, mas n�o escreve
		buffer.unpinPageImpl(10, true);
		
		// L� p�gina 
		// A p�gina n�o est� alocada, portanto nesse momento o buffer pool
		// dever� tamb�m alocar a p�gina no buffer. 
		// A leitura deve tamb�m atualizar o pincount
		buffer.fetchPageImpl(30);	
		
		
		// L� p�gina 
		// A p�gina n�o est� alocada, portanto nesse momento o buffer pool
		// dever� tamb�m alocar a p�gina no buffer.
		// Veja que o bufferest� cheio, ent�o nessa leitura o buffer deve escolher um p�gina v�tima
		// A leitura deve tamb�m atualizar o pincount
		buffer.fetchPageImpl(40);
	}

}
