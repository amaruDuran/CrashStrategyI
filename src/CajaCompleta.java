package entidades;

public class CajaCompleta implements RompibleWumpa{


    @Override
    public void explotar(ControlWumpa wumpa) {
        for (int i = 0; i < 10; i++) {
            wumpa.comerFruta();
        }
    }
}
