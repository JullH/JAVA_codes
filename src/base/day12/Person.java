package src.base.day12;

class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    void passRiver() {
        Vehicles vehicles = (Vehicles) jiaotonggongjugngchang.getBoat();
        vehicles.work();
        System.out.println(vehicles.hashCode());
    }

    void Common() {
        if (!(this.vehicles instanceof Horse)) {
            this.vehicles = jiaotonggongjugngchang.getHorse();
        }

        this.vehicles.work();
        System.out.println(this.vehicles.hashCode());
    }

    void huoyanshan() {
        Vehicles vehicles = jiaotonggongjugngchang.getPlane();
        vehicles.work();
        System.out.println(vehicles.hashCode());
    }
}
