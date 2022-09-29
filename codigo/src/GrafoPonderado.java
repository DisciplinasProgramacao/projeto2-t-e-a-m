public class GrafoPonderado extends GrafoMutavel{

    /**
     * Adiciona uma aresta entre dois vértices do grafo.
     * Não verifica se os vértices pertencem ao grafo.
     * 
     * @param origem  Vértice de origem
     * @param destino Vértice de destino
     */
	
	public GrafoPonderado(String nome, ABB<Vertice> vertices) {
	super(nome, vertices);
	
	}
	
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
    
    public boolean addAresta(int origem, int destino, int peso) {
    	
    	return false;
    }

    public void carregar(String nomeArquivo) {
    	
    }


    public GrafoPonderado subGrafo(Lista<Vertice> vertices) {
        Grafo subgrafo = new Grafo("Subgrafo de " + this.nome);

        return (GrafoPonderado) subgrafo;
    }


    
}
