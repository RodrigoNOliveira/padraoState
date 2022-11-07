package classes;
public class Tarde implements EstadoDia{

    @Override
    public EstadoDia anoitecer() {
        System.out.println("Anoiteceu");
        return new Noite();
    }

    @Override
    public EstadoDia amanhecer() {
        System.out.println("Amanheceu");
        return new Manha();
    }

    @Override
    public EstadoDia atardecer() {
        System.out.println("Ja está de tarde");
        return new Tarde();
    }

  

}
