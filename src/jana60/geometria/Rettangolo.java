package jana60.geometria;

public class Rettangolo {
	
	int altezza, base;
	
	int area () {
		return base * altezza;
	}
	
	int perimetro () {
		return (base + altezza) * 2;
	}
	
    void restStampa () {
    	System.out.println("L'area del rettangolo è: " + area());
    	System.out.println("Il perimetro del rettangolo è: " + perimetro());
    }
}
