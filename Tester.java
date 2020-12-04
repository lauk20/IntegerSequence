public class Tester{
  public static void main(String[] args){

    IntegerSequence r = new Range(10,15);
    while (r.hasNext()){
      System.out.print(r.next());
      if (r.hasNext()){
        System.out.print(", ");
      }
    }
    System.out.println();

    IntegerSequence a = new Range(1,1);
    while (a.hasNext()){
      System.out.print(a.next());
      if (a.hasNext()){
        System.out.print(", ");
      }
    }
    System.out.println();

    IntegerSequence c = new Range(-10,10);
    int j = 0;
    while (j < 22){
      if (j == 4){
        c.reset();
      }
      System.out.print(c.next());
      if (c.hasNext()){
        System.out.print(", ");
      }
      j = j + 1;
    }
    System.out.println("\n" + c.length());
    System.out.println();

    IntegerSequence b = new Range(1,1);
    int i = 0;
    while (i < 2){
      System.out.print(b.next());
      if (b.hasNext()){
        System.out.print(", ");
      }
      i = i + 1;
    }
    System.out.println();

  }
}
