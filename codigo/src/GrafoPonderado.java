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
	
    @Override
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
    	boolean adicionou = false;
        Vertice saida = this.existeVertice(origem);
        Vertice chegada = this.existeVertice(destino);
        
       // Aresta pesado = this.;
        
        if (saida != null && chegada != null) {
            saida.addAresta(destino);
            chegada.addAresta(origem);
         //   pesado;
            adicionou = true;
        }

        return adicionou;
    }

    @Override
    public void carregar(String nomeArquivo) {
        ArquivoTextoLeitura arq = new ArquivoTextoLeitura(nomeArquivo);
        String linha = arq.ler();
        while (linha != null) {

            String[] vertices = linha.split(";");
            int id1 = Integer.parseInt(vertices[0]);
            int id2 = Integer.parseInt(vertices[1]);

            if (existeVertice(id1) == null) {
                this.addVertice(id1);
            }
            if (existeVertice(id2) == null) {
                this.addVertice(id2);
            }
            this.addAresta(id1, id2);

            linha = arq.ler();
        }

        arq.fecharArquivo();
    }


    @Override
    public GrafoPonderado subGrafo(Lista<Vertice> vertices) {
        Grafo subgrafo = new Grafo("Subgrafo de " + this.nome);

        return (GrafoPonderado) subgrafo;
    }


    
}
