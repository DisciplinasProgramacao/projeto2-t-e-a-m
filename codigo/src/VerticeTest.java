import org.junit.jupiter.api.Test;

class VerticeTest {

	Vertice vertice;

	@BeforeEach
	void setUp() throws Exception {
		vertice = new Vertice(1);

	}

	@Test
	void testAddAresta() {
		assertEquals(null, vertice.existeAresta(1));
		vertice.addAresta(1);
		assertNotEquals(null, vertice.existeAresta(1));
	}

	@Test
	void testAddArestaComPeso() {
		assertEquals(null, vertice.existeAresta(1));
		vertice.addAresta(1, 1);
		assertNotEquals(null, vertice.existeAresta(1));
	}

	@Test
	void testExisteAresta() {
		assertEquals(null, vertice.existeAresta(1));
		vertice.addAresta(1);
		assertNotEquals(null, vertice.existeAresta(1));
	}

	@Test
	void testGrau() {
		vertice.addAresta(1);
		vertice.addAresta(2);
		vertice.addAresta(3);
		assertEquals(3,vertice.grau());
		vertice.addAresta(4);
		assertEquals(4,vertice.grau());
	}

	@Test
	void testLimparVisita() {
		vertice.visitar();
		assertEquals(true, vertice.visitado());
		vertice.limparVisita();
		assertEquals(false, vertice.visitado());		
	}

	@Test
	void testVisitado() {
		assertEquals(false, vertice.visitado());		
		vertice.visitar();
		assertEquals(true, vertice.visitado());
	}

	@Test
	void testVisitar() {
		assertEquals(false, vertice.visitado());		
		vertice.visitar();
		assertEquals(true, vertice.visitado());;
	}

}
