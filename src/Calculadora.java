/**
 * A classe Calculadora fornece métodos para realizar operações matemáticas simples, como soma, subtração, multiplicação e divisão.
 */
public class Calculadora {

  /**
   * Realiza a operação de soma entre dois números inteiros.
   *
   * @param a O primeiro número inteiro.
   * @param b O segundo número inteiro.
   * @return O resultado da soma de a e b.
   */
  public int soma(int a, int b){
    return a + b;
  }

  /**
   * Realiza a operação de subtração entre dois números inteiros.
   *
   * @param a O número do qual será subtraído.
   * @param b O número a ser subtraído de a.
   * @return O resultado da subtração de a por b.
   */
  public int subtracao(int a, int b){
    return a - b;
  }

  /**
   * Realiza a operação de multiplicação entre dois números inteiros.
   *
   * @param a O primeiro número inteiro.
   * @param b O segundo número inteiro.
   * @return O resultado da multiplicação de a por b.
   */
  public int multiplicacao(int a, int b){
    return a * b;
  }

  /**
   * Realiza a operação de divisão entre dois números de ponto flutuante.
   *
   * @param a O numerador (dividendo).
   * @param b O denominador (divisor).
   * @return O resultado da divisão de a por b, representado como uma String.
   * @throws ArithmeticException Se b for igual a zero, uma exceção é lançada, indicando que a divisão por zero não é permitida.
   */
  public String divisao(double a, double b){
    if (b == 0){
      throw new ArithmeticException("Divisão por zero não é permitida.");
    }else{
      String resposta = String.valueOf(a / b);
      return resposta;
    }
  }
}
