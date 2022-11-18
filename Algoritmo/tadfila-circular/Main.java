class Main{
    public static void main(String[] args){
        tadFilaCircular tadp = new tadFilaCircular();
        tadFilaCircular idoso = new tadFilaCircular();
        tadFilaCircular naoidoso = new tadFilaCircular();
        
        Pessoa p;
        
        p = new Pessoa(40, 'M', "Guilherme");
        tadp.enfileirar(p);
        p = new Pessoa(18, 'M', "Joao");
        tadp.enfileirar(p);
        p = new Pessoa(32, 'M', "José");
        tadp.enfileirar(p);
        p = new Pessoa(16, 'M', "Marcos");
        tadp.enfileirar(p);
        p = new Pessoa(59, 'F', "Juliana");
        tadp.enfileirar(p);
        
        
        tadp.desmembrar(idoso, naoidoso);
        
        /*for(int i = 0; i <= 10; i++)
        {
            for(int a = 0; a <= 1; a++){
                if(!idoso.vazia()){
                Pessoa aux = idoso.desenfilerar();
                System.out.println("Nome: " + aux.nome + " ------ Idade: " + aux.idade);
                }
            }
            for(int b = 0; b <= 1; b++){
                if(!naoidoso.vazia()){
                Pessoa aux2 = naoidoso.desenfilerar();
                System.out.println("Nome: " + aux2.nome + " ------ Idade: " + aux2.idade);
                }
            }
        }*/
        
        while(idoso.conta() > 0 || naoidoso.conta() > 0)
        {
            for(int a = 0; a <= 1; a++){
                if(!idoso.vazia()){
                Pessoa aux = idoso.desenfilerar();
                System.out.println("Nome: " + aux.nome + " ------ Idade: " + aux.idade);
                }
            }
            for(int b = 0; b <= 1; b++){
                if(!naoidoso.vazia()){
                Pessoa aux2 = naoidoso.desenfilerar();
                System.out.println("Nome: " + aux2.nome + " ------ Idade: " + aux2.idade);
                }
            }
        }
        
        
        /*tadp.desmembrar(idoso, naoidoso);
        System.out.println("Quantidade Não idoso = " + naoidoso.conta());
        naoidoso.imprimir();
        
        System.out.println("Quantidade Idoso = " + idoso.conta());
        idoso.imprimir();*/
        
        
    }
}
