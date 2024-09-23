public class Main
{
  public static void main(String[] args)
  {
    double someDist = distFormula(1,1,2,2);
    System.out.println(someDist);
  }
  public static double distFormula(double x1, double y1, double x2, double y2)
  {
    double dist = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    return dist;
  }
  public static double quadFormPositive (double a, double b, double c)
  {
    double D = Math.sqrt(b*b - 4*a*c);
    return (-b + D) / (2*a);
  }
  // Implement distance formula method here

  // implement one of your quadratic formula methods here

  // implement the other quadratic formula here
}
