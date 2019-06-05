package entidades;

public class ControlWumpa {
    private int wumpaFrutas;
    private int cantidadDeVidas;

    public ControlWumpa(){
        wumpaFrutas = 0;
        cantidadDeVidas = 5;
    }

    public int vidasRestantes() {
        return cantidadDeVidas;
    }

    public int wumpaFruta() {
        return wumpaFrutas;
    }

    public void comerFruta() {
        wumpaFrutas++;
        if (wumpaFrutas == 100){
            cantidadDeVidas++;
            wumpaFrutas = 0;
        }
    }
}
