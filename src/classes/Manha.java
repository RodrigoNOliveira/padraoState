package classes;
public class Manha implements EstadoDia {

    @Override
    public EstadoDia anoitecer() {
        System.out.println("Anoiteceu");
        return new Noite();
    }

    @Override
    public EstadoDia amanhecer() {
        System.out.println("Ja está de manha");
        return new Manha();
    }

    @Override
    public EstadoDia atardecer() {
        System.out.println("Entardeceu");
        return new Tarde();
    }

    

}
