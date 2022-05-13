package Calc;
import lombok.Getter;
import lombok.Setter;

public class Subtracao extends Valores{
    
    public Subtracao (double val1, double val2){
        super(val1,val2);
    }

    Subtracao(){
        
    }
  @Override
  public void Calculando() {
      setResult(getVal1() - getVal2());;
  }
}

