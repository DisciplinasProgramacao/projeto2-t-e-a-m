public class App {

      
    public static void main(String[] args) throws Exception {
       Grafo testeAresta = new Grafo("Existe Vertice:\n");
       testeAresta.addVertice(1);
       testeAresta.addVertice(2);
       testeAresta.addAresta(1, 2);
       
       System.out.println("Nome Grafo\n"+ testeAresta.nome +"existeVertice - 1: "+ testeAresta.existeVertice(1)+ "\nexisteVertice - 2: "+testeAresta.existeVertice(2));
  
       System.out.println("\nNome grafo: \nExiste Aresta \n"+"\nAddAresta: "+ testeAresta.addAresta(1, 2)+ "\nExisteAresta: "+ testeAresta.existeAresta(1, 2));
    }
}

