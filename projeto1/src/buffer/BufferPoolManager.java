package buffer;

import java.util.HashMap;
import java.util.LinkedList;

import storage.Page;

public class BufferPoolManager {

	/** N�mero de p�gians no buffer pool. */
	int poolSize;
	/** Array de p�ginas no buffer pool. */
	Page pages[];

	/**
	 * Page table: para mapear as p�ginas do buffer pool pages.
	 * Mepeia o pageId para o frameId (localiza��o no buffer)
	 */
	HashMap<Integer, Integer> pageTable;

	/** Replacer: encontra p�ginas n�o utilizadas (unpinned) para substitui��o.
	 */
	Replacer replacer;

	/** Lista de ids de frames livres.
	 */
	LinkedList<Integer> freeList;

	/**
	 * Cria um novo BufferPoolManager. 
	 * @param poolSize a quantidade de frames do buffer pool
	 */
	BufferPoolManager(int poolSize) {

	}

	/**
   * Recupera uma p�gina do buffer pool. 
   * @param pageId o id da p�gina requisitada
   * @return a p�gina requisitada
   */
	Page fetchPageImpl(int pageId) {
		return null;
	}

	/**
   * Aloca uma nova p�gina no buffer pool.
   * @param id da nova p�gina alocada
   * @return null se nenhum p�gina foi alocada
   *  		 o objeto representando a p�gina, c.c.
   */
	Page newPageImpl(int pageId) {
		return null;
	};
	
	/**
   * Libera a p�gina do buffer pool.
   * @param pageId id da p�gina
   * @param isDirty true se houve escrita na p�gina e o isDirty 
   * 		da p�gina deve ser marcado como true, false c.c.
   * @return false se antes da chamada o pinCount <= 0, true c.c.
   */
	boolean unpinPageImpl(int pageId, boolean isDirty) {
		return false;
	}

	
  /**
   * Desaloca a p�gina do buffer pool.
   * @param 	pageId id da p�gina a ser removida
   * @return 	false se a p�gina existe mas n�o pode ser removida (est� em uso), 
   * 			true se a p�gina n�o existe ou foi removida com sucesso
   */
	void deletePageImpl(int pageId) {
		
	}
	
	/**
	* Escreve todas as p�ginas no disco.
	*  @return true se foi realizada com sucesso, false c.c.
	*/
	boolean flushAllPagesImpl() {
		return false;
	}
	
	/**
	 * Escreve a p�gina no disco. 
	 * @param pageId
	 * @return true se foi realizada com sucesso, false c.c.
	 */
	boolean flushPageImpl(int pageId) {
		return false;
	}

}