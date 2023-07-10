/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author sivagamasrinivasan
 */
public class Weekdays 
{
    public enum Weekday
    {
     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY   
    }
    private Weekday weekdays; 
    
    
  public void nameOfDay(String code)
     {
    switch(code.toUpperCase())
      {
      case "ONE":
        System.out.println(weekdays.MONDAY);
        break;
      case "TWO":
        System.out.println(weekdays.TUESDAY);
        break;
      case "THREE":
        System.out.println(weekdays.WEDNESDAY);
        break;
      case "FOUR":
        System.out.println(weekdays.THURSDAY);
        break;
      case "FIVE":
        System.out.println(weekdays.FRIDAY);
        break;
      case "SIX":
        System.out.println(weekdays.SATURDAY);
        break;
      case "SEVEN":
        System.out.println(weekdays.SUNDAY);
        break;
    }
  
}

    /**
     * @return the weekdays
     */
    public Weekday getWeekdays() {
        return weekdays;
    }

    /**
     * @param weekdays the weekdays to set
     */
    public void setWeekdays(Weekday weekdays) {
        this.weekdays = weekdays;
    }
}


