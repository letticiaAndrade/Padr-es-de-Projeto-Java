package activity01.bankingSystem;

public class operacao {
      
        public static void main(String[] args) {
                Log log = Log.getInstance();
                log.addnumeroConta(12345);
                log.addnumeroConta(56788);
                log.addnumeroConta(967545);
                System.out.println(log.getNumeroConta(0));
               
                Log log2 = Log.getInstance();
                System.out.println(log2.getNumeroConta(0));
                System.out.println(log.hashCode());
                System.out.println(log2.hashCode());  
                log2.setNumeroConta(0, 3344);
                System.out.println(log2.getNumeroConta(0));
                System.out.println(log.getNumeroConta(0));

        }
    }


