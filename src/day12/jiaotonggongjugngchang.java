package src.day12;

class jiaotonggongjugngchang {
    private static Horse horse = new Horse();

    jiaotonggongjugngchang() {
    }

    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static plane getPlane() {
        return new plane();
    }
}
