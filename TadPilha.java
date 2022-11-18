public class TadPilha
{
    
    int capacidade;
    int topo;
    int[] dados;
    
     public TadPilha(int capacidade){
        this.capacidade = capacidade;
        this.topo = -1;
        this.dados = new int[capacidade];
    }
    public TadPilha(){
        this.capacidade = 100;
        this.topo = -1;
        this.dados = new int[100];
    }
    
    
	public void empilha (int d) {
	       if (!cheia()){
	           topo++;
	           dados[topo] = d;
	       }
	   }
	   
	   public void imprimeaocontrario () {
	       for (int i=topo; i>=0; i--)
	       System.out.print(dados[i]+ " ");
	   }
	   
	   
	   
	   public boolean cheia() {
	       return topo == capacidade - 1;
	   }
	    
	
}