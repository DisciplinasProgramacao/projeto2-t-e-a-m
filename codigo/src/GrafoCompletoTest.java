import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GrafoCompletoTest {

	GrafoCompleto grafoCompleto;

	@BeforeEach
	void setUp() {
		grafoCompleto = new GrafoCompleto("Teste Grafo Completo", 5);
	}

	@Test
	void testGetOrdem() {
		assertEquals(5,grafoCompleto.getOrdem());
	}

	@Test
	void testSetOrdem() {
		assertEquals(5,grafoCompleto.getOrdem());
		grafoCompleto.setOrdem(6);
		assertEquals(7,grafoCompleto.getOrdem());
	}

	@Test
	void testCompleto() {
        assertTrue(grafoCompleto.completo());
        
        grafoCompleto.addVertice(5);
        assertFalse(grafoCompleto.completo());
	}

	@Test
	void testExisteAresta() {
//		GrafoCompleto grafoCompleto = new GrafoCompleto("grafoCompleto", 1);
//		grafoCompleto.existeAresta(1, 2);

	}

	@Test
	void testExisteVertice() {

        assertNotNull(grafoCompleto.existeVertice(1));

	}

	@Test
	void testEureliano() {

	}

	@Test
	void testSubgrafo() {

	}

}
