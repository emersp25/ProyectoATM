
package atmproject.secciona;

/**
 *
 * @author miguelcatalan
 */

public class Retiro extends Transaccion {
    
    private Pantalla pantallaObj;
    private Teclado tecladoObj;
    
    Retiro (){
    this.pantallaObj = new Pantalla();
    this.tecladoObj = new Teclado();
    }
    
    public void ejecutar() {
        
        pantallaObj.mostrarMensaje("Menu de Retiro\n");
        pantallaObj.mostrarMensaje("1- $20\n"+"2- $40\n"+"3- $60\n"+ "4- $100\n"+"5- $200\n"+"6- Cancelar transaccion\n");
        pantallaObj.mostrarMensaje("Elija un monto de retiro\n");
        int menu1 = 0;
        menu1 = tecladoObj.recibirEntrada();
             switch (menu1){
                 case 1:{
                  System.out.println("has retirado:");
                  pantallaObj.mostrarMensaje("$20\n");  }break;
                 case 2:{
                      pantallaObj.mostrarMensaje("Has retirado");
                      pantallaObj.mostrarMensaje("$40\n");}break;
                 case 3:{
                      pantallaObj.mostrarMensaje("Has retirado");
                      pantallaObj.mostrarMensaje("$60\n");}break;
                 case 4:{
                      pantallaObj.mostrarMensaje("Has retirado"); 
                      pantallaObj.mostrarMensaje("$100\n");}break;
                 case 5:{
                      pantallaObj.mostrarMensaje("Has retirado");
                      pantallaObj.mostrarMensaje("$200\n");}break;
                 case 6:{
                   if( menu1 == 6){
                       pantallaObj.mostrarMensaje("Cancelo la transaccion");} 
                 }break;
             }
    }
    //Sobrecarga de métodos:
    //Métodos con el mismo nombre pero diferente firma dentro de la misma clase
    //No depende de relaciones de herencia
}
