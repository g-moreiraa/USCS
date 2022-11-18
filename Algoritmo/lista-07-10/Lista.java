public class Lista{
    
    // ATRIBUTOS
    No inicio;
    
    // CONSTRUTOR
    public Lista(){
        inicio = null;
    }
    
    // MÉTODO INSERIR
    public void insereNoFinal(No aux){
        if(vazia()){
            inicio = aux;
        }else{
            No atual;
            atual = inicio;
            while(atual.prox != null){
                atual = atual.prox;
            }
            atual.prox = aux;
        }
    }
    
    public void imprime(){
        No atual;
        atual = inicio;
        while (atual  != null){
            atual.imprime();
            atual = atual.prox;
        }
    }
    
    public boolean vazia(){
        return (inicio == null);
    }
}