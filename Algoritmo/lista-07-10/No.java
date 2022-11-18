public class No{
    
    // ATRIBUTOS
    int dado;
    No prox;
    
    // CONSTRUTOR
    public No(int i){
        dado = i;
        prox = null;
    }
    
    // MÉTODO
    public void imprime(){
        System.out.println("Valor = " + dado);
    }
}