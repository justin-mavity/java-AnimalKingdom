package kingdom;

public class Birds extends Animal{
    private String name;
    private int year;

    public Birds(int id, String name, int year){
        super(id);
        this.name = name;
        this.year = year;
    }

    @Override
    public String move(){
        return "fly";
    }

    @Override
    public String reproduce(){
        return "eggs";
    }

    @Override
    public String breath(){
        return "lungs";
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
        return "Birds: " + name + " Year: " + year;
    }
}
