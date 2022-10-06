
class Vertice():
    def __init__(self, id):
        self.id = id
        self.visitado = False
        self.arestas = [] #estritamente arestas
    
    def addAresta(self, destino, peso):        
        a = Aresta(destino, peso)
        self.arestas.append(a)
    
    # def addAresta(self, destino):        
    #     a = Aresta(destino, 0)
    #     self.arestas.append(a)

    def existeAresta(self, destino):
        for i in range(0, len(self.arestas)):
            if (self.arestas[i].destino == destino):
                return True
        return False

    def grau(self):
        return len(self.arestas)

    def limparVisita(self):
        self.visitado = False

    def visitar(self):
        self.visitado = True

    def mostraArestas(self):
        for i in range(0, len(self.arestas)):
            print(self.id, ";", self.arestas[i].destino.id)



class Aresta():
    def __init__(self, destino, peso):
        self.destino = destino
        self.visitada = False
        self.peso = peso

    def limparVisita(self):
        self.visitada = False
    
    def visitar(self):
        self.visitada = True



class Grafo():
    def __init__(self, nome):
        self.nome = nome
        self.vertices = [] #estrimemnte vértices

    def completo(self):
        for i in range(0, len(self.vertices)):
            if(self.vertices[i].grau() < len(self.vertices)-1):
                return False
        return True

    def ordem(self):
        return len(self.vertices)

    def tamanho(self):
        aux = 0
        for i in range(self.ordem()):
            aux += self.vertices[i].grau()
        return self.ordem() + aux

    def existeVertice(self, vertice):
        return vertice in self.vertices

    def existeAresta(self, verA, verB):
        return verA.existeAresta(verB)

    def mostraVertices(self):
        for i in range(self.ordem()):
            print(self.vertices[i].id)

    def subgrafo(self):
        pass

    def caminhoEuleriano(self):
        pass

    def euleriano(self):
        pass

    
    


g = Grafo("grafo completo")
va = Vertice(0)
vb = Vertice(1)
vc = Vertice(2)

va.addAresta(vb, 0)
va.addAresta(vc, 0)
vb.addAresta(va, 0)
vb.addAresta(vc, 0)
vc.addAresta(vb, 0)
vc.addAresta(va, 0)

g.vertices.append(va)
g.vertices.append(vb)
g.vertices.append(vc)

g.mostraVertices()

g1 = Grafo("grafo")
v0 = Vertice(0)
v1 = Vertice(1)
v2 = Vertice(2)
v3 = Vertice(3)
v4 = Vertice(4)

v0.addAresta(v1, 0)
v1.addAresta(v3, 0)
v2.addAresta(v1, 0)
v3.addAresta(v2, 0)
v3.addAresta(v4, 0)
v4.addAresta(v0, 0)