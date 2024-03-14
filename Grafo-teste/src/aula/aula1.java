package aula;

public class aula1 {
 
	public static void main (String [] args) {
		Grafo<String> grafo = new Grafo <String>();
		grafo.adicionarVertice("João");
		grafo.adicionarVertice("Lorenzo");
		grafo.adicionarVertice("Guilherme");
		grafo.adicionarVertice("Ivã");
		grafo.adicionarVertice("Brenner");
		
		grafo.adicionarAresta(2.0, "João", "Lorenzo");
		grafo.adicionarAresta(3.0, "Guilherme", "Brenner");
		grafo.adicionarAresta(1.0, "Brenner", "Ivã");
		grafo.adicionarAresta(1.0, "Ivã", "João");
		grafo.adicionarAresta(2.0, "Brenner", "Lorenzo");
		grafo.adicionarAresta(2.0, "Brenner", "João");
		
		grafo.buscaEmLargura();
	}
	
}
