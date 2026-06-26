package Modelo;

import javax.swing.JOptionPane;// MANEJADOR DE VENTANAS

public class Embarque {
    // UNO, DOS, TRES.....
    private String codigo;
    private String distribuidor;
    private String tipoladrillo;
    private String tipocamion;
    private int cantLadrillos;
    public Embarque(){ // constructor vacio
    }
   // metodos setter (actualizar los atributos de la clase)
    public void setCodigo(String c){this.codigo=c;}
    public void setDistribuidor(String d){this.distribuidor=d;}
    public void setTipoLadrillo(String tl){this.tipoladrillo=tl;}
    public void setTipoCamion (String tc){this.tipocamion=tc;}
    public void setCantLadrillos(int cl){
        if (cl>0){
            this.cantLadrillos=cl;        
        }else{
             JOptionPane.showMessageDialog(null,"ERROR LA, (ESTA ES LA PARTE DE PRUEBA) CANTIDAD ES NEGATIVA");       
        }  
    }
    //METODOS PARA LOS CALCULOS 
    public double precioProducto(){
        double precio=0;
        switch(this.tipoladrillo){
            case "KING KONG":precio=1.20; break;
            case "PANDERETA":precio=1.00; break;
        }
        return precio;
    }
    public double costoEnvio(){
      double costo=0;
      if (this.cantLadrillos>=1 && this.cantLadrillos<=3000){
          switch (this.tipocamion){
              case "PALETIZADO":costo=420; break;
              case "CON GUINCHE":costo=490; break;
          }
      }else{
          if (this.tipocamion.equals("PALETIZADO"))costo=350;
          else costo=420;
              }
    return costo;  
    } 
public double importeBruto(){
    return this.cantLadrillos*this.precioProducto();
}
public double importeFinal(){
    return 1.19*(this.importeBruto()+this.costoEnvio());
}
public String MostrarDatos() {
        return
               "\n****************************************" +
               "\n codigo EMBARQUE          :" + this.codigo +
               "\n Nombre DISTRIBUIDOR      :" + this.distribuidor +
               "\n tipo de LADRILLO         :" + this.tipoladrillo +
               "\n tipo de CAMION           :" + this.tipocamion +
               "\n cantidad de LADRILLO     :" + this.cantLadrillos +
               "\n precio de ladrillos      :" + this.precioProducto() +
               "\n costo de envio           :" + this.costoEnvio() +
               "\n importe bruto            :" + this.importeBruto() +
               "\n importe final            :" + this.importeFinal();
    } //  CAMBIO: Agregar esta llave para cerrar el método

} // Esta es la llave que cierra la clase

