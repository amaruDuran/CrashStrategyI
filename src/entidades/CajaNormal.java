package entidades;

public class CajaNormal implements RompibleWumpa{

    @Override
    public void explotar(ControlWumpa wumpa){
        wumpa.comerFruta();
    }
}
