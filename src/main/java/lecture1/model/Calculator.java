package lecture1.model;

import java.io.Serializable;

public class Calculator implements Serializable {
    private double result;

    public Calculator() {
        this.result = 0.0;
    }

    public double plus(double number) {
        this.result += number;
        return this.result;
    }

    public double getResult() {
        return this.result;
    }
}
