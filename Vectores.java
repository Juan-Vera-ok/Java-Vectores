public class Vectores
{
   public static void main(String[]args) 
   {
      int dim=4;
      int []datos = new int[dim];
         
         for(int i=0;i<dim;i++)
         {
            System.out.println("Ingrese valor en la posicion: "+i);
            int n = Console.readInt();
            datos[i]=n;
         }
         
         for(int i=0;i<dim;i++)
            System.out.println("El valor en la posicion "+i+" es: "+datos[i]);   
      
 
   }
}