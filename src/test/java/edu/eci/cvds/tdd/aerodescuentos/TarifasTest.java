package edu.eci.cvds.tdd.aerodescuentos;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TarifasTest {

    @Before
    public void setUp() {
        
    }

    @Test
    public void testDescuentoMayor20DiasEdadEntre18y65() {
        double tarifaBase = 100;
        int diasAntelacion = 25;
        int edad = 30;
        double resultado = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        // Resultado esperado: 15% de descuento sobre 100.
        Assert.assertEquals(85, resultado, 1);
    }
    
    @Test
    public void testDescuentoMayor20DiasEdadMenor18() {
        double tarifaBase = 100;
        int diasAntelacion = 25;
        int edad = 16;
        double resultado = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        // Resultado esperado: 15% + 5% de descuento sobre 100.
        Assert.assertEquals(80, resultado, 1);
    }
    
    @Test
    public void testDescuentoMayor20DiasEdadMayor65() {
        double tarifaBase = 100;
        int diasAntelacion = 25;
        int edad = 70;
        double resultado = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        // Resultado esperado: 15% + 8% de descuento sobre 100.
        Assert.assertEquals(77, resultado,1);
    }
    
    @Test
    public void testSinDescuentoMenorIgual20DiasEdadEntre18y65() {
        double tarifaBase = 100;
        int diasAntelacion = 10;
        int edad = 30;
        double resultado = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        // Resultado esperado: Sin descuento, tarifa base intacta.
        Assert.assertEquals(100, resultado,1);
    }
    
    // Agrega casos de prueba para las clases de equivalencia restantes y las condiciones de frontera.
    

    @Test
    public void testCalculoTarifaDescuentoMenor18() throws ExcepcionParametrosInvalidos {
        double tarifaBase = 100;
        int diasAntelacion = 25;
        int edad = 16;
        double resultado = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        // El resultado esperado es una tarifa con descuento del 20% (15% + 5%) sobre la tarifa base.
        Assert.assertEquals(80, resultado,1);
    }

    /*
    @Test(expected = ExcepcionParametrosInvalidos.class)
    public void testExcepcionParametrosInvalidosTarifaNegativa() throws ExcepcionParametrosInvalidos {
        double tarifaBase = -50;
        int diasAntelacion = 30;
        int edad = 70;
        CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
    }
    */

    @Test
    public void testCalculoTarifaSinDescuento() throws ExcepcionParametrosInvalidos{
        double tarifaBase = 100;
        int diasAntelacion = 10;
        int edad = 30;
        double resultado = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        // No hay descuento en este caso.
        Assert.assertEquals(100, resultado, 1);
    }

    // Agrega más pruebas según tus casos de equivalencia y condiciones límite.
}
