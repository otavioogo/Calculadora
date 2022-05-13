package Calc;
import java.security.InvalidParameterException;
import java.util.Scanner;

public class Calc {

	 public void calculate( Calculando calculando){
         if(calculando == null){
             throw new InvalidParameterException("Erro");
         }
         
         calculando.Calculando();
      
   }
}

