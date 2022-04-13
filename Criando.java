import java.util.Scanner;

public class Criando {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        double n1 = ler.nextDouble();
        System.out.println("Digite o segudo valor:");
        double n2 = ler.nextDouble();    
        
        double resultsoma = somar(n1, n2); 
        double resultsub = subtrair(n1, n2);
        double resultmult = multiplicar(n1, n2);
        double resultdiv= dividir(n1, n2);  

        System.out.println("\n\nSoma:" + resultsoma +"\n"+ "Subtração:" + resultsub +"\n"+ "Multiplicação:" + resultmult + "\n" + "Divisão:" + resultdiv);
        if(n2 == 0){
            System.out.print("\nNão é possivel dividir por 0");
        }
    }
    //Método somar
    public static double somar(double n1, double n2) {
        return(n1 + n2);
    }
    //Método subtrair
    public static double subtrair(double n1, double n2){
        return(n1 - n2);
    }
    //Método multiplicar
    public static double multiplicar(double n1, double n2){
        return(n1 * n2);
    } 
    //Método dividir
    public static double dividir(double n1, double n2){
        return(n1 / n2);
    }       
}