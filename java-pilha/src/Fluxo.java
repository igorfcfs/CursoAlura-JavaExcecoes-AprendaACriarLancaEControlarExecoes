
public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        } catch (ArithmeticException | NullPointerException e) {
        	String msg = e.getMessage();
        	System.out.println("Exception " + msg);
        	e.printStackTrace();
        } /*catch (NullPointerException e) {
        	String msg = e.getMessage();
        	System.out.println("NullPointerException " + msg);
        	//e.printStackTrace();
        }*/
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
        //Conta c = new Conta();
        //throw c;
        
        //ArithmeticException ex = new ArithmeticException("deu errado");
        //throw ex;
        
        throw new ArithmeticException("deu errado");
        
        //System.out.println("Fim do metodo2");
    }
}