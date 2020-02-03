package HW6;


public class DogType {


    public static void main(String[] args) {
        Dogs dogType1 = new Dogs("Charley", "Чёрынй", 5, 0.6f,600,
                0,8);
        Dogs dogType2 = new Dogs("Shelby", "Белый", 4, 0.5f,400,
                0,15);

        dogType1.printInfo();
        dogType2.printInfo();

        System.out.println("Dog jump " + dogType1.jumping( 0.5f));
        System.out.println("Dog run "+ dogType2.run(590));
        System.out.println(" Dog swim " + dogType1.swim(8));
        System.out.println(dogType1.climbing(5));//вернёт false так как собака не умеет лазить по деревьям
    }


}
