package Test;

import entidades.CajaCompleta;
import entidades.CajaNormal;
import entidades.Crash;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrashTest {

    Crash crashBandicoot = new Crash();

    @Test
    void test01CrashInicialmenteTiene5Vidas() {
        assertEquals(crashBandicoot.vidasRestantes(),5);
    }

    @Test
    void test02CrashInicialmenteTiene0WumpaFruta(){
        assertEquals(crashBandicoot.wumpaFruta(), 0);
    }

    @Test
    void test03CrashComeWumpaFrutaEIncrementaSuCantidadEnUnaUnidad(){
        crashBandicoot.comerWumpaFruta();

        assertEquals(1, crashBandicoot.wumpaFruta());
    }

    @Test
    void test04CrashJunta100WumpaFrutasEIncrementaLasVidasRestantesEnUnaUnidad(){

        for (int i = 0; i < 100; i++) {
            crashBandicoot.comerWumpaFruta();
        }
        assertEquals(6, crashBandicoot.vidasRestantes());

    }

    @Test
    void test05CrashJunta100WumpaFrutasYLosWumpaFrutasVuelvenACero(){

        for (int i = 0; i < 100; i++) {
            crashBandicoot.comerWumpaFruta();
        }
        assertEquals(0, crashBandicoot.wumpaFruta());

    }

    @Test
    void test06CrashRompeCajaNormalEIncrementaLaCantidadDeWumpaFrutaEnUnaUnidad(){

        CajaNormal caja = new CajaNormal();

        crashBandicoot.romper(caja);

        assertEquals(1, crashBandicoot.wumpaFruta());
    }


    @Test
    void test07CrashRompeCajaCompletaEIncrementaLaCantidadDeWumpaFrutaEnDiezUnidades(){

        CajaCompleta caja = new CajaCompleta();

        crashBandicoot.romper(caja);

        assertEquals(10,crashBandicoot.wumpaFruta());
    }

    @Test
    void test08CrashRompeCajaCompletaYRecogeEnTotalMasDe100FrutasYContabilizaElRemanente(){

        CajaCompleta caja = new CajaCompleta();

        /* Crash Come Frutas Hasta casi llegar al tope */
        for (int i = 0; i < 95; i++) {
            crashBandicoot.comerWumpaFruta();
        }

        crashBandicoot.romper(caja);

        assertEquals(5,crashBandicoot.wumpaFruta());

    }

}