package jackson.rocha;

public class CalcularFormasGeometricas {

    static void calcularAreaQuadrado(double lado) {
        double areaQuadrado = (lado * lado);
        System.out.printf("A area do quadrado é: %.2f\n", areaQuadrado);
    }

    static void calcularAreaCirculo(double raio) {
        double areaCirculo = (raio * raio) * Math.PI;
        System.out.printf("A area do circulo é: %.2f\n", areaCirculo);
    }
}
