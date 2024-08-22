public class Questao3 {
    public static void main(String[] args) {
        double[] numeros = {5.0, 6.0, 9.0, 7.0, 10.0, 15.0, 3.0, 5.0, 14.0, 3.0};
        double soma = 0.0;
        for(double n: numeros) {
            soma += n;
        }
        double media = soma / numeros.length;
        System.out.println("Média: " + media);
    }
}
