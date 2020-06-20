
package clasesEvaluacionEmocional;

import java.util.StringTokenizer;

public class Respuestas {

    String[] respuestas = {
      "1. Nada de acuerdo","2. Algo de acuerdo","3. Bastante de acuerdo","4. Muy de acuerdo","5. Totalmente de acuerdo"
    };
    
    String[] radioR = {
        "1,2,3,4,5"
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[5];
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
