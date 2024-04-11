package day12;

enum cka {
    summer("nae", 234);

    private String name;
    private int id;

    private cka(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "cka{name='" + this.name + "', id=" + this.id + "}";
    }
}
