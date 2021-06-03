package buffer;

import java.util.HashMap;
import java.util.LinkedList;

import storage.Page;

public class BufferPoolManager {

	/** Número de págians no buffer pool. */
	int poolSize;
	/** Array de páginas no buffer pool. */
	Page pages[];

	/**
	 * Page table: para mapear as páginas do buffer pool pages.
	 * Mepeia o pageId para o frameId (localização no buffer)
	 */
	HashMap<Integer, Integer> pageTable;

	/** Replacer: encontra páginas não utilizadas (unpinned) para substituição.
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
   * Recupera uma página do buffer pool. 
   * @param pageId o id da página requisitada
   * @return a página requisitada
   */
	Page fetchPageImpl(int pageId) {
		return null;
	}

	/**
   * Aloca uma nova página no buffer pool.
   * @param id da nova página alocada
   * @return null se nenhum página foi alocada
   *  		 o objeto representando a página, c.c.
   */
	Page newPageImpl(int pageId) {
		return null;
	};
	
	/**
   * Libera a página do buffer pool.
   * @param pageId id da página
   * @param isDirty true se houve escrita na página e o isDirty 
   * 		da página deve ser marcado como true, false c.c.
   * @return false se antes da chamada o pinCount <= 0, true c.c.
   */
	boolean unpinPageImpl(int pageId, boolean isDirty) {
		return false;
	}

	
  /**
   * Desaloca a página do buffer pool.
   * @param 	pageId id da página a ser removida
   * @return 	false se a página existe mas não pode ser removida (está em uso), 
   * 			true se a página não existe ou foi removida com sucesso
   */
	void deletePageImpl(int pageId) {
		
	}
	
	/**
	* Escreve todas as páginas no disco.
	*  @return true se foi realizada com sucesso, false c.c.
	*/
	boolean flushAllPagesImpl() {
		return false;
	}
	
	/**
	 * Escreve a página no disco. 
	 * @param pageId
	 * @return true se foi realizada com sucesso, false c.c.
	 */
	boolean flushPageImpl(int pageId) {
		return false;
	}

}