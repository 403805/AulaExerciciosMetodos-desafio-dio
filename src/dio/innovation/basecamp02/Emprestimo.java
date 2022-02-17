package dio.innovation.basecamp02;

public class Emprestimo {
     public static int getDuasParcelas(){
         return 2;

     }
     public static  int getTresParcelas(){
         return 3;
     }

        public static double TaxaDuasParcelas(){
         return 0.3;
        }
        public static double TaxaTresParcelas(){
         return  0.45;
        }

        public static void calcular (double valor, int parcelas){

          if ( parcelas == 2 ) {
              double valorFinal = valor + (valor + getDuasParcelas());

              System.out.println(" Valor final do emprestimo para 2 parcelas : R$ " + valorFinal);
          }else if ( parcelas == 3){
              double valorFinal = valor + (valor + getTresParcelas());

              System.out.println(" Valor final do emprestimo para 3 parcelas : R$ " + valorFinal);
          }else {
              System.out.println(" Quantidade de parelas não aceitas ");
          }
    }
}