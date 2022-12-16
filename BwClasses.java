class Demo
{
  static int a=50;
  static double b=5.5;

    static void add(int X)
    {
       if
       (X>=110)
       {
         a=100;
       }
         System.out.println(a);

    }


public static void mul(int X)
{
  switch(X)
  {
    case 1:
    {
      System.out.println(b);
    }

   case 2:
    {
      System.out.println(a);
    }

  }


}

}
class Sample
{

  static double c=6.8;

    static void sub(int a)
    {
      int e=20;
      int d=e-a;

      if(d>=10)
      {
        Demo.b=c;
      }
    
    
    }


}



class BwClasses
{
  public static void main(String[] args)
  {
     System.out.println(Demo.b);
     Sample.sub(10);
     System.out.println(Sample.c);
     Demo.mul(1);
     Demo.add(49);
     System.out.println(Demo.a);
     System.out.println(Demo.b);

  
  
  }


}