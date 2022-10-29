public class DisplayToCurrentTime {
    public static void main(String[] args) {
        System.out.print("Current Time is ");
        long totalMilliSeconds = System.currentTimeMillis();
        /* All computers use UNIX epoch, we use that is for current time.
        UNIX epoch starts since 00:00 (Time) / 01.01.1970 (Date) */
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;


        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        System.out.println( currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }

}
