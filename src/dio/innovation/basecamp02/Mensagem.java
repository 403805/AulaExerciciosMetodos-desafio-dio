package dio.innovation.basecamp02;

public class Mensagem {

        public static void ObterMensagen(int hora){

            switch (hora) {
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    System.out.println(" Bom Dia! ");
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:

                    System.out.println("Boa tarde! ");
                    break;

                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println(" Boa Noite !");

                    break;
                default:
                    System.out.println(" Mensagem invalidá: ");
            }
        }

        public static void mensagemBomDia(){

        }
        public static void mensagemBoaTarde(){

    }
    public static void mensagemBoaNoite(){

    }
}
