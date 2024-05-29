import java.util.Scanner;

public class Grafo {
    private int [][] matrizAdyacencia;
    private int [][] matrizCostos;
    private int tamaño;
    public Scanner teclado = new Scanner(System.in);

    public Grafo(int tamaño){
        this.tamaño = tamaño;
        matrizAdyacencia = new int [tamaño][tamaño];
        matrizCostos = new int [tamaño][tamaño];
    }

    public void creaGrafo(){
        int costo;
        for(int i=0; i<tamaño; i++){
            for(int j=0; j<tamaño; j++){
                System.out.print("Costo del camino [" + i + "][" + j +"]: ");
                costo = teclado.nextInt();
                if(costo != 0){
                    matrizAdyacencia[i][j] = 1;
                    matrizCostos[i][j] = costo;
                }
                else{
                    matrizAdyacencia[i][j] = 0;
                    matrizCostos[i][j] = 0;
                }
            }
        }
    }

    public void imprimirMatrizAdyacencia(){
        for(int i=0; i<tamaño; i++){
            for(int j=0; j<tamaño; j++){
                System.out.print(matrizAdyacencia[i][j]);
            }
            System.out.println("");
        }
    }

    public void imprimirMatrizCostos(){
        for(int i=0; i<tamaño; i++){
            for(int j=0; j<tamaño; j++){
                System.out.print(matrizCostos[i][j]);
            }
            System.out.println("");
        }
    }

    public int primero(int vertice){
        int adyacente = 0;
        for(int i=0; i<tamaño; i++){
            if(matrizAdyacencia[vertice][i] == 1){
                adyacente = i;
                break;
            }
        }
        return adyacente;
    }
}
