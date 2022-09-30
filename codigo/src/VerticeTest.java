import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VerticeTest {

	ABB<Aresta> arestas;
	private boolean visitado;
	// private int id;

	@BeforeEach
	void setUp() throws Exception {

		//criar um vertice
		
		// this.id = id;
		this.arestas = new ABB<Aresta>();
		this.visitado = false;
	}

	@Test
	void testAddAresta() {
		assertEquals(0, Aresta.class);
	}

	// @Test
	// void testExisteAresta() {
	// 	assertEquals(1, this.arestas(destino));
	// }

	@Test
	void testArestaApontandoPara() {

	}

	@Test
	void testGrau() {
		assertEquals(0, arestas.size());
	}

	@Test
	void testLimparVisita() {
		this.visitado = false;
		assertEquals(false, this.visitado);
	}

	@Test
	void testVisitado() {
		assertEquals(false, this.visitado);
	}

	@Test
	void testVisitar() {
		this.visitado = true;
		assertEquals(true, this.visitado);
	}

}
