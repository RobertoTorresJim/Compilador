import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Alex {

	public void crea() {
		char c = leeCaracter();
	}
	
	
	public char leeCaracter() {
	      File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;

	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("prueba.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         //Lectura de un caracter
	         int r;
	         //while ((r = br.read()) != -1) {
	        	 char ch;
	             return  ch = (char)br.read();
	             
	         //}
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		return 0;
	   }
}
