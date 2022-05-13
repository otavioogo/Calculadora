package Calc;
import lombok.Getter;
import lombok.Setter;

public class Divisao extends Valores{

    public Divisao(double val1, double val2){
        super(val1,val2);
    }

    Divisao(){}
    @Override
    public void Calculando() {
        setResult(getVal1()/ getVal2());
    }
}