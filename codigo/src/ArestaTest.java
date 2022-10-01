
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArestaTest {

	Aresta aresta;

	@BeforeEach
	void setUp() throws Exception {
		aresta = new Aresta(1, 5);
	}

	
	@Test
	void testDestino() {
		assertEquals(5, aresta.destino());

	}

	
	@Test
	void testLimparVisita() {
		aresta.visitar();
		assertTrue(aresta.visitada());
		aresta.limparVisita();
		assertFalse(aresta.visitada());

	}

	@Test
	void testPeso() {
		assertEquals(1, aresta.peso());
	}


	@Test
	void testVisitar() {
		aresta.visitar();
		assertTrue(aresta.visitada());
	}


	@Test
	void testVisitada() {
		aresta.visitar();
		assertTrue(aresta.visitada());
	}

}
