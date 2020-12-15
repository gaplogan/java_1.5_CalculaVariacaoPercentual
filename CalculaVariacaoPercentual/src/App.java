import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double DifVal, ValIni, ValFin, Perc;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        do
        {
            System.out.print("Digite o valor inicial: ");
            ValIni = entrada.nextDouble();
        } while (ValIni < 0);

        System.out.println();

        do
        {
            System.out.print("Digite o valor final: ");
            ValFin = entrada.nextDouble();
        } while (ValFin < 0);

        System.out.println();

        DifVal = ValFin - ValIni;
        Perc = (DifVal / ValIni) * 100;

        if (DifVal < 0)
        {
            System.out.println("A Variação percentual foi de " + Perc + "%");
        }
        else if (DifVal > 0)
        {
            System.out.println("A Variação percentual foi de +" + Perc + "%");
        }
        else
        {
            System.out.println("A Variação percentual foi de 0%");      
        }

        entrada.close();
    }
}
