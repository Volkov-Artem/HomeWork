package HW7;

public class feedTheCat {
    private static final int CATS_SIZE = 4;
    public static void main(String[] args) {
        Platter platter = new Platter(150);

        Cat catsArray[] = new Cat [CATS_SIZE];
        initializingCats(catsArray);
        eatCats(platter, catsArray);
        platter.info();
        platter.pourFood();
        platter.info();
        eatCats(platter,catsArray);
        platter.info();

    }

    private static void eatCats(Platter platter, Cat[] catsArray) {
        for (Cat cat : catsArray) {
            if (!cat.isSatiety()) {
                cat.eat(platter);
            }else System.out.println(cat.getNAME()+ " уже наелся! "+ cat.getNAME() + " довольно урчит ");
        }
    }

    private static void initializingCats(Cat[] catsArray) {
        catsArray[0] = new Cat ("Matroskin", 20,false);
        catsArray[1] = new Cat ("Barsik", 50,false);
        catsArray[2] = new Cat ("Murzik", 50,false);
        catsArray[3] = new Cat ("Vasya", 40,false);
    }
}
