import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GrafoMutavelTest {

	GrafoMutavel mutavel;
	
	@BeforeEach
	void setUp() {
		mutavel = new GrafoMutavel("mutavel",null);
	}
	
	@Test
	void testAddAresta() {
		mutavel.addAresta(1, 2);
		assertEquals(true, mutavel.addAresta(1, 2));
	}
	@Test
	void testAddVertice() {
		mutavel.addVertice(1);
		assertEquals(true, mutavel.addVertice(1));
	}
	@Test
	void testCarregar() {
		
	}
	@Test
	void testDelAresta() {
		mutavel.delAresta(1, 2);
		assertEquals(true, mutavel.delAresta(1, 2));
	}
	@Test
	void testDelVertice() {
		mutavel.delVertice(1);
		assertEquals(true, mutavel.delVertice(1));
	}
	//colocar o nome correto do arquivo
	@Test
	void testSalvar() {
		mutavel.salvar(null);
		//assertEquals(null, mutavel.salvar(null));
	}

}
