package lecture3.controller;

import lecture1.model.Calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/state")
    public Double getCalculatorState() {
        Calculator calculator = new Calculator();
        return calculator.plus(5);
    }
}
