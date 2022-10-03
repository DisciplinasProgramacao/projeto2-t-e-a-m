public class GrafoCompleto extends Grafo {

	private int ordem;

	public GrafoCompleto(String nome, int ordem) {
		super(nome);
		setOrdem(ordem);
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	/**
	 * Verifica se este é um grafo completo.
	 * 
	 * @return TRUE para grafo completo, FALSE caso contrário
	 */
	@Override
	public boolean completo() {
        int numVertices = numVertices();
        int numArestas = numArestas();

        if (numArestas == numVertices * (numVertices - 1) / 2)
            return true;
        else
            return false;
    }

    public Aresta existeAresta(int verticeA, int verticeB) {
        /* Vertice saida = this.existeVertice(origem);
        * Vertice chegada = this.existeVertice(destino);
        * int destino = verticeB;
        */
        Aresta aresta = vertices.find(verticeA).existeAresta(verticeB);
        if (aresta != null)
            return aresta;

        return null;
    }

    public Vertice existeVertice(int idVertice) {
        return this.vertices.find(idVertice);
    }

	public boolean eureliano() {
		return false;
	}

	@Override
	public GrafoCompleto subGrafo(Lista<Vertice> vertices) {
		Grafo subgrafo = new Grafo("Subgrafo de " + this.nome);
		return (GrafoCompleto) subgrafo;
	}

}