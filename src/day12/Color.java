package src.day12;

enum Color implements IMyInterface {
        RED(255, 0, 0),
        BLUE(0, 0, 255),
        BLACK(0, 0, 0),
        YELLOW(255, 255, 0),
        GREEN(0, 255, 0);

private int REDValue;
private int GREENValue;
private int BLUEValue;

private Color(int REDValue, int GREENValue, int BLUEValue) {
        this.REDValue = REDValue;
        this.GREENValue = GREENValue;
        this.BLUEValue = BLUEValue;
        }

public void show() {
        System.out.println("Color{" + this.REDValue + "," + this.GREENValue + "," + this.BLUEValue + "}");
        }
        }
