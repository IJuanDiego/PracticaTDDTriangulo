package epu.pe.cibertec;

public class TriangleValidator {

    public String isValid(int a, int b, int c){

        if (a == b && b==c) {return "Equilatero";}
        if (a == b || a==c ||b==c) { return "Isosceles";}
        return "Escaleno";
    }

}
