package src.day12;

class A {
    private String name = "小米";

    A() {
    }

    public void f1() {
        class B {
            private String name = "小明";

            B() {
            }

            void shout() {
                System.out.println(this.name + "\t" + A.this.name);
            }
        }

        B b = new B();
        b.shout();
    }
}
