package constructors.telescoping;

public class PizzaBuilder {

    static class Builder {
        private final int size;
        private boolean cheese;
        private boolean ham;
        private boolean mushroom;

        Builder(int size) {
            this.size = size;
        }

        Builder cheese(boolean value){
            cheese = value;
            return this;
        }

        Builder ham(boolean value){
            ham = value;
            return this;
        }
        Builder mushroom(boolean value){
            mushroom = value;
            return this;
        }

        PizzaBuilder build(){
            return new PizzaBuilder(this);
        }
    }

    private PizzaBuilder(Builder builder) {
        int size = builder.size;
        boolean cheese = builder.cheese;
        boolean ham = builder.ham;
    }

}
