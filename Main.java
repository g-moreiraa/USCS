import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        TadPilha p = new TadPilha();
        int num = 100;
        while(num!=0){
            p.empilha(num%2);
            num = num/2;
        }
        System.out.println("\n");
        p.imprimeaocontrario();
    } 
}