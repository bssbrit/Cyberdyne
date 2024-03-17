
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Scanner;

public class Skynet {
    private Scanner entrada = null;
    private PrintStream saidaPadrao = System.out;
    public void Executar() {
        try {
            BufferedReader streamEntrada = new BufferedReader(new FileReader("dadosin.txt"));
            entrada = new Scanner(streamEntrada);   // Usa como entrada um arquivo
            PrintStream streamSaida = new PrintStream(new File("dadosOut.txt"), Charset.forName("UTF-8"));
            System.setOut(streamSaida);             // Usa como saida um arquivo
        } catch (Exception e) {
            System.out.println(e);
        }
        Locale.setDefault(Locale.ENGLISH);   // Ajusta para ponto decimal
        entrada.useLocale(Locale.ENGLISH);


        /*Enxame enxame = new Enxame();
        boolean confirm;
        Robo robo = new Robo("t-100", 1000);
        Robo robo2 = new Robo("t-1000", 10000);
        Robo robo3 = new Robo("t-2000", 20000);
        Robo robo4 = new Robo("t-3000", 30000);


        confirm= enxame.adicionaRobo(robo);
        Robo robozin = robo;
        confirm = enxame.adicionaRobo(robozin);
        if(!confirm) {
            System.out.println("weird");
        }
        enxame.adicionaRobo(robo2);
        enxame.adicionaRobo(robo3);
        enxame.adicionaRobo(robo4);


        System.out.println(enxame.calculaSomatorio());
        */
    }
    private void restauraES() {
        System.setOut(saidaPadrao);
        entrada = new Scanner(System.in);
    }
}
