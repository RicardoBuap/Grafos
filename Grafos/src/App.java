public class App {
    public static void main(String[] args) throws Exception {
        Grafo grafo = new Grafo(3);
        grafo.creaGrafo();
        grafo.imprimirMatrizAdyacencia();
        grafo.imprimirMatrizCostos();
    }
}
