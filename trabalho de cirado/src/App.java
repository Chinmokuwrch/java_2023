import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //variaveis
        float raio, area;
        Scanner teclado = new Scanner(System.in);

        //entrada
        System.out.print("Digite o valor de raio:\t");
        raio = teclado.nextFloat();
        teclado.close();

        //processamento
        area = (float) Math.PI * raio * raio;

        System.out.printf("A = %.4f",area);
    }
}
