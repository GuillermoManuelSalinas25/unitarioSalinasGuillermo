import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionesEvalTest {

    // Funcion que cuenta cuantas veces aparece un número
    @Test
    void contarApariciones() {
        assertEquals(2, FuncionesEval.contarApariciones(new int[]{1, 2, 3, 1, 4}, 1));
        assertEquals(0, FuncionesEval.contarApariciones(new int[]{5, 6, 7}, 2));
        assertEquals(0, FuncionesEval.contarApariciones(new int[]{}, 5));
    }

    // Función que muestra el número mayor en un array
    @Test
    void testEncontrarMayor() {
        int[] array1 = {1, 3, 2, 5, 4};
        assertEquals(5, FuncionesEval.encontrarMayor(array1));

        int[] array2 = {-1, -2, -3, -4};
        assertEquals(-1, FuncionesEval.encontrarMayor(array2));

        int[] array3 = {10};
        assertEquals(10, FuncionesEval.encontrarMayor(array3));

        int[] array4 = {};
        assertThrows(IllegalArgumentException.class, () -> FuncionesEval.encontrarMayor(array4));

        int[] array5 = null;
        assertThrows(IllegalArgumentException.class, () -> FuncionesEval.encontrarMayor(array5));
    }

    // Función que comprueba si un número es igual a la suma de sus divisores
    @Test
    void testEsPerfectoNumeroPerfecto() {
        assertTrue(FuncionesEval.esPerfecto(6));
    }

    @Test
    void testEsPerfectoNumeroNoPerfecto() {
        assertFalse(FuncionesEval.esPerfecto(8));
    }

    @Test
    void testEsPerfectoCero() {
        assertFalse(FuncionesEval.esPerfecto(0));
    }

    @Test
    void testEsPerfectoNegativo() {
        assertFalse(FuncionesEval.esPerfecto(-6));
    }

    // Función que devuelve el tipo de clima dependiendo de la temperatura introducida
    @Test
    void testTipoClimaFrio() {
        assertEquals("Frio", FuncionesEval.getTipoClima(5));
    }

    @Test
    void testTipoClimaTemplado() {
        assertEquals("Templado", FuncionesEval.getTipoClima(21));
    }

    @Test
    void testTipoClimaCalor() {
        assertEquals("Calor", FuncionesEval.getTipoClima(36));
    }
}