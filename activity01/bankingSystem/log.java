package activity01.bankingSystem;

public class Log {
        private static Log instanciaUnica;
      
        public static Log getInstance() {
            if (instanciaUnica == null) {
                synchronized (Log.class) {
                    if (instanciaUnica==null) {
                        instanciaUnica= new Log();
                    }
                }
            }
            return instanciaUnica;
            }
            private Log() {
            
            }
          
        }
    
    
    
    
