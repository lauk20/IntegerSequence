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

  public boolean hasNext(){
    if (current > end){
      return false;
    }

    return true;
  }

}
