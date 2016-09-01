/* Andrew Kulpa
   order of operations
   with defining F
   would cause it to 
   be the wrong number
   without adding the
   parenthesis to it */

public class GravityForce
{
   public static void main(String[] args)
   {
      double G;
      G = 6.67e-11;
      double mass1;
      mass1 = 5.97e24;
      double mass2;
      mass2 = 7.35e22;
      double r;
      r = 388403;
      
      double F;
      F = (G * mass1 * mass2)/(r * r);
      
      System.out.println(F);
   }
}