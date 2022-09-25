package activity01.bankingSystem;

import java.util.ArrayList;
import java.util.List;

public class Log {

        private static Log instanciaUnica = null;
        private List<Integer> numeroContas = new ArrayList<>();
        private Log() {
            
        }
        public static Log getInstance() {
            if (instanciaUnica == null) 
                instanciaUnica= new Log();
               return instanciaUnica;
            }
        public void addnumeroConta(int numeroConta) {
            numeroContas.add(numeroConta);
        }
        public List<Integer> getNumeroContas() {
            List<Integer> retorno = new ArrayList<>();
            retorno.addAll(numeroContas);
            return retorno;
        }
        public int getNumeroConta(int index) {
            return numeroContas.get(index);
        }
          public int setNumeroConta (int index, int numeroConta) {
            return numeroContas.set(index, numeroConta);
          }
}
    
    
    
    
