package main;
import figura.*;

public class sistemajava {

	public class Aplicacao {
	    public static void main(String[] args) {
	        System.out.println("Criando figuras:");

	        Retangulo retangulo = new Retangulo("azul", 200, 40);
	        Triangulo triangulo = new Triangulo("verde", 100, 80);
	        Quadrado quadrado = new Quadrado("preto", 100);

	        System.out.println(retangulo);
	        System.out.println(triangulo);
	        System.out.println(quadrado);
	    }
	}
}

