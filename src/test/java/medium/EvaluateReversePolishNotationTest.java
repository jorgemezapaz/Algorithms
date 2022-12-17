package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateReversePolishNotationTest {

    @Test
    void solutionTest() {
        String[] tokens = new String[]{"2","1","+","3","*"};
        Integer expected = 9;
        Assertions.assertEquals(expected, EvaluateReversePolishNotation.firstSolution(tokens));
    }
    @Test
    void solutionTest2() {
        String[] tokens = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        Integer expected = 22;
        Assertions.assertEquals(expected, EvaluateReversePolishNotation.firstSolution(tokens));
    }
}