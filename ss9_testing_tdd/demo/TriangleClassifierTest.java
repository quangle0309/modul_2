package ss9_testing_tdd.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    void classify222() {
        String result = TriangleClassifier.classify(2, 2, 2);
        assertEquals(TriangleClassifier.TYPE_EQUILATERAL, result);
    }

    @Test
    void classify223() {
        String result = TriangleClassifier.classify(2, 2, 3);
        assertEquals(TriangleClassifier.TYPE_ISOSCELES, result);
    }


    @Test
    void classify345() {
        String result = TriangleClassifier.classify(3, 4, 5);
        assertEquals(TriangleClassifier.TYPE_NORMAL, result);
    }

    @Test
    void classify493() {
        String result = TriangleClassifier.classify(4, 9, 3);
        assertEquals(TriangleClassifier.TYPE_INVALID, result);
    }
}