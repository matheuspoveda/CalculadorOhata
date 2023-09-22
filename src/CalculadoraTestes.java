public class CalculadoraTestes {
  public static void main(String[] args) {
    // Classe da calculador instanciada para conseguir usar as funcoes dela
    Calculadora calc = new Calculadora();

    // Cenario de teste 1: Soma de dois valores
    System.out.println(calc.soma(3, 3));
    // Cenario de teste 2: Soma de dois valores sendo o ultimo zero
    System.out.println(calc.soma(3, 0));
    // Cenario de teste 3: Soma de dois valores sendo o primeiro zero
    System.out.println(calc.soma(0, 3));
    // Cenario de teste 4: Soma de dois valores sendo os dois zeros
    System.out.println(calc.soma(0, 0));
    // Cenario de teste 5: Soma de dois valores sendo o primeiro negativo
    System.out.println(calc.soma(-5, 3));
    // Cenario de teste 6: Soma de dois valores sendo o segundo negativo
    System.out.println(calc.soma(3, -5));

    // Cenario de teste 7: subtracao de dois valores
    System.out.println(calc.subtracao(3, 3));
    // Cenario de teste 8: subtracao de dois valores sendo o ultimo zero
    System.out.println(calc.subtracao(3, 0));
    // Cenario de teste 9: subtracao de dois valores sendo o primeiro zero
    System.out.println(calc.subtracao(0, 3));
    // Cenario de teste 10: subtracao de dois valores sendo os dois zeros
    System.out.println(calc.subtracao(0, 0));
    // Cenario de teste 11: subtracao de dois valores sendo o primeiro negativo
    System.out.println(calc.subtracao(-5, 3));
    // Cenario de teste 12: subtracao de dois valores sendo o segundo negativo
    System.out.println(calc.subtracao(3, -5));

    // Cenario de teste 13: multiplicacao de dois valores
    System.out.println(calc.multiplicacao(3, 3));
    // Cenario de teste 14: multiplicacao de dois valores sendo o ultimo zero
    System.out.println(calc.multiplicacao(3, 0));
    // Cenario de teste 15: multiplicacao de dois valores sendo o primeiro zero
    System.out.println(calc.multiplicacao(0, 3));
    // Cenario de teste 16: multiplicacao de dois valores sendo os dois zeros
    System.out.println(calc.multiplicacao(0, 0));
    // Cenario de teste 17: multiplicacao de dois valores sendo o primeiro negativo
    System.out.println(calc.multiplicacao(-5, 3));
    // Cenario de teste 18: multiplicacao de dois valores sendo o segundo negativo
    System.out.println(calc.multiplicacao(3, -5));

    // Cenario de teste 19: divisao de dois valores
    System.out.println(calc.divisao(3, 3));
    // Cenario de teste 20: divisao de dois valores sendo o ultimo zero; OBS: CODIGO ABAIXO COMENTADO POIS COMO ELE LANCA UMA EXCECAO QUEBRA O CODIGO, PARA TESTE DESCOMENTAR.
    //  System.out.println(calc.divisao(3, 0));
    // Cenario de teste 21: divisao de dois valores sendo o primeiro zero
    System.out.println(calc.divisao(0, 3));
    // Cenario de teste 22: divisao de dois valores sendo os dois zeros; OBS: CODIGO ABAIXO COMENTADO POIS COMO ELE LANCA UMA EXCECAO QUEBRA O CODIGO, PARA TESTE DESCOMENTAR.
    //  System.out.println(calc.divisao(0, 0));
    // Cenario de teste 23: divisao de dois valores sendo o primeiro negativo
    System.out.println(calc.divisao(-5, 3));
    // Cenario de teste 24: divisao de dois valores sendo o segundo negativo
    System.out.println(calc.divisao(3, -5));
  }
}
