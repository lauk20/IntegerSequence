import java.util.NoSuchElementException;
public class ArraySequenceTester{
  public static void main(String[] args){

    int[]nums = {1,3,5,0,-1,3,9};
    IntegerSequence as = new ArraySequence(nums);
    System.out.println("ArraySequence(array):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
    System.out.println();

    int[]nums2 = {99,1,3,5,0,-1,3,9,99};
    as = new ArraySequence(nums2);
    System.out.println("ArraySequence(array):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
    System.out.println();

    IntegerSequence r = new Range(10,20);
    IntegerSequence as2 = new ArraySequence(r);
    System.out.println("ArraySequence(seq):");
    while(as2.hasNext()){
      System.out.print(as2.next()+", ");
    }
    System.out.println();

    IntegerSequence r1 = new Range(-10,-10);
    IntegerSequence as3 = new ArraySequence(r1);
    System.out.println("ArraySequence(seq):");
    while(as3.hasNext()){
      System.out.print(as3.next()+", ");
    }
    System.out.println();

    IntegerSequence r2 = new Range(-10,-9);
    IntegerSequence as4 = new ArraySequence(r2);
    System.out.println("ArraySequence(seq):");
    as4.next();
    as4.reset();
    as4.next();
    System.out.println(as4.next() == -9);

    IntegerSequence r3 = new Range(0,0);
    IntegerSequence as6 = new ArraySequence(r3);
    as6.next();
    try{
      as6.next();
    }
    catch(NoSuchElementException e){
      System.out.println("Good exception");
    }
  }

}
