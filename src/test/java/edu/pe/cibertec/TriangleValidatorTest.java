package edu.pe.cibertec;

import epu.pe.cibertec.TriangleValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Validator Triangle Test")
public class TriangleValidatorTest {

    private TriangleValidator triangleValidator;

    @BeforeEach
    void setUp ()
    { triangleValidator = new TriangleValidator(); }

    @Test
    @DisplayName("3 sides equals")
    void when3SidesEqualse_TriangleEquilatero(){
        assertEquals("Equilatero",triangleValidator.isValid(5,5,5));
    }

    @Test
    @DisplayName("2 sides equals")
    void when2SidesEquals_TriangleIsosceles(){
        assertEquals("Isosceles", triangleValidator.isValid(3,4,3));
    }

    @Test
    @DisplayName("2 different sides")
    void when3DifferentSides_TriangleEscaleno(){
        assertEquals("Escaleno", triangleValidator.isValid(2,4,3));
    }


}
