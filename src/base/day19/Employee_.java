package src.base.day19;

class Employee_ {
    private String name;
    private double sal;
    private String id;

    public Employee_(String name, double sal, String id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return this.sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return "employee{name='" + this.name + "', sal=" + this.sal + ", id='" + this.id + "'}";
    }
}
