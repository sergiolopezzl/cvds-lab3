package edu.eci.cvds.tdd.aerodescuentos;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;
//import edu.eci.cvds.tdd.aerodescuentos.ExcepcionParametrosInvalidos;

public class TarifasTest {

    private CalculadorDescuentos calculadorDescuentos;

    @Before
    public void setUp() {
        calculadorDescuentos = new CalculadorDescuentos();
    }

    @Test
    public void testCalculoTarifaDescuentoMenor18() {
        long tarifaBase = 100;
        int diasAntelacion = 25;
        int edad = 10;
        try {
            long resultado = calculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
            // El resultado esperado es una tarifa con descuento del 20% (15% + 5%) sobre la tarifa base.
            Assert.assertEquals(80, resultado);
        } catch (ExcepcionParametrosInvalidos e) {
            Assert.fail("No debería lanzar una excepción en este caso.");
        }
    }

    @Test(expected = ExcepcionParametrosInvalidos.class)
    public void testExcepcionParametrosInvalidosTarifaNegativa() throws ExcepcionParametrosInvalidos {
        long tarifaBase = -50;
        int diasAntelacion = 30;
        int edad = 70;
        calculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
    }

    @Test
    public void testCalculoTarifaSinDescuento() {
        long tarifaBase = 100;
        int diasAntelacion = 10;
        int edad = 30;
        try {
            long resultado = calculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
            // No hay descuento en este caso.
            Assert.assertEquals(100, resultado);
        } catch (ExcepcionParametrosInvalidos e) {
            Assert.fail("No debería lanzar una excepción en este caso.");
        }
    }

    // Agrega más pruebas según tus casos de equivalencia y condiciones límite.
}
