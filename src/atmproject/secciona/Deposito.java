
package atmproject.secciona;


public class Deposito extends Transaccion {
    
    private Pantalla pantallaObj;
    private Teclado tecladoObj;
    
    
    Deposito (){
    this.pantallaObj = new Pantalla();
    this.tecladoObj = new Teclado();
    }
    float deposito = 0.0f;
    float depositoFinal = 0.0f;
 public void ejecutar() {
        //super.ejecutar();
         pantallaObj.mostrarMensaje("Introduzca el monto a depositar en centavos o escriba 0 para cancelar: ");
              deposito = tecladoObj.recibirEntrada();
              if (deposito == 0){
                   pantallaObj.mostrarMensaje("Se cancelo el deposito");
              }
              else {
                  depositoFinal = (deposito/100);
                  System.out.println("Has depositado");
                  System.out.println("$"+ depositoFinal);
              }       
        
    }
}
