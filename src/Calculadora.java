public class Calculadora {
  /**
   * Realiza a operação de soma.
   *
   * @param a O primeiro número a ser somado.
   * @param b O segundo número a ser somado.
   * @return O resultado da soma de a e b.
   */
  public int soma(int a, int b) {
    return a + b;
  }

  /**
   * Realiza a operação de subtração.
   *
   * @param a O número do qual você deseja subtrair.
   * @param b O número que será subtraído de a.
   * @return O resultado da subtração de a por b.
   */
  public int subtracao(int a, int b) {
    return a - b;
  }

  /**
   * Realiza a operação de multiplicação.
   *
   * @param a O primeiro número a ser multiplicado.
   * @param b O segundo número a ser multiplicado.
   * @return O resultado da multiplicação de a e b.
   */
  public int multiplicacao(int a, int b) {
    return a * b;
  }

  /**
   * Realiza a operação de divisão.
   *
   * @param a O número que será dividido.
   * @param b O número pelo qual a será dividido.
   * @return O resultado da divisão de a por b.
   * @throws ArithmeticException Se b for igual a 0, uma exceção será lançada.
   */
  public String divisao(double a, double b) {
    if (b == 0) {
      throw new ArithmeticException("Divisão por zero não é permitida.");
    } else {
      String resposta = String.valueOf(a / b);
      return resposta;
    }
  }
}
