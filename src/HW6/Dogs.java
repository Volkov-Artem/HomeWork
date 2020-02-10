package HW6;

public class Dogs extends Animals {


    public Dogs(String name, String color, int age, float jump, int running, int climbingTrees, int swimming) {
        super(name, color, age, jump, running, climbingTrees, swimming);
    }

    @Override
    public boolean swim(int distanceSwim) {
        if (distanceSwim <= getSwimming()){
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
////если вдруг собака всётаки научилась лазить по деревьям
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
//woof