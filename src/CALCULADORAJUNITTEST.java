import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CALCULADORAJUNITTEST {


    // Cenarios de teste 1: Somar dois valores positivos esperando que a resposta seja 10
    @Test
    public void SomarDoisValoresPositivos(){
        Calculadora calc = new Calculadora();
        int soma = calc.soma(3,7);
        assertEquals(10, soma);
    }
    // Cenarios de teste 2: Somar dois valores positivos sendo um zero esperando que a resposta seja 3
    @Test
    public void SomarDoisValoresPositivosSendoUmZero(){
        Calculadora calc = new Calculadora();
        int soma = calc.soma(3,0);
        assertEquals(3, soma);
    }
    // Cenarios de teste 3: Somar dois valores sendo os dois zeros esperando que a resposta seja 0
    @Test
    public void SomarDoisValoresPositivosSendoOsDoisZeros(){
        Calculadora calc = new Calculadora();
        int soma = calc.soma(0,0);
        assertEquals(0, soma);
    }
    // Cenarios de teste 4: Somar dois valores sendo o primeiro negativo esperando que a resposta seja -3
    @Test
    public void SomarDoisValoresSendoOPrimeiroNegativo(){
        Calculadora calc = new Calculadora();
        int soma = calc.soma(-3,0);
        assertEquals(-3, soma);
    }
    // Cenarios de teste 5: Somar dois valores sendo o segundo negativo esperando que a resposta seja 3
    @Test
    public void SomarDoisValoresSendoOSegundoNegativo(){
        Calculadora calc = new Calculadora();
        int soma = calc.soma(3,-0);
        assertEquals(3, soma);
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    // Cenarios de teste 6: Subtrair dois valores sendo dois valores positivos esperando que a resposta seja 1
    @Test
    public void SubtrairDoisValoresPositivos(){
        Calculadora calc = new Calculadora();
        int subtracao = calc.subtracao(3,2);
        assertEquals(1, subtracao);
    }
    // Cenarios de teste 7: Subtrair dois valores sendo dois valores positivos sendo o ultimo zero esperando que a resposta seja 3
    @Test
    public void SubtrairDoisValoresPositivosUltimoSendoZero(){
        Calculadora calc = new Calculadora();
        int subtracao = calc.subtracao(3,0);
        assertEquals(3, subtracao);
    }
    // Cenarios de teste 8: Subtrair dois valores sendo dois valores positivos sendo o primeiro zero esperando que a resposta seja -3
    @Test
    public void SubtrairDoisValoresPositivosPrimeiroSendoZero(){
        Calculadora calc = new Calculadora();
        int subtracao = calc.subtracao(0,3);
        assertEquals(-3, subtracao);
    }
    // Cenarios de teste 9: Subtrair dois valores sendo dois valores zeros esperando que a resposta seja 0
    @Test
    public void SubtrairDoisValoresZeros(){
        Calculadora calc = new Calculadora();
        int subtracao = calc.subtracao(0,0);
        assertEquals(0, subtracao);
    }
    // Cenarios de teste 10: Subtrair dois valores sendo dois valores sendo o primeiro negativo esperando que a resposta seja -5
    @Test
    public void SubtrairDoisValoresSendoPrimeiroNegativo(){
        Calculadora calc = new Calculadora();
        int subtracao = calc.subtracao(-5,0);
        assertEquals(-5, subtracao);
    }
    // Cenarios de teste 11: Subtrair dois valores sendo dois valores sendo que o segundo sera negativo esperando que a resposta seja 8
    @Test
    public void SubtrairDoisValoresSendoSegundoNegativo(){
        Calculadora calc = new Calculadora();
        int subtracao = calc.subtracao(3,-5);
        assertEquals(8, subtracao);
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    // Cenarios de teste 12: Multiplicar dois valores esperando que a resposta seja 6
    @Test
    public void MultiplicarDoisValores(){
        Calculadora calc = new Calculadora();
        int multiplicacao = calc.multiplicacao(3,2);
        assertEquals(6, multiplicacao);
    }
    // Cenarios de teste 13: Multiplicar dois valores sendo o ultimo zero esperando que a resposta seja 0
    @Test
    public void MultiplicarDoisValoresSendoOUltimoZero(){
        Calculadora calc = new Calculadora();
        int multiplicacao = calc.multiplicacao(3,0);
        assertEquals(0, multiplicacao);
    }
    // Cenarios de teste 14: Multiplicar dois valores sendo o primeiro zero esperando que a resposta seja 0
    @Test
    public void MultiplicarDoisValoresSendoOPrimeiroZero(){
        Calculadora calc = new Calculadora();
        int multiplicacao = calc.multiplicacao(0,2);
        assertEquals(0, multiplicacao);
    }
    // Cenarios de teste 15: Multiplicar dois valores sendo os dois zeros esperando que a resposta seja 0
    @Test
    public void MultiplicarDoisValoresSendoOsDoisZeros(){
        Calculadora calc = new Calculadora();
        int multiplicacao = calc.multiplicacao(0,0);
        assertEquals(0, multiplicacao);
    }
    // Cenarios de teste 16: Multiplicar dois valores sendo o primeiro negativo esperando que a resposta seja -15
    @Test
    public void MultiplicarDoisValoresSendoOPrimeiroNegativo(){
        Calculadora calc = new Calculadora();
        int multiplicacao = calc.multiplicacao(-5,3);
        assertEquals(-15, multiplicacao);
    }
    // Cenarios de teste 17: Multiplicar dois valores sendo o ultimo negativo esperando que a resposta seja -15
    @Test
    public void MultiplicarDoisValoresSendoOUltimoNegativo(){
        Calculadora calc = new Calculadora();
        int multiplicacao = calc.multiplicacao(3,-5);
        assertEquals(-15, multiplicacao);
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    // Cenarios de teste 18: Dividir dois valores esperando que a resposta seja 1.5
    @Test
    public void DividirDoisValores(){
        Calculadora calc = new Calculadora();
        String divisao = calc.divisao(3,2);
        assertEquals(String.valueOf(1.5), divisao);
    }
    // Cenarios de teste 19: Dividir dois valores sendo o ultimo zero esperando que a resposta seja um erro pois o segundo numero nao pode ser um zero
    @Test
    public void DividirDoisValoresSendoOUltimoZero(){
        Calculadora calc = new Calculadora();
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            String divisao = calc.divisao(3,0);
        });
        assertEquals("Divisão por zero não é permitida.", exception.getMessage());
    }

    // Cenarios de teste 20: Dividir dois valores sendo o primeiro zero esperando que a resposta seja 0.0
    @Test
    public void DividirDoisValoresSendoOPrimeiroZero(){
        Calculadora calc = new Calculadora();
        String divisao = calc.divisao(0,2);
        assertEquals(String.valueOf(0.0), divisao);
    }
    // Cenarios de teste 21: Dividir dois valores sendo os dois zeros esperando que a resposta seja um erro pois o segundo numero nao pode ser um zero
    @Test
    public void DividirDoisValoresSendoOsDoisZeros(){
        Calculadora calc = new Calculadora();
        ArithmeticException exception = assertThrows(ArithmeticException.class, () ->{
            String divisao = calc.divisao(0,0);
        });
        assertEquals("Divisão por zero não é permitida.", exception.getMessage());
    }
    // Cenarios de teste 22: Dividir dois valores sendo o primeiro negativo esperando que a resposta seja -1.6666666666666667
    @Test
    public void DividirDoisValoresSendoOPrimeiroNegativo(){
        Calculadora calc = new Calculadora();
        String divisao = calc.divisao(-5,3);
        assertEquals(String.valueOf(-1.6666666666666667), divisao);
    }
    // Cenarios de teste 23: Dividir dois valores sendo o segundo negativo esperando que a resposta seja -1.5
    @Test
    public void DividirDoisValoresSendoOSegundoNegativo(){
        Calculadora calc = new Calculadora();
        String divisao = calc.divisao(3,-2);
        assertEquals(String.valueOf(-1.5), divisao);
    }
}
