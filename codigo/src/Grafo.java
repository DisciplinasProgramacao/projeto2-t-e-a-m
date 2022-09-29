/** 
 * MIT License
 *
 * Copyright(c) 2021 João Caram <caram@pucminas.br>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/**
 * Classe básica para um Grafo simples
 */
public class Grafo {
    public final String nome;
    //private
    protected ABB<Vertice> vertices;

    /**
     * Construtor. Cria um grafo vazio com capacidade para MAX_VERTICES
     */
    public Grafo(String nome) {
        this.nome = nome;
        this.vertices = new ABB<>();
    }

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

    public void salvar(String nomeArquivo) {

    }

    /**
     * Adiciona, se possível, um vértice ao grafo. O vértice é auto-nomeado com o
     * próximo id disponível.
     */
    public boolean addVertice(int id) {
        Vertice novo = new Vertice(id);
        return this.vertices.add(id, novo);
    }

    /**
     * Adiciona uma aresta entre dois vértices do grafo.
     * Não verifica se os vértices pertencem ao grafo.
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

    public Vertice existeVertice(int idVertice) {
        return this.vertices.find(idVertice);
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

    /**
     * Verifica se este é um grafo completo.
     * 
     * @return TRUE para grafo completo, FALSE caso contrário
     */
    public boolean completo() {
        boolean resposta = true;

        return resposta;
    }

    public Grafo subGrafo(Lista<Vertice> vertices) {
        Grafo subgrafo = new Grafo("Subgrafo de " + this.nome);

        return subgrafo;
    }

    public int tamanho() {
        return 0;
    }

    public int ordem() {
        return this.vertices.size();
    }

    public Grafo criarCompleto(Grafo grafo, int vertices) {
        int numVertices = vertices;
        int destino;
        int origem;

        for (int i = 1; i < numVertices; i++) {

            grafo.addVertice(i);

            if (i != 1) {
                for (int x = i; x > 1; x--) {
                    origem = i;
                    destino = x--;
                    grafo.addAresta(origem, destino);
                    grafo.addAresta(destino, origem);
                }
            }
        }

        return grafo;
    }

}
