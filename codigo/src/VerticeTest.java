import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VerticeTest {

	ABB<Aresta> arestas;
	private boolean visitado;
//private int id;

	@BeforeEach
	void setUp() throws Exception {
		//this.id = id;
		this.arestas = new ABB<Aresta>();
		this.visitado = false;
	}

//	@Test
//	void addAresta(int destino) {
//		assertEquals(0, Aresta.class);
//	}
//
//	@Test
//	void existeAresta(int destino) {
//		assertEquals(1, arestas.this.arestas(destino));
//	}

	@Test
	void grau() {
		assertEquals(0, arestas.size());
	}

	@Test
	void visitar() {
		this.visitado = true;
		assertEquals(true, this.visitado);
	}

	@Test
	void limparVisita() {
		this.visitado = false;
		assertEquals(false, this.visitado);
	}

	@Test
	void visitado() {
		assertEquals(false, this.visitado);
	}

}
