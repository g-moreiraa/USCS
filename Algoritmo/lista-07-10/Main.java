class Main{
    
    public static void main(String[] args){
        
        No n;
        Lista l = new Lista();
        
        n = new No(5);
        l.insereNoFinal(n);
        
        n = new No(6);
        l.insereNoFinal(n);
        l.imprime();
        
        
    }
}