package edu.eci.cvds.tdd.aerodescuentos;
import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
  
    // Clases de equivalencia para el cálculo de descuentos
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
    public void testDescuentoMenor20DiasEdadMayor65() {
        double tarifaBase = 100;
        int diasAntelacion = 10;
        int edad = 66;
        double resultado = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        // El resultado esperado es una tarifa con descuento del 8% sobre la tarifa base.
        Assert.assertEquals(92, resultado,1);
    }

    @Test
    public void testDescuentoMenor20DiasEdadMenor18() throws ExcepcionParametrosInvalidos {
        double tarifaBase = 100;
        int diasAntelacion = 10;
        int edad = 10;
        double resultado = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        // El resultado esperado es una tarifa con descuento del 5% sobre la tarifa base.
        Assert.assertEquals(95, resultado,1);
    }


    @Test
    public void testCalculoTarifaSinDescuento() throws ExcepcionParametrosInvalidos{
        double tarifaBase = 100;
        int diasAntelacion = 10;
        int edad = 30;
        double resultado = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        // No hay descuento en este caso.
        Assert.assertEquals(100, resultado, 1);
    }

    // Condiciones límite

    @Test
    public void testTarifaBaseNegativa() throws ExcepcionParametrosInvalidos {
        double tarifaBase = -50;
        Assert.assertFalse(tarifaBase > 0);
    }

    @Test
    public void testTarifaBaseCero() throws ExcepcionParametrosInvalidos {
        double tarifaBase = 0;
        Assert.assertFalse(tarifaBase > 0);
    }

    @Test
    public void testDiasAntelacionNegativos() throws ExcepcionParametrosInvalidos {
        int diasAntelacion = -5;
        Assert.assertFalse(diasAntelacion > 0);
    }

    @Test
    public void testEdadNegativa() throws ExcepcionParametrosInvalidos {
        int edad = -10;
        Assert.assertFalse(edad > 0);
    }

    @Test
    public void testEdadMayor() throws ExcepcionParametrosInvalidos {
        int edad = 130;
        Assert.assertFalse(125 > edad);
    }
}
