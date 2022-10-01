import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GrafoTest {

    Grafo grafo;

    @BeforeEach
    void setUp() throws Exception {
        grafo = new Grafo("teste");
    }

    @Test
    void testCaminhoEureliano(){

    }

    @Test
    void testNumVertices(){

    }

    @Test
    void testNumArestas(){

    }


    @Test
    void testCompleto() {
        grafo.addVertice(1);
        grafo.addVertice(2);
        grafo.addVertice(3);
        grafo.addVertice(4);
        grafo.addAresta(1, 2);
        grafo.addAresta(1, 3);
        grafo.addAresta(1, 4);
        grafo.addAresta(2, 3);
        grafo.addAresta(2, 4);
        grafo.addAresta(3, 4);
        assertTrue(grafo.completo());
        
        grafo.addVertice(5);
        assertFalse(grafo.completo());

    }

    @Test
    void testEureliano(){





    @Test
    void testExisteAresta() {
        grafo.addVertice(1);
        grafo.addVertice(2);
        grafo.addVertice(3);
        grafo.addAresta(1, 2);
        grafo.addAresta(2, 3);
        grafo.addAresta(3, 4);
        


       // assertEquals(null, existeAresta(1,4));

    }




    @Test
    void testOrdem() {
        grafo.addVertice(1);
        grafo.addVertice(2);
        grafo.addVertice(3);

        int ordem = grafo.ordem();
        assertEquals(3, ordem);
    }


    @Test
    void testExisteVertice() {
        assertEquals(null, grafo.existeVertice(1));
        grafo.addVertice(1);
        grafo.addVertice(3);
        assertNotEquals(2, grafo.existeVertice(2));
     }

     @Test
     void testSubGrafo() {
    
    }
    
    @Test
    void testTamanho() {
   
   }

      // }

    // @Test
    // void testAddAresta() {
    //     grafo.addVertice(1);
    //     grafo.addVertice(2);
    //     grafo.addVertice(3);
    //     assertTrue(grafo.addAresta(1, 2));
    //     assertTrue(grafo.addAresta(2, 3));
    //     assertFalse(grafo.addAresta(3, 4));
    // }

    // @Test
    // void testCriarCompleto() {
    //     grafo.criarCompleto(grafo,4);
    //     assertTrue(grafo.completo());     
    //     grafo.addVertice(5);
    //     assertFalse(grafo.completo());

    // }

        // @Test
    // void testCarregar() {
    //     String caminho = "C:/Users/andre/github-classroom/DisciplinasProgramacao/projeto2-t-e-a-m/codigo/src/grafo.txt";
    //     grafo.carregar(caminho);
    //     assertNotEquals(null, grafo.existeAresta(1, 2));
    //     assertNotEquals(null, grafo.existeAresta(3, 2));
    //     assertNotEquals(null, grafo.existeAresta(2, 1));
    //     assertNotEquals(null, grafo.existeAresta(1, 1));
    //     assertNotEquals(null, grafo.existeAresta(0, 0));

    //     assertNotEquals(null, grafo.existeVertice(1));
    //     assertNotEquals(null, grafo.existeVertice(2));
    // }




    // @Test
    // void testSalvar() {
    //     String caminho = "C:/Users/andre/github-classroom/DisciplinasProgramacao/projeto2-t-e-a-m/codigo/src/grafo.txt";
    //     grafo.carregar(caminho);
    //     grafo.salvar(caminho);
    // }

    // @Test
    // void testAddVertice() {
    //     grafo.addVertice(1);
    //     grafo.addVertice(2);
    //     grafo.addVertice(3);
    //     grafo.addVertice(4);
    //     grafo.addVertice(5);
    //     assertEquals(5,grafo.numVertices());
    //     grafo.addVertice(6);
    //     assertEquals(6,grafo.numVertices());
    // }

    // busca em profundidade - gera uma arvore
    // caminho - criar uma string com caminho ou criar atributo pai - depende da busca em profundidade
    // caminho eureliano
}
