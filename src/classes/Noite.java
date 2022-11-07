package classes;
public class Noite implements EstadoDia{

    @Override
    public EstadoDia anoitecer() {
        System.out.println("Ja está de noite");
        return new Noite();
    }

    @Override
    public EstadoDia amanhecer() {
        System.out.println("Amanheceu");
        return new Manha();
    }

    @Override
    public EstadoDia atardecer() {
        System.out.println("Entardeceu");
        return new Tarde();
    }
    

}
