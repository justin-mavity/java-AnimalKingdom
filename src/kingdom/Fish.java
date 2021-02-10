package kingdom;

public class Fish extends Animal{
    private String name;
    private int year;

    public Fish(int id, String name, int year){
        super(id);
        this.name = name;
        this.year = year;
    }

    @Override
    public String move(){
        return "swim";
    }

    @Override
    public String reproduce(){
        return "eggs";
    }

    @Override
    public String breath(){
        return "gills";
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
    public String toString(){
        return "Fish: " + name + " Year: " + year;
    }
}
