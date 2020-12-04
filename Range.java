import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start, end, current;

  public Range(int start, int end){
    this.start = start;
    this.end = end;
    current = start;
  }

  public void reset(){
    current = start;
  }

  public int length(){
    return end - start + 1;
  }

  public boolean hasNext(){
    if (current > end){
      return false;
    }

    return true;
  }

  public int next(){
    if (hasNext()){
      int trueCurrent = current;

      current = current + 1;

      return trueCurrent;
    }
    else{
      throw new NoSuchElementException("No more values left in sequence");
    }
  }

}
