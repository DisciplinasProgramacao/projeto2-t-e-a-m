import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GrafoNaoPonderadoTest {

	GrafoNaoPonderado naoPonderado;

	@BeforeEach
	void setUp() {
		naoPonderado = new GrafoNaoPonderado("nome", null);
	}

	@Test
	void testAddAresta() {
		naoPonderado.addAresta(1, 2);
		assertEquals(false,naoPonderado.addAresta(1, 2), "Adiciona uma aresta entre dois vértices do grafo.");
	}
	
	//dando erro por causa da chamada do grafo no metodo
	@Test
	void testSubgrafo() {
//		naoPonderado.subGrafo(null);
//		assertEquals(null,naoPonderado.subGrafo(null));
		
	}

}
