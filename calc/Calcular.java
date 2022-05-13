package Calc;
import java.security.InvalidParameterException;

public class Calcular {
	 public void calcular(Calculando calculando){
	      if(calculando == null){
	          throw new InvalidParameterException("Nao e possivel calcular");
	      }
	      
	      calculando.Calculando();
	  }
}
