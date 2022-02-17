package dio.innovation.basecamp02;

public class Main {

    public static void main(String[] args) {
        System.out.println( "Exercicio Calculadora");

        Calculadora.multiplicacao();
        Calculadora.soma();
        Calculadora.subtracao();
        Calculadora.divisao();

        //Mensagem
        System.out.println("Mensagens :");
        Mensagem.ObterMensagen(5);
        Mensagem.ObterMensagen(15);
        Mensagem.ObterMensagen(3);

        //Emprestimo
        System.out.println(" Emprestimo ");
         Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);


    }
}
