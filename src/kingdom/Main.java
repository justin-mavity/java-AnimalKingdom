package kingdom;

import java.util.*;

public class Main{
    private static List<Animal> filterAnimal(List<Animal> theList, CheckAnimal tester)
    {
        List<Animal> tempList = new ArrayList<>();
        for (Animal ele : theList){
            if(tester.test(ele)){
                tempList.add(ele);
            }
        }
        return tempList;
    }
    public static void main(String[] args){
       Mammals panda = new Mammals(1,"Panda", 1869);
       Mammals zebra = new Mammals(2,"Zebra", 1778);
       Mammals koala = new Mammals(3, "Koala",1816);
       Mammals sloth = new Mammals(4,"Sloth", 1804);
       Mammals armadillo = new Mammals(5,"Armadillo", 1758);
       Mammals raccoon = new Mammals(6,"Raccoon",1758);
       Mammals bigfoot = new Mammals(7, "Bigfoot",2021);

       Birds pigeon = new Birds(1,"Pigeon", 1837);
       Birds peacock = new Birds(2,"Peacock",1821);
       Birds toucan = new Birds(3,"Toucan",1758);
       Birds parrot = new Birds(4,"Parrot", 1824);
       Birds swan = new Birds(5,"Swan",1758);

       Fish salmon = new Fish(1,"Salmon", 1758);
       Fish catfish = new Fish(2,"Catfish", 1817);
       Fish perch = new Fish(3,"Perch", 1758);

       List<Animal> kingdom = new ArrayList<>();
       kingdom.add(panda);
       kingdom.add(zebra);
        kingdom.add(koala);
        kingdom.add(sloth);
        kingdom.add(armadillo);
        kingdom.add(raccoon);
        kingdom.add(bigfoot);
        kingdom.add(pigeon);
        kingdom.add(peacock);
        kingdom.add(toucan);
        kingdom.add(parrot);
        kingdom.add(swan);
        kingdom.add(salmon);
        kingdom.add(catfish);
        kingdom.add(perch);

        kingdom.forEach((ele) -> System.out.println(ele));
        System.out.println('\n');

        kingdom.sort(Comparator.comparing(ele -> String.valueOf(ele.getYear()), Comparator.reverseOrder()));
        kingdom.forEach((ele) -> System.out.println(ele));
        System.out.println('\n');

        kingdom.sort((ele1, ele2)-> ele1.getName().compareToIgnoreCase(ele2.getName()));
        kingdom.forEach((ele) -> System.out.println(ele));
        System.out.println('\n');

        kingdom.sort((ele1, ele2)-> ele1.move().compareToIgnoreCase(ele2.move()));
        kingdom.forEach((ele) -> System.out.println(ele));
        System.out.println('\n');

        List<Animal>filteredList = filterAnimal(kingdom, (ele) -> ele.breath().equals("lungs"));
        filteredList.forEach((ele) -> System.out.println(ele));
        System.out.println('\n');

        List<Animal>filteredList1 = filterAnimal(kingdom, (ele) -> ele.breath().equals("lungs") && (ele.getYear() == 1758));
        filteredList1.forEach((ele) -> System.out.println(ele));
        System.out.println('\n');

        List<Animal>filteredList2 = filterAnimal(kingdom, (ele) -> ele.reproduce().equals("eggs") && (ele.breath().equals("lungs")));
        filteredList2.forEach((ele) -> System.out.println(ele));
        System.out.println('\n');

        List<Animal>filteredList3 = filterAnimal(kingdom, ((ele) -> ele.getYear() == 1758));
        filteredList3.sort((ele1, ele2)-> ele1.getName().compareToIgnoreCase(ele2.getName()));
        filteredList3.forEach((ele) -> System.out.println(ele));
        System.out.println('\n');

        //STRETCH GOAL
        List<Animal>filteredList4 = filterAnimal(kingdom, (ele) -> ele.move().equals("walk") && (ele.breath().equals("lungs")));
        filteredList4.sort((ele1, ele2)-> ele1.getName().compareToIgnoreCase(ele2.getName()));
        filteredList4.forEach((ele) -> System.out.println(ele));
        System.out.println('\n');
    }
}
