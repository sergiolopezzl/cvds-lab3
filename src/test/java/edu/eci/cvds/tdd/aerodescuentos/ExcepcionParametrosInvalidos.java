package edu.eci.cvds.tdd.aerodescuentos;

/**
 *Clase de excepciones para aerodescuentoa
 */
public class ExcepcionParametrosInvalidos extends Exception
{
    public static final String NEGATIVA_CERO = "Si la tarifaBase es negativa o igual a cero.";
    public static final String DIAS_NEGATIVOS = "Si los diasAntelacion son negativos.";
    public static final String EDAD_NEGATIVA = "Si la edad es negativa.";
    
    public ExcepcionParametrosInvalidos(String mensaje){
        super(mensaje);
    }
}