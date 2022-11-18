public class tadFilaPessoa{

    int inicio;
    int fim;
    int capacidade;
    Pessoa dados[];
   
    public tadFilaPessoa(){
        inicio = -1;
        fim = -1;
        capacidade = 100;
        dados = new Pessoa[100];
    }
    
    public void enfileirar(Pessoa p){
        cheia();
        if(!cheia()){
            fim++;
            dados[fim] = p;
        }
    }
    
    public void imprimir(){
        for (int i = inicio + 1; i <= fim; i++ ){
            System.out.println(dados[i].nome);
        }
    }
    
    public Pessoa desenfilerar(){
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
    
    void desmembrar(tadFilaPessoa idoso, tadFilaPessoa naoidoso){
        for (int i = inicio + 1; i <= fim; i++ ){
            if(dados[i].idade >= 60){
                idoso.enfileirar(desenfilerar());
            }else{
                naoidoso.enfileirar(desenfilerar());
            }
        }
    }
}