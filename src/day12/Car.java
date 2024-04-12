package src.day12;

class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    public Air getAir() {
        return new Air();
    }

    class Air {
        Air() {
        }

        public void flow() {
            if (Car.this.temperature >= 40.0) {
                System.out.println("cold");
            } else if (Car.this.temperature <= 0.0) {
                System.out.println("hot");
            } else {
                System.out.println("stop");
            }

        }
    }
}
