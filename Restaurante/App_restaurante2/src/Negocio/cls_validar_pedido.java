package Negocio;

public class cls_validar_pedido {
    private boolean val = false;
    private String msn;
    
    public void validarDatosEntrada(
    String id, String det, String total
    ){
        if(id.equals("")||det.equals("")||total.equals("")){
            this.msn = "Debe ingresar todos los datos";
        }else{
            this.val = true;
            this.msn = "El pedido ha sido registrado con éxito";
        }
    }
    
    public String getMsn(){return this.msn;}
    public boolean getVal(){return this.val;}
}
