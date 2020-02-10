package HW6;

import org.w3c.dom.ls.LSOutput;

public class Cats extends Animals{


    public Cats(String name, String color, int age, float jump, int running, int climbingTrees, int swimming) {
        super(name, color, age, jump, running, climbingTrees, swimming);
    }

    @Override
    public boolean swim(int distanceSwim) {
        if (distanceSwim <= getSwimming()) {
            System.out.print(getName());
            return true;
        }
        System.out.print(getName());
        return false;
    }
    @Override
    public boolean climbing(int distanceClimbing) {
       System.out.print(getName());
       return false;
   }

//если кот научился плавать
//    @Override
//    public boolean climbing(int distanceClimbing) {
//        if (distanceClimbing <= getClimbingTrees()){
//            System.out.print(getName());
//            return true;
//        }
//        System.out.print(getName());
//        return false;
//    }

}
