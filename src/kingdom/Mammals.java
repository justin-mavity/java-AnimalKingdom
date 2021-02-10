package kingdom;

public class Mammals extends Animal{
    private String name;
    private int year;

    public Mammals(int id, String name, int year){
        super(id);
        this.name = name;
        this.year = year;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getYear(){
        return year;
    }


    @Override
    public String move(){
        return "walk";
    }

    @Override
    public String reproduce(){
        return "live births";
    }

    @Override
    public String breath(){
        return "lungs";
    }

    @Override
    public String toString(){
        return "Mammals: " + name + " Year: " + year;
    }

}
