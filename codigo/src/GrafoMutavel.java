public class GrafoMutavel extends Grafo {

	public GrafoMutavel(String nome, ABB<Vertice> vertices) {
		super(nome);

	}

	/**
	 * Adiciona uma aresta entre dois vértices do grafo. Não verifica se os vértices
	 * pertencem ao grafo.
	 * 
	 * @param origem  Vértice de origem
	 * @param destino Vértice de destino
	 */
	public boolean addAresta(int origem, int destino) {
		boolean adicionou = false;
		Vertice saida = this.existeVertice(origem);
		Vertice chegada = this.existeVertice(destino);
		if (saida != null && chegada != null) {
			saida.addAresta(destino);
			chegada.addAresta(origem);
			adicionou = true;
		}

		return adicionou;

	}

	/**
	 * Adiciona, se possível, um vértice ao grafo. O vértice é auto-nomeado com o
	 * próximo id disponível.
	 */
	public boolean addVertice(int id) {
		Vertice novo = new Vertice(id);
		return this.vertices.add(id, novo);
	}

	public void carregar(String nomeArquivo) {
		
	}

	public boolean delAresta(int origem, int destino) {
		boolean arestaApagada = false;

		return arestaApagada;
	}

	public boolean delVertice(int idVertice) {
		boolean verticeApagada = false;

		Vertice vertice = new Vertice(idVertice);
		
		//this.vertices.allElements(null);
		
		return verticeApagada;
	}

	//verificar
	public void salvar(String nomeArquivo) {
		Vertice[] ver = new Vertice[vertices.size()];
        vertices.allElements(ver);
        ArquivoTextoEscrita arq = new ArquivoTextoEscrita(nomeArquivo);

        for(int i=0; i<vertices.size(); i++){
            for(int j=0; j<vertices.size(); j++){
                if(ver[i].arestaApontandoPara(j) != null){
                    System.out.println(i + ";" + j);
                    arq.escrever(i + ";" + j);
                }
            }
        }
        arq.fecharArquivo();
	}

}
