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
        assertNotEquals(ext3, null);

    }

    @Test
    void testAddAresta() {
        grafo.addVertice(1);
        grafo.addVertice(2);

        boolean adicionou1 = grafo.addAresta(1, 2);
        boolean adicionou2 = grafo.addAresta(3, 2);
        boolean adicionou3 = grafo.addAresta(1, 2);
        assertTrue(adicionou1);
        assertTrue(adicionou3);
        assertFalse(adicionou2);
    }

    @Test
    void testExisteAresta(){
        
    }

    @Test
    void testOrdem(){
        grafo.addVertice(1);
        grafo.addVertice(2);
        grafo.addVertice(3);

        int ordem = grafo.ordem();
        assertEquals(3, ordem);
    }
}
