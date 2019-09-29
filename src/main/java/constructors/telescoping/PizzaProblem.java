package constructors.telescoping;

public class PizzaProblem {
    private int size;
    private boolean cheese;
    private boolean ham;
    private boolean mushroom;

    public PizzaProblem(int size) {
        this.size = size;
    }

    public PizzaProblem(int size, boolean cheese) {
        this.size = size;
        this.cheese = cheese;
    }

    public PizzaProblem(int size, boolean cheese, boolean ham) {
        this.size = size;
        this.cheese = cheese;
        this.ham = ham;
    }

    public PizzaProblem(int size, boolean cheese, boolean ham, boolean mushroom) {
        this.size = size;
        this.cheese = cheese;
        this.ham = ham;
        this.mushroom = mushroom;
    }


}
