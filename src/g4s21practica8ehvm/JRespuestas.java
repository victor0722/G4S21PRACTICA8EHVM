
package g4s21practica8ehvm;

import java.util.StringTokenizer;

public class JRespuestas {

    String[] respuestas = {
      "Thomas Edison","En Japon","1914","1789","Seis veces"
    };
    
    String[] radioR = {
        "Charles Darwin,Isaac Newton,Thomas Edison,Albert Einstein",
        "En Japon,En México,En Rusia,En china",
        "1916,1913,1914,1915",
        "1789,1788,1780,1781",
        "Una vez,Seis veces,Tres veces,Siete veces"
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
