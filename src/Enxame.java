import java.util.ArrayList;

public class Enxame {
    private ArrayList<Robo> enxame;
    public Enxame(){
        this.enxame = new ArrayList<Robo>();
    }
    public Robo consultaRobo(String modelo) {
        if(this.enxame.isEmpty()){
            //System.out.println("Nenhum robo na cadastrado ainda");
        return null;
        }
        Robo roboachado = null;
            for (int i = 0; i < enxame.size(); i++) {
                roboachado = this.enxame.get(i);
                if(roboachado.getModelo().equals(modelo)){
                    return roboachado;
                }
            }
            return null;

    }
    public boolean adicionaRobo(Robo robo){
        String modelo = robo.getModelo();


        if(consultaRobo(modelo) == null){

            this.enxame.add(robo);
            return true;
        } else  {
           // System.out.println("Robo ja adicionado");
            return false;
        }
    }

    public double calculaSomatorio(){
        double somatorio = 0;
        for(int i = 0; i < this.enxame.size(); i++) {
            Robo robo = this.enxame.get(i);
            somatorio += robo.getValor();
        }
        return somatorio;
    }
}
