import java.io.*;

public class Persona {
   
   // Tipos de datos y nombre de los atributos
   private String ID;
   private String primer_Nombre;
   private String primer_Apellido;
   private int edad;
   private String genero;
   private float peso;
   private float talla;
   private String direccion;
   private String email;
   
   
   // Constructor
   public Persona (String ID, String primer_Nombre, String primer_Apellido, int edad, String genero, float peso, float talla, String direccion, String email)
   {
      this.ID = ID;
      this.primer_Nombre = primer_Nombre;
      this.primer_Apellido = primer_Apellido;
      this.edad = edad;
      this.genero = genero;
      this.peso = peso;
      this.talla = talla;
      this.direccion = direccion;
      this.email = email;
   } //Fin del metodo constructor
   
   
   
   //Metodos Set o Asignar de todos los atributos
   
   public void setID (String ID){
      this.ID=ID;
   } //Fin del metodo setID
   
   
   public void setprimer_Nombre (String primer_Nombre){
      this.primer_Nombre=primer_Nombre;
   } //Fin del metodo setprimer_Nombre
   
   
     
   public void setprimer_Apellido (String primer_Apellido){
      this.primer_Apellido=primer_Apellido;
   } //Fin del metodo setprimer_Apellido

   
   public void setedad (int edad){
      this.edad=edad;
   } //Fin del metodo setedad
   
   
   public void setgenero (String genero){
      this.genero=genero;
   } //Fin del metodo setgenero
   
   
   public void setpeso (float peso){
      this.peso=peso;
   } //Fin del metodo setpeso
   
   
   public void settalla (float talla){
      this.talla=talla;
   } //Fin del metodo settalla
   

   public void setdireccion (String direccion){
      this.direccion=direccion;
   } //Fin del metodo setdireccion
   

   public void setemail (String email){
      this.email=email;
   } //Fin del metodo setemail
   


   //Metodos Get u Obtener de todos los atributos


   public String getID (){
      return ID;
   } //Fin del metodo getID


   public String getprimer_Nombre (){
      return primer_Nombre;
   } //Fin del metodo getprimer_Nombre
   
   
 
   public String getprimer_Apellido (){
      return primer_Apellido;
   } //Fin del metodo getprimer_Apellido

   

   public int getedad (){
      return edad;
   } //Fin del metodo getedad


   public String getgenero (){
      return genero;
   } //Fin del metodo getgenero


   public float getpeso (){
      return peso;
   } //Fin del metodo getpeso


   public float gettalla (){
      return talla;
   } //Fin del metodo gettalla
   

   public String getdireccion (){
      return direccion;
   } //Fin del metodo getdireccion


   public String getemail (){
      return email;
   } //Fin del metodo getemail


}//Fin de la clase Persona