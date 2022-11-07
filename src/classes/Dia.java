package classes;

public class Dia {

    protected EstadoDia estado;

    public Dia() {
        estado = new Manha();
    }

  
    public void anoitecer() {
        estado = estado.anoitecer();
    }

  
    public void amanhecer() {
        estado = estado.amanhecer();
     
    }


    public void atardecer() {
        estado = estado.atardecer();
    }

    
    
}
