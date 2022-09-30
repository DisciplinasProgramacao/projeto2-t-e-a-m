import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.*;


public class GrafoTest {

    Grafo grafo;

    @BeforeEach
    void setUp() throws Exception {
        grafo = new Grafo("teste");
    }

    @Test
    void testCarregar() {
        String caminho = "projeto2-t-e-a-m/codigo/src/grafo.txt";
        grafo.carregar(caminho);
        assertNotEquals(null, grafo.existeAresta(1, 2));
        assertNotEquals(null, grafo.existeAresta(3, 2));
        assertNotEquals(null, grafo.existeAresta(2, 1));
        assertNotEquals(null, grafo.existeAresta(1, 1));
        assertNotEquals(null, grafo.existeAresta(0, 0));

        assertNotEquals(null, grafo.existeVertice(1));
        assertNotEquals(null, grafo.existeVertice(2));
    }

    @Test
    void testAddVertice() {

        boolean ver1 = grafo.addVertice(1);
        boolean ver2 = grafo.addVertice(2);
        assertTrue(ver1);
        assertTrue(ver2);

    }

    @Test
    void testExisteVertice() {
        grafo.addVertice(1);

        Vertice ext1 = grafo.existeVertice(1);
        assertNotEquals(ext1, null);
        Vertice ext3 = grafo.existeVertice(3);
        assertEquals(ext3, null);

    }

    @Test
    void testAddAresta() {
        grafo.addVertice(1);
        grafo.addVertice(2);
        grafo.addVertice(3);


        boolean adicionou1 = grafo.addAresta(1, 2);
        boolean adicionou2 = grafo.addAresta(2, 3);
        boolean adicionou3 = grafo.addAresta(3, 4);
        assertTrue(adicionou1);
        assertTrue(adicionou2);
        assertFalse(adicionou3);
    }

    @Test
    void testExisteAresta() {
        grafo.addVertice(1);
        grafo.addVertice(2);
        grafo.addAresta(1, 2);

       // assertEquals(null, existeAresta(1,4));

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
    void testOrdem() {
        grafo.addVertice(1);
        grafo.addVertice(2);
        grafo.addVertice(3);

        int ordem = grafo.ordem();
        assertEquals(3, ordem);
    }





    @Test
    void testSalvar() {
        String caminho = "projeto2-t-e-a-m/codigo/src/grafo.txt";
        //String escreve = "";
        grafo.carregar(caminho);
        grafo.salvar(caminho);
    }

}
