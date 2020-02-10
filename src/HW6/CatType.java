package HW6;

public class CatType {

   public static void main(String[] args) {
     Cats catType1 = new Cats("Murzik", "Серый", 7, 1.5f,200,
             15, 0);
     Cats catType2 = new Cats("Matroskin", "серый в белую полоску", 4, 2.5f,150,
             25, 0);


       catType1.printInfo();
       catType2.printInfo();
       System.out.println(" jump " + catType1.jumping( 1.5f));
       System.out.println(" run " + catType2.run(140));
       System.out.println(" swim " + catType1.swim(8));//вернёт false так как кот не умеет плавать.
       System.out.println( " Climbing tree " + catType1.climbing(5));

   }
}
