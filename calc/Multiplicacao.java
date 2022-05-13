package Calc;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Multiplicacao extends Valores{
      
      public Multiplicacao (double val1, double val2){
         super(val1,val2);
      }

      Multiplicacao(){}
    @Override
    public void Calculando() {
        setResult(getVal1() * getVal2());
    }
    
    
}