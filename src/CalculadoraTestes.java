/**
 * A classe CalculadoraTestes contém cenários de teste para a classe Calculadora, que realiza operações matemáticas.
 */
public class CalculadoraTestes {
  public static void main(String[] args) {
    // Classe da calculadora instanciada para usar suas funções
    Calculadora calc = new Calculadora();

    // Cenário de teste 1: Soma de dois valores (3 + 3)
    System.out.println("Cenário de teste 1: Soma de dois valores (3 + 3) -> Resultado: " + calc.soma(3, 3));

    // Cenário de teste 2: Soma de um valor com zero (3 + 0)
    System.out.println("Cenário de teste 2: Soma de um valor com zero (3 + 0) -> Resultado: " + calc.soma(3, 0));

    // Cenário de teste 3: Soma de zero com um valor (0 + 3)
    System.out.println("Cenário de teste 3: Soma de zero com um valor (0 + 3) -> Resultado: " + calc.soma(0, 3));

    // Cenário de teste 4: Soma de dois zeros (0 + 0)
    System.out.println("Cenário de teste 4: Soma de dois zeros (0 + 0) -> Resultado: " + calc.soma(0, 0));

    // Cenário de teste 5: Soma de um valor negativo com um valor positivo (-5 + 3)
    System.out.println("Cenário de teste 5: Soma de um valor negativo com um valor positivo (-5 + 3) -> Resultado: " + calc.soma(-5, 3));

    // Cenário de teste 6: Soma de um valor positivo com um valor negativo (3 + (-5))
    System.out.println("Cenário de teste 6: Soma de um valor positivo com um valor negativo (3 + (-5)) -> Resultado: " + calc.soma(3, -5));

    // Cenário de teste 7: Subtração de dois valores (3 - 3)
    System.out.println("Cenário de teste 7: Subtração de dois valores (3 - 3) -> Resultado: " + calc.subtracao(3, 3));

    // Cenário de teste 8: Subtração de um valor por zero (3 - 0)
    System.out.println("Cenário de teste 8: Subtração de um valor por zero (3 - 0) -> Resultado: " + calc.subtracao(3, 0));

    // Cenário de teste 9: Subtração de zero por um valor (0 - 3)
    System.out.println("Cenário de teste 9: Subtração de zero por um valor (0 - 3) -> Resultado: " + calc.subtracao(0, 3));

    // Cenário de teste 10: Subtração de dois zeros (0 - 0)
    System.out.println("Cenário de teste 10: Subtração de dois zeros (0 - 0) -> Resultado: " + calc.subtracao(0, 0));

    // Cenário de teste 11: Subtração de um valor negativo de um valor positivo (-5 - 3)
    System.out.println("Cenário de teste 11: Subtração de um valor negativo de um valor positivo (-5 - 3) -> Resultado: " + calc.subtracao(-5, 3));

    // Cenário de teste 12: Subtração de um valor positivo por um valor negativo (3 - (-5))
    System.out.println("Cenário de teste 12: Subtração de um valor positivo por um valor negativo (3 - (-5)) -> Resultado: " + calc.subtracao(3, -5));

    // Cenário de teste 13: Multiplicação de dois valores (3 * 3)
    System.out.println("Cenário de teste 13: Multiplicação de dois valores (3 * 3) -> Resultado: " + calc.multiplicacao(3, 3));

    // Cenário de teste 14: Multiplicação de um valor por zero (3 * 0)
    System.out.println("Cenário de teste 14: Multiplicação de um valor por zero (3 * 0) -> Resultado: " + calc.multiplicacao(3, 0));

    // Cenário de teste 15: Multiplicação de zero por um valor (0 * 3)
    System.out.println("Cenário de teste 15: Multiplicação de zero por um valor (0 * 3) -> Resultado: " + calc.multiplicacao(0, 3));

    // Cenário de teste 16: Multiplicação de dois zeros (0 * 0)
    System.out.println("Cenário de teste 16: Multiplicação de dois zeros (0 * 0) -> Resultado: " + calc.multiplicacao(0, 0));

    // Cenário de teste 17: Multiplicação de um valor negativo por um valor positivo (-5 * 3)
    System.out.println("Cenário de teste 17: Multiplicação de um valor negativo por um valor positivo (-5 * 3) -> Resultado: " + calc.multiplicacao(-5, 3));

    // Cenário de teste 18: Multiplicação de um valor positivo por um valor negativo (3 * (-5))
    System.out.println("Cenário de teste 18: Multiplicação de um valor positivo por um valor negativo (3 * (-5)) -> Resultado: " + calc.multiplicacao(3, -5));

    // Cenário de teste 19: Divisão de dois valores (3 / 3)
    System.out.println("Cenário de teste 19: Divisão de dois valores (3 / 3) -> Resultado: " + calc.divisao(3, 3));

    /*
    Cenário de teste 20: Divisão de um valor por zero (3 / 0)
    OBS: Este teste foi comentado porque a divisão por zero lança uma exceção e quebra o código. Para testar, descomente e trate a exceção.
    */
    // System.out.println("Cenário de teste 20: Divisão de um valor por zero (3 / 0) -> Resultado: " + calc.divisao(3, 0));

    // Cenário de teste 21: Divisão de um valor por zero (3 / 0)
    // OBS: Este teste foi comentado porque a divisão por zero lança uma exceção e quebra o código. Para testar, descomente e trate a exceção.
    // System.out.println("Cenário de teste 21: Divisão de um valor por zero (3 / 0) -> Resultado: " + calc.divisao(3, 0));

    // Cenário de teste 22: Divisão de zero por um valor (0 / 3)
    System.out.println("Cenário de teste 22: Divisão de zero por um valor (0 / 3) -> Resultado: " + calc.divisao(0, 3));

    /*
    Cenário de teste 23: Divisão de dois zeros (0 / 0)
    OBS: Este teste foi comentado porque a divisão por zero lança uma exceção e quebra o código. Para testar, descomente e trate a exceção.
    */
    // System.out.println("Cenário de teste 23: Divisão de dois zeros (0 / 0) -> Resultado: " + calc.divisao(0, 0));

    // Cenário de teste 24: Divisão de um valor negativo por um valor positivo (-5 / 3)
    System.out.println("Cenário de teste 24: Divisão de um valor negativo por um valor positivo (-5 / 3) -> Resultado: " + calc.divisao(-5, 3));

    // Cenário de teste 25: Divisão de um valor positivo por um valor negativo (3 / (-5))
    System.out.println("Cenário de teste 25: Divisão de um valor positivo por um valor negativo (3 / (-5)) -> Resultado: " + calc.divisao(3, -5));
  }
}