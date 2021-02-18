public class Fan {
    public Fan() {
    }

    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    boolean on = false;
    int speed = SLOW;
    String color = "blue";
    int radius;

    public boolean turnOn() {
        return on = true;
    }

    public boolean turnOff() {
        return on = false;
    }

    public int setSpeed(int newSpeed) {
        if (this.turnOn()) {
            return speed = newSpeed;
        }
        return speed = 0;
    }

    public String setColor(String newColor) {
        return newColor;
    }
    public int radius(int newRadius){
        return radius=newRadius;
    }

    public static void main(String[] args) {
        Fan caiQuat = new Fan();
        caiQuat.turnOn();
       int speed =  caiQuat.setSpeed(2);
        String  color = caiQuat.setColor("red");

    }
}
