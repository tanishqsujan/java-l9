interface vehicle{
    void changegear(int a);
    void speedup(int a);
    void applybrakes(int a);
}
class bicycle implements vehicle{
    int speed;
    int gear;
    @Override
    public void changegear(int newgear){
        gear= newgear;
    }
    
    @Override
    public void speedup(int increment){
        speed += increment;
    }
    public void applybrakes(int decrement){
        speed -= decrement;
    }
    
    public void printstates(){
        System.out.println("Speed" +speed+ "Gear" +gear);
    }
}
class car implements vehicle{
    int speed;
    int gear;
    
    @Override
    public void changegear(int newgear){
        gear= newgear;
    }
    
    @Override
    public void speedup(int increment){
        speed= speed+increment;
    }
    
    @Override
    public void applybrakes(int decrement){
        speed= speed-decrement;
    }
    
    public void printstates(){
        System.out.println("Speed" +speed+ "Gear" +gear);
    }
}
class truck implements vehicle{
    int speed;
    int gear;
    @Override
    public void changegear(int newgear){
        gear= newgear;
    }
    
    @Override
    public void speedup(int increment){
        speed += increment;
    }
    
    @Override
    public void applybrakes(int decrement){
        speed -= decrement;
    }
    public void printstates() {
        System.out.println("Speed" + speed + "Gear" + gear);
    }
}

class bike implements vehicle {
    int speed;
    int gear;

    @Override
    public void changegear(int newgear) {
        gear = newgear;
    }

    @Override
    public void speedup(int increment) {
        speed += increment;
    }

    @Override
    public void applybrakes(int decrement) {
        speed -= decrement;
    }

    public void printstates() {
        System.out.println("Speed" + speed + "Gear" + gear);
    }
}
class vehi {
    public static void main(String args[]){
        bicycle b= new bicycle();
        b.changegear(2);
        b.speedup(3);
        b.applybrakes(1);
        System.out.println("Bicycle present states");
        b.printstates();

        car c= new car();
        c.changegear(1);
        c.speedup(4);
        c.applybrakes(3);
        System.out.println("Car present states");
        c.printstates();

        truck t= new truck();
        t.changegear(6);
        c.speedup(4);
        c.applybrakes(5);
        System.out.println("Truck present states");
        t.printstates();

        bike k = new bike();
        k.changegear(4);
        k.speedup(3);
        k.applybrakes(1);
        System.out.println("Bike present states");
        k.printstates();
    }
}