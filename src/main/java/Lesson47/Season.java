package Lesson47;

public enum Season {
    SUMMER(35), AUTUMN(10), WINTER(-30), SPRING(20);

    private int temperature;
    Season(int temperature){
        this.temperature=temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
