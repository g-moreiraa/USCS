public class tadFilaCircular{

    int inicio;
    int fim;
    int capacidade;
    Pessoa dados[];
   
    public tadFilaCircular(){
        inicio = 0;
        fim = 0;
        capacidade = 6;
        dados = new Pessoa[6];
    }
    
    public void enfileirar(Pessoa p){
        cheia();
        if(!cheia()){
            fim = (fim+1)%capacidade;
            dados[fim] = p;
        }
    }
    
    public void imprimir(){
        int posicao;
        for(int i = 1; i <= conta(); i++){
            posicao = (inicio+1)%capacidade;
            dados[posicao].imprime();
        }
    }
    
    public Pessoa desenfilerar(){
        inicio = (inicio+1)%capacidade;
        return dados[inicio];
    }
    
    public int conta(){
        return (fim - inicio);
    }
    
    public boolean vazia(){
        return (inicio==fim);
    }
    
    public boolean cheia(){
        return (inicio ==(fim+1)%capacidade);
    }
    
    void desmembrar(tadFilaCircular idoso, tadFilaCircular naoidoso){
        for (int i = inicio + 1; i <= fim; i++ ){
            if(dados[i].idade >= 60){
                idoso.enfileirar(desenfilerar());
            }else{
                naoidoso.enfileirar(desenfilerar());
            }
        }
    }
}