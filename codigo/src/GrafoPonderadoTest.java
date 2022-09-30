import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GrafoPonderadoTest {

	GrafoPonderado ponderado;
	
	@BeforeEach
	void setUp() {
	ponderado = new GrafoPonderado("nome",null);
	
	}

	@Test
	void testAddAresta() {
		ponderado.addAresta(1, 2);
		assertEquals(false,ponderado.addAresta(1, 2), "Adiciona uma aresta entre dois vértices do grafo.");
	}
	//verificar o erro
	@Test
	void testAddArestaComPeso() {
		ponderado.addAresta(1, 2, 3);
		assertEquals(true,ponderado.addAresta(1, 2, 3));
	}
	@Test
	void testCarregar() {
		
	}
	@Test
	void testSubGrafo() {
		
	}
}
