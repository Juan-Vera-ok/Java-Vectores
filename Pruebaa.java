public class Pruebaa
{
   public static void main(String[]args)
   {
      
      int dim;
      System.out.println("Ingrese dimension");
      dim = Console.readInt();
      int []vec=new int [dim];
      
         for(int i=0;i<dim;i++)
         {
            vec[i]=i;
         }
         
         for(int i=0;i<dim;i++)
         {
            if(vec[i]%2==0)
               vec[i]=0;
               else
                  vec[i]=1;
         }
         
           for(int i=0;i<dim;i++)
         {
            System.out.print(vec[i]);
            System.out.print(" ");
         }
      
   }
}