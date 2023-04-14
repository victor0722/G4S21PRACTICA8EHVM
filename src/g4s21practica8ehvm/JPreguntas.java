
package g4s21practica8ehvm;


public class JPreguntas {
    
    String[] preguntas = {
        "¿Quién inventó la bombilla?", "¿En qué país se usó la primera bomba atómica?", "¿Cuándo empezó la Primera Guerra Mundial?",
        "¿En qué año se produjo la Revolución Francesa?", "¿Cuántas veces ha estado el hombre en la Luna?"
    };
    
   public String getPregunta(int posicion){
        return preguntas[posicion];
    }
    
}
