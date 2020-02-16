package HW7;

public class Platter {
    private int meal;

    public Platter(int meal) {
        this.meal = meal;
    }

    public void setMeal(int meal) {
        this.meal = meal;
    }

    public int getMeal() {
        return meal;
    }

    public void info(){
        System.out.println(this);
    }

    public boolean reduceFood (int hanger){
        if (this.meal >= hanger) {
            this.meal -= hanger;
            return true;
        }
        return false;
    }
    public void pourFood(){
        this.meal += 200;
    }

    @Override
    public String toString() {
        return "platter{" +
                "meal=" + meal +
                '}';
    }
}
