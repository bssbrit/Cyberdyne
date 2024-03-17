public class Skynet {
    public void Executar() {
        Enxame enxame = new Enxame();

        Robo robo = new Robo("t-100", 1000);
        Robo robo2 = new Robo("t-1000", 10000);
        Robo robo3 = new Robo("t-2000", 20000);
        Robo robo4 = new Robo("t-3000", 30000);


        enxame.adicionaRobo(robo);
        enxame.adicionaRobo(robo2);
        enxame.adicionaRobo(robo3);
        enxame.adicionaRobo(robo4);


        System.out.println(enxame.calculaSomatorio());


    }
}
