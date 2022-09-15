package Grafos;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArestaTest {
	
	Aresta aresta;
	
	@BeforeEach	
	void setUp() throws Exception {
		aresta = new Aresta(0,5);
	}

	
	@Test
	void testDestino() {

		assertEquals(5,aresta.destino());
	
	}
	
	@Test
	void testPeso() {
		
		assertEquals(0,aresta.peso());
	}
	
	@Test
	void testVisitada() {
		
		assertFalse(aresta.visitada());
	}
	
	@Test
	void testVisitar() {
		aresta.visitar();
		assertTrue(aresta.visitada());
	}
	
	@Test
	
	void testLimparVisita() {
		aresta.limparVisita();
		assertFalse(aresta.visitada());
	}
	
}
