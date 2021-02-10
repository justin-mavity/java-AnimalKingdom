package kingdom;

public abstract class Animal{
    protected int id;

    public Animal(int id){
        id = 0;
    }

    abstract String getName();
    abstract int getYear();

    abstract String move();
    abstract String reproduce();
    abstract String breath();
}
