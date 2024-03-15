
public class Programa{
  public static void main(String[]args){
   
   //Cargamos datos de la persona 1
   Persona pers1 = new Persona("01","Julio","Perez",25,"Masculino",67.50f,1.65f,"Calle 1","correo1@email.com");
   
   //Imprimimos todos los datos de la persona 1
   System.out.println("Primera persona registrada");
   System.out.println("ID: " + pers1.getID());
   System.out.println("Primer nombre: " + pers1.getprimer_Nombre());
   System.out.println("Primer apellido: " + pers1.getprimer_Apellido());
   System.out.println("Edad: " + pers1.getedad());
   System.out.println("Genero: " + pers1.getgenero());
   System.out.println("Peso: " + pers1.getpeso());
   System.out.println("Talla: " + pers1.gettalla());
   System.out.println("Direccion: " + pers1.getdireccion());
   System.out.println("Email: " + pers1.getemail());

   //Linea en blanco
   System.out.println("");
   
   //Cambiandole el nombre de la persona 1 y asigno ahora el nombre Juan
   pers1.setprimer_Nombre("Juan");
   
   //Obtengo o imprimo el nuevo nombre de la persona 1 por pantalla
   System.out.println("Cambio de nombre persona 1: " + pers1.getprimer_Nombre());
   
   //Linea en blanco
   System.out.println("");

   //Cargamos datos de la persona 2
   Persona pers2 = new Persona("02","Maria","Garcia",18,"Femenino",55f,1.62f,"Calle 2","correo2@email.com");
   
   //Imprimimos solo algunos datos de la persona 2
   System.out.println("Segunda persona registrada");
   System.out.println("ID: " + pers2.getID());
   System.out.println("Primer nombre: " + pers2.getprimer_Nombre());
   System.out.println("Peso: " + pers2.getpeso());
   System.out.println("Talla: " + pers2.gettalla());
   
   } //Fin del main 
   
 } //Fin de la clase Programa
   
