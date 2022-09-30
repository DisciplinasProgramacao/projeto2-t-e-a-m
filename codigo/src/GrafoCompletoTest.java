import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GrafoCompletoTest {

	GrafoCompleto completo;

	@BeforeEach
	void setUp() {
		completo = new GrafoCompleto("completo", 1);
	}

	@Test
	void testCompleto() {
	}

	@Test
	void testExisteAresta() {
//		GrafoCompleto completo = new GrafoCompleto("completo", 1);
//		completo.existeAresta(1, 2);

	}

	@Test
	void testExisteVertice() {
		completo.addVertice(1); // Vertice@d9345cd
		assertEquals(1, completo.existeVertice(1),
				"informa erro mas esta encontrando o endereco, ou seja, existe vertice");
	}

	@Test
	void testEureliano() {

	}

	@Test
	void testSubgrafo() {

	}

}
