import java.text.DecimalFormat;

public class Time
{
  private int hourMin;
  private int hourMax;
  private int minuteMin;
  private int minuteMax;

  public setData(int h, int m){
    setHour(h);
    setMinute(m);
  }

  public Time(int t){
    int h = t / 100;
    setMinutes(t % 100);
  }

  public Time(){
    hourMin = 0;
    hourMax = 23;
    minuteMin = 0;
    minuteMax = 59;
  }

  public addHours(int h){
    hours = hourMin + h;
    if(hours > hoursMax){
      hours = hours - 24;
    }
  }
  public addMinutes(int m){
    minutes = minuteMin + m;
      if(minutes > hourMax){
        minutes = minutes - 60;
        hours++;
      }
  }
  public display(){
    DecimalFormat two0 = new DecimalFormat("00");
    String s = two0.format(hours) + ":" + two0.format(minutes);
  }
  public void print()
  {
    System.out.print(display());
  }
}
