public class Calculadora {
  // Classe basica de soma, soma a + b e retorna a resposta
  public int soma(int a, int b){
    return a+b;
  }
  // Classe basica de subtracao, subtrai a - b e retorna a resposta
  public int subtracao(int a, int b){
    return a-b;
  }
  // Classe basica de multiplicacao, multiplica a * b e retorna a resposta
  public int multiplicacao(int a, int b){
    return a*b;
  }
  // Classe basica de divisao, divide a / b e retorna a resposta, se o b for igual a 0 ele responde que lanca um erro falando que nao eh possivel fazer a conta
  public String divisao(double a, double b){
    if (b == 0){
      throw new ArithmeticException("Divisão por zero não é permitida.");
    }else{
      String resposta = String.valueOf(a/b);
      return resposta;
    }
  }
}
