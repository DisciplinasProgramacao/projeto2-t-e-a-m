public class GrafoCompleto extends Grafo {

	private int ordem;

	public GrafoCompleto(String nome, ABB<Vertice> vertices, int ordem) {
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
	public boolean completo() {
		boolean resposta = true;

		return resposta;
	}

	public Aresta existeAresta(int verticeA, int verticeB) {
		// Vertice saida = this.existeVertice(origem);
		// Vertice chegada = this.existeVertice(destino);
		// int destino = verticeB;
		Aresta aresta = vertices.find(verticeA).arestaApontandoPara(verticeB);
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

	public GrafoCompleto subGrafo(Lista<Vertice> vertices) {
		Grafo subgrafo = new Grafo("Subgrafo de " + this.nome);

		return (GrafoCompleto) subgrafo;
	}

}