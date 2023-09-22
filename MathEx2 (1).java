public class MathEx2 {
    public static void main (String [] args){
        System.out.println(swap(123));
        System.out.println(swap(432));
        System.out.println(swap(601));
        System.out.println(swap(932));
        timeLeft(1 ,15,4,36);
        timeLeft(12,34,19,20);
        timeLeft(3,42,7,10);
        System.out.println(dayOfWeek(0,1));
        System.out.println(dayOfWeek(5,28));
        System.out.println(dayOfWeek(0,23));
        System.out.println(dayOfWeek(2,1));
    }
    public static int swap(int x){
        int number = (x/10)%10;
        int number2 =(x%10);
        int number3 = (x/100)%10;
        int result= number3 *100 + number *1 + number2 *10;

        return result;
    

    }
    public static void timeLeft(int curHour, int curMin, int depHour, int depMin){
        int minutesLeft = depMin-curMin;
        int hoursLeft= depHour-curHour;
        int totalMinutes= hoursLeft*60 + minutesLeft;
        int hoursLeft2= totalMinutes/60;
        int minutesLeft2=totalMinutes%60;
        System.out.println("You have "+hoursLeft2+" hours and "+minutesLeft2+" minutes.");
    }
    public static int dayOfWeek(int a, int b){
    int result2 = (a+b-1)%7;
    return result2;

    }
   


}
