import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

/**
 * Classe de testes da calculadora.
 */
public class CALCULADORAJUNITTEST {

    /**
     * Testa a soma de dois valores positivos.
     */
    @Test
    public void testSomaValoresPositivos() {
        // Cria uma instância da classe Calculadora.
        Calculadora calc = new Calculadora();

        // Executa a operação de soma.
        int soma = calc.soma(3, 7);

        // Verifica se o resultado da soma é igual a 10 (3 + 7).
        assertEquals(10, soma);
    }

    /**
     * Testa a soma com um valor zero.
     */
    @Test
    public void testSomaComZero() {
        Calculadora calc = new Calculadora();
        int soma = calc.soma(3, 0);
        // Verifica se o resultado da soma é igual ao primeiro valor, já que a soma com zero não deve alterar o valor.
        assertEquals(3, soma);
    }

    /**
     * Testa a soma com ambos os valores zero.
     */
    @Test
    public void testSomaComAmbosZeros() {
        Calculadora calc = new Calculadora();
        int soma = calc.soma(0, 0);
        // Verifica se o resultado da soma é zero.
        assertEquals(0, soma);
    }

    /**
     * Testa a soma com o primeiro valor negativo.
     */
    @Test
    public void testSomaPrimeiroValorNegativo() {
        Calculadora calc = new Calculadora();
        int soma = calc.soma(-3, 0);
        // Verifica se o resultado da soma é igual ao primeiro valor negativo.
        assertEquals(-3, soma);
    }

    /**
     * Testa a soma com o segundo valor negativo.
     */
    @Test
    public void testSomaSegundoValorNegativo() {
        Calculadora calc = new Calculadora();
        int soma = calc.soma(3, -0);
        // Verifica se o resultado da soma é igual ao primeiro valor positivo.
        assertEquals(3, soma);
    }

    /**
     * Testa a divisão por zero, que deve lançar uma exceção.
     */
    @Test
    public void testDivisaoPorZero() {
        Calculadora calc = new Calculadora();
        // Verifica se uma exceção do tipo ArithmeticException é lançada ao tentar dividir por zero.
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calc.divisao(3, 0);
        });
        // Verifica se a mensagem de exceção é "Divisão por zero não é permitida."
        assertEquals("Divisão por zero não é permitida.", exception.getMessage());
    }
}
