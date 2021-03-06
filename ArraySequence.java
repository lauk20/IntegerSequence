import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  public ArraySequence(int[] other){
    data = new int[other.length];
    for (int i = 0; i < other.length; i++){
      data[i] = other[i];
    }
  }

  public ArraySequence(IntegerSequence otherseq){
    data = new int[otherseq.length()];
    otherseq.reset();
    for (int i = 0; i < data.length; i++){
      data[i] = otherseq.next();
    }
    otherseq.reset();
  }

  public boolean hasNext(){
    if (currentIndex >= data.length){
      return false;
    }

    return true;
  }

  public int next(){
    if (hasNext()){
      int trueCurrent = data[currentIndex];

      currentIndex = currentIndex + 1;

      return trueCurrent;
    }
    else{
      throw new NoSuchElementException("No more values left in sequence");
    }
  }

  public int length(){
    return data.length;
  }

  public void reset(){
    currentIndex = 0;
  }
}
