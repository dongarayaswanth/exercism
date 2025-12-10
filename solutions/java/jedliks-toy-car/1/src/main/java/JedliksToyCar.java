public class JedliksToyCar {
    public static JedliksToyCar buy() {
        JedliksToyCar car =new JedliksToyCar();
        return car;
    }
    private int distanceDriven = 0;
    public String distanceDisplay() {
        
        return "Driven "+distanceDriven+" meters";
    }
    private int battery = 100;
    public String batteryDisplay() {
        return battery >0 ?"Battery at "+battery+"%":"Battery empty";
    }

    public void drive() {
        if(battery > 0){
            distanceDriven += 20;
            battery -= 1;
        }
    }
}
