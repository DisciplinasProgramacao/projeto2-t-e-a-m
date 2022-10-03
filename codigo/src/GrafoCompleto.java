public class GrafoCompleto extends Grafo {

	private int ordem;

	public Grafo criarCompleto(Grafo grafo, int ordem) {
		super(nome);
		this.ordem = ordem;
		int destino;
		int origem;

		for (int i = 1; i < (ordem + 1); i++) {

			addVertice(i);

			if (i > 1) {

				for (int j = i; j > 1; j++) {
					origem = i - 1;
					destino = j;
					addAresta(origem, destino);

				}
			}
		}

		return grafo;
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
			saida.addAresta(1, destino);
			chegada.addAresta(1, origem);
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

	@Override
	public Aresta existeAresta(int verticeA, int verticeB) {
		/*
		 * Vertice saida = this.existeVertice(origem);
		 * Vertice chegada = this.existeVertice(destino);
		 * int destino = verticeB;
		 */
		Aresta aresta = vertices.find(verticeA).existeAresta(verticeB);
		if (aresta != null)
			return aresta;

		return null;
	}

	@Override
	public Vertice existeVertice(int idVertice) {
		return this.vertices.find(idVertice);
	}

	public boolean eureliano() {
		if (ordem > 0 && (ordem % 2) == 1) {
			return true;
		} else
			return false;
	}

	@Override
	public GrafoCompleto subGrafo(Lista<Vertice> vertices) {
		Grafo subgrafo = new Grafo("Subgrafo de " + this.nome);
		return (GrafoCompleto) subgrafo;
	}

}