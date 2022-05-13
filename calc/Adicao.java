package Calc;
import lombok.Getter;
import lombok.Setter;


public class Adicao extends Valores {
	
	    public Adicao(double n1, double n2) {
	        super(n1,n2);
	    }

	    Adicao(){}
	    @Override
	    public void Calculando() {
	       setResult(getVal1() + getVal2());    }
	    
	    
	
}
