import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GrafoTest {

    Grafo grafo;

    @BeforeEach
    void setUp() throws Exception {
        grafo = new Grafo("teste");
    }

    @Test
    void testCaminhoEureliano() {

    }

    @Test
    void testNumVertices() {
        grafo.addVertice(1);
        grafo.addVertice(2);
        assertEquals(2, grafo.numVertices());

    }

    @Test
    void testNumArestas() {
        grafo.addVertice(1);
        grafo.addVertice(2);
        grafo.addVertice(3);
        grafo.addVertice(4);
        grafo.addAresta(1, 2);
        grafo.addAresta(2, 3);
        grafo.addAresta(3, 4);
        assertEquals(3, grafo.numArestas());

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
    void testEureliano() {
    }

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
        grafo.addVertice(1);
        grafo.addVertice(2);
        grafo.addVertice(3);
        grafo.addVertice(4);
        grafo.addAresta(1, 2);
        grafo.addAresta(2, 3);
        grafo.addAresta(3, 4);
        assertEquals(7, grafo.tamanho());


    }

}