
package atmproject.secciona;

/**
 *
 * @author miguelcatalan
 */
public class ATM {
    
    //Dispensador dispensadorObj = new Dispensador();
    //Pantalla pantallaObj = new Pantalla();
    //RanuraDeDeposito ranuraDeDepositoObj = new RanuraDeDeposito();
    //Teclado tecladoObj = new Teclado();
  private Transaccion transaccionObj1;
  private Transaccion transaccionObj2;
  private Dispensador dispensadorObj;
  private Pantalla pantallaObj;
  private  RanuraDeDeposito ranuraDeDepositoObj;
  private  Teclado tecladoObj;
  private Cuenta cuentaObj;
  
 
   void depositar(int monto) { }
   void acreditar(int monto) { }
   void mostrarSaldo(int numeroDeCuenta) { }
   void retirar(int monto) { }
   void debitar(int monto) { }
   boolean autenticar(int nip, int numeroDeCuenta) { return true; }
    
   public ATM() {
        this.dispensadorObj = new Dispensador();
        this.pantallaObj = new Pantalla();
        this.ranuraDeDepositoObj = new RanuraDeDeposito();
        this.tecladoObj = new Teclado();
        this.cuentaObj = new Cuenta();
        this.transaccionObj1 = new Retiro();
        this.transaccionObj2 = new Deposito();
        this.Inicializar();
    }
   
  private void Inicializar (){
      int numeroDeCuenta;
      int nip;
      int menu = 0;
      int deposito =0;
      float depositoFinal = 0.0f;
      pantallaObj.mostrarMensaje("Bienvenido\n");
      pantallaObj.mostrarMensaje("Ingrese su numero de cuenta:");
      numeroDeCuenta = tecladoObj.recibirEntrada();
      System.out.println("El numero de cuenta ingresado es: " + numeroDeCuenta);
      pantallaObj.mostrarMensaje("Ingrese su numero de nip: ");
      nip = tecladoObj.recibirEntrada();
      System.out.println("el nip ingresado es:"+ nip);
      pantallaObj.mostrarMensaje("menu Principal \n"+ "1 - Ver mi saldo \n"+ "2 - Retirar efectivo \n"+ "3 - Depositar fondo \n"+ "4 -Salir\n");
     
      menu = tecladoObj.recibirEntrada();
      //MENU
      switch(menu){
          //VER SALDO
          case 1:{
              System.out.println("Ver saldo"); 
          }
          break;
          //RETIRAR 
          case 2:{
              transaccionObj1.ejecutar();
          }
          break;
          //DEPOSITAR
          case 3:{
               transaccionObj2.ejecutar(); 
          }
          break;
          //SALIR
          case 4:{
              System.out.println("Salir");
          }
          break;
      }
      
      
  
  }
   
   
}
