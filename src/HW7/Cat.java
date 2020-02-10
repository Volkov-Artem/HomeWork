package HW7;

public class Cat {

    private final String NAME;
    private boolean satiety;
    private int hunger;

    public Cat(String NAME, int hunger ,boolean satiety) {
        this.NAME = NAME;
        this.hunger = hunger;
        this.satiety = satiety;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public String getNAME() {
        return NAME;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void eat(Platter platter){
        if (satiety == false) {
            if (platter.reduceFood(hunger)) {
                setSatiety(true);
            }
        }catEatInfo();
    }
    private void catEatInfo(){
        if (satiety == true){
            System.out.println(this.NAME + " Наелся до отвала");
        }else System.out.println(this.NAME + " Meow meow :з : котик говорит что в миске еды недостаточно ");
    }
}
