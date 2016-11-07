



public class RMIClientMain 
{
     public static void main(String[] args) 
    {
        try {
            RmiCommunicationClient wsc = new RmiCommunicationClient();

            int suma = wsc.getSuma(123, 10);
            int resta = wsc.getResta(123, 10);
            int multiplicacion = wsc.getMultiplicacion(123, 10);
            int division= wsc.getDivision(123, 10);
            
            
            
             System.out.println(" resultado de la suma por el servidor: " + suma);
             System.out.println(" resultado de la resta por el servidor: " + resta);
             System.out.println(" resultado de la multiplicacion por el servidor: " + multiplicacion);
             if(division == -1){
                System.out.println("Error: no se puede dividir entre 0");
            }
            else{
             System.out.println(" resultado de la division por el servidor: " + division);
             }
     
        } catch (Exception ex) {
            ex.printStackTrace();
             System.err.println("Connection error the server is not responding.");
        }
    }
}
