package entidades;

public class Crash {
    ControlWumpa wumpa;

    public Crash(){
        wumpa = new ControlWumpa();
    }

    public int vidasRestantes() {
        return wumpa.vidasRestantes();
    }

    public int wumpaFruta() {
        return wumpa.wumpaFruta();
    }

    public void comerWumpaFruta(){
        wumpa.comerFruta();
    }

    public void romper(RompibleWumpa caja) {
        caja.explotar(wumpa);
    }
}
