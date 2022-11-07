# Instruções de uso


Grafo:
/**
* Construtor. Cria um grafo vazio com capacidade para MAX_VERTICES
*/
Grafo(String nome)

/**
* Adiciona uma aresta entre dois vértices do grafo. Não verifica se os vértices
* pertencem ao grafo.
* 
* @param origem  Vértice de origem
* @param destino Vértice de destino
*/
addAresta(int origem, int destino)

/**
* Adiciona uma vértice ao grafo.
@param id ID da vértice.
*/
addVertice(int id)

/**
* Retorna o número de vértices no grafo.
*/
numVertices()

/**
* Retorna o número de arestas no grafo.
*/
numArestas()

/**
* Verifica se este é um grafo completo.
* numero de arestas x (numero de arestas -1)/2
* 
* @return TRUE para grafo completo, FALSE caso contrário
*/
completo()

/**
* Verifica se este é um grafo euleriano.
*/
euleriano()

/**
* Verifica a existência de uma aresta entre dois vértices
*/
existeAresta(int verticeA, int verticeB)

/*
* A ordem de um grafo G é dada pela cardinalidade do
* conjunto de vértices, ou seja, pelo número de
* vértices de G.
*/
ordem()

/**
* O tamanho de um grafo é a soma dos seus vértices e suas arestas.
* 
* @return número de vértices mais o número de arestas presentes no grafo.
*/
tamanho()



Aresta:
/**
* Construtor para arestas com ou sem peso
* @param peso Peso da aresta
* @param dest Vértice de destino
*/
Aresta(int peso, int destino)


/**
* Método de acesso para o destino da aresta
* @return the destino
*/
destino()

/**
* Limpa o estado de "visitada" da aresta.
*/
limparVisita()

/**
 * Método de acesso para o peso da aresta
* @return the peso
*/
peso()

/**
* Retorna e estado de "visitada" da aresta.
*/
visitada()

/**
* visita uma aresta.
*/
visitar()



grafo ponderado:

/**
* Adiciona aresta ponderada
*/
addAresta(int origem, int destino, int peso)



arquivos:

/**
* Abre o arquivo nomeado para sua leitura.
*/
ArquivoTextoLeitura(String nomeArquivo)

/**
* Abre o arquivo nomeado para sua escrita.
*/
ArquivoTextoEscrita(String nomeArquivo)

/**
* Fecha o arquivo aberto 
*/
fecharArquivo()

/**
* Lê uma linha do arquivo
*/
ler()

/**
* Escreve uma linha no arquivo
*/
escrever()
