class Main{
    public static void main(String[] args){
        tadFila f = new tadFila();
        
        f.enfileirar(8);
        f.enfileirar(9);
        f.enfileirar(10);
        f.enfileirar(11);
        f.imprimir();
        if (f.cheia())
        {
            System.out.println("Fila Cheia");
        }
    }
}
