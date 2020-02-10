package HW6;


public abstract class Animals {
    private String name;
    private String color;
    private int age;
    private float jump;
    private int running;
    private int climbingTrees;
    private int swimming;

    public Animals(String name, String color, int age, float jump, int running, int climbingTrees,int swimming) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.jump = jump;
        this.running = running;
        this.climbingTrees =climbingTrees;
        this.swimming = swimming;
    }

    public int getClimbingTrees() {
        return climbingTrees;
    }

    public void setClimbingTrees(int climbingTrees) {
        this.climbingTrees = climbingTrees;
    }

    public int getSwimming() {
        return swimming;
    }

    public void setSwimming(int swimming) {
        this.swimming = swimming;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getJump() {
        return jump;
    }

    public void setJump(float jump) {
        this.jump = jump;
    }

    public int getRunning() {
        return running;
    }

    public void setRunning(int running) {
        this.running = running;
    }

    public void printInfo (){
         System.out.printf( "Кличка = %s; Цвет = %s; Возраст = %d; Высота прыжка = %f; Дистанция бега = %d;" +
                         "Может залесть на дерево высотой = %d; Плавает на расстояние = %d%n ",
                 getName(),
                 getColor(),
                 getAge(),
                 getJump(),
                 getRunning(),
                 getClimbingTrees(),
                 getSwimming());
     }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", jump=" + jump +
                ", running=" + running +
                ", climbingTrees=" + climbingTrees +
                ", swimming=" + swimming +
                '}';
    }

    public boolean jumping (float height){
        if (height <= getJump()){
            System.out.print(getName());
            return  true;
        }
        return false;
    }
    public boolean run (int distanceRun) {
        if (distanceRun <= getRunning()) {
            System.out.print(getName());
            return true;
        }
        return false;
    }
    public abstract boolean swim (int distanceSwim);
    public abstract boolean climbing( int distanceClimbing);

}
