import java.util.ArrayList;

public class Enxame {
    private ArrayList<Robo> enxame = new ArrayList<Robo>();

    public Robo consultaRobo(String modelo) {
        if(this.enxame.isEmpty()){
            System.out.println("Nenhum robo na cadastrado ainda");
        return null;
        }
        else {
            for (i = 0; i < enxame.size(); i++) {
                Robo roboachado = this.enxame.get(i);
                if(roboachado.getModelo().e){
                    return roboachado;
                }
            }

        }
    }
    public boolean adicionaRobo(Robo robo){
        String modelo = robo.getModelo();
        if(consultaRobo(modelo) == null){
            this.enxame.add(robo);
            return true;
        } else  {
            System.out.println("Robo ja adicionado");
            return false;
        }
    }

    public double calculaSomatorio(){
        double somatorio = 0;
        for(int i = 0; i < this.enxame.size(); i++) {
            Robo robo = this.enxame[i];
            somatorio += robo.getValor();
        }
        return somatorio;
    }
}
