package tarea1_lpa1;

import javax.swing.text.Caret;

public class Autos {
	private String Placa;
	private String Marca;
	private String Modelo;
	private String Año;
	
	
	private String PBase;
	private String PFijo;
	private String PAdic;
	private String PMax;

     public Autos() {
    	 Placa = "ABC-636";
    	 Marca = "Kia";
    	 Modelo = "Rio Space";
    	 Año = "2020";
    	
     }
     
     public String VerPlaca() {//Getters
    	 return Placa;
     }
     public String VerMarca() {//Getters
    	 return Marca;
     }
     public String VerModelo() {//Getters
    	 return Modelo;
     }
     public String VerAño() {//Getters
    	 return Año;
     }
  
     //Precio Base Auto
     public void DarPBase() {//Setters
    	 PBase = "50";
    	 
     }
     public String VerPBase() {//Getters
    	 return PBase;
     }
     
   //Precio Fijo Auto
     public void DarPFijo() {//Setters
    	 PFijo = "0";
    	 
     }
     public String VerPFijo() {//Getters
    	 return PFijo;
     }
     
   //Precio Adicional por Dia Auto
     public void DarPAdic() {//Setters
    	 PAdic = "1.5";
    	 
     }
     public String VerPAdic() {//Getters
    	 return PAdic;
     }
   //Precio Maximo Permitido
     public void DarPMax() {//Setters
    	 PMax = "0";
    	 
     }
     public String VerPMax() {//Getters
    	 return PMax;
     }
     
}