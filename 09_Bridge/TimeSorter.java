public abstract class TimerSorter extends Sorter {
  public void timerSorter(Object obj[]) {
    long start = System.currentTimeMillis();
    sort(obj);
    long end = System.currentTimeMillis();
    System.out.println("time:" + (end - start));
  }
}
