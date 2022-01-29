import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner teclado = new Scanner(System.in);
       int num1, num2, mod;
        System.out.print("Ingrese el primer numero: ");
        num1 = teclado.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();

        mod = num1 % num2;

        if(mod==0){
            System.out.print("El numero " + num1 + " es divisible entre " + num2);
        }else{
            System.out.print("El numero " + num1 + " no es divisible entre " + num2);
        }
    }
}
