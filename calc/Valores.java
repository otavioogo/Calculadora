package Calc;
import lombok.Getter;
import lombok.Setter;

public class Valores {
	
	@Getter @Setter public double val1;
    @Getter @Setter public double val2;
    @Getter @Setter public double result;
    
    Valores(){}

    public Valores(double n1, double n2){
        this.val1 = n1;
        this.val2 = n2;
    }
    
    @Override
    public void Calculando() {
    }
}
