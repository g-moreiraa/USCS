public class tadFila{

    int inicio;
    int fim;
    int capacidade;
    int dados[];
   
    public tadFila(){
        inicio = -1;
        fim = -1;
        capacidade = 3;
        dados = new int[3];
    }
    
    public void enfileirar(int n){
        cheia();
        if(!cheia()){
            fim++;
            dados[fim] = n;
        }
    }
    
    public void imprimir(){
        for (int i = inicio + 1; i <= fim; i++ ){
            System.out.println(dados[i]);
        }
        System.out.println();
    }
    
    public int desenfilerar(){
        inicio++;
        return dados[inicio];
    }
    
    public int conta(){
        return (fim - inicio);
    }
    
    public boolean vazia(){
        return (conta()==0);
    }
    
    public boolean cheia(){
        return (fim == (capacidade - 1));
    }
}