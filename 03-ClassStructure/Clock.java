public class Clock {
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;
    Clock(){
        hour = 0;
        minute = 0;  
    }

    Clock(int hour, int minute){
        if ((0<hour) && (hour<23) && (0<minute) && (60>minute)) {
            this.hour = hour;
            this.minute = minute;  
        } else {
            System.out.println("Can't be a time");
        }
        
    }

    void setAlarm(int alarmHour, int  alarmMinute){
        if ((0<alarmHour) && (alarmHour<24) && (0<alarmMinute) && (60>alarmMinute)) {
            this.alarmHour = alarmHour;
            this.alarmMinute = alarmMinute;  
        } else {
            System.out.println("Can't be a alarm time");
        }
        
    }

    void runAlarm() {
        System.out.println("beep-beep-beep-beep !!");
    }

    void setClock(int hour, int minute){
        if ((0<hour) && (hour<24) && (0<minute) && (60>minute)) {
            this.hour = hour;
            this.minute = minute;  
        } else {
            System.out.println("Can't be a time");
        }
        
    }

    void setClock(){
        hour = 0;
        minute = 0;  
    }

    void displayTime(){
        System.out.println("Current time is "+hour+":"+minute);
    }

    void addOneMinute(){
        if (minute<59){
            minute +=1;      
        } else {
            hour =hour<23? hour +1: 0;
            minute = 0; 
        }
        
        if ((minute == alarmMinute) && (hour == alarmHour)) {
            runAlarm();
        }
    }

    public static void main(String[] args) {
        Clock cl1 = new Clock(12,47);
        cl1.displayTime();
        cl1.setAlarm(12, 48);
        cl1.addOneMinute();
        cl1.displayTime();
        cl1.setClock();
        cl1.displayTime();
        cl1.setClock(23,58);
        cl1.displayTime();
        cl1.addOneMinute();
        cl1.displayTime();
        cl1.addOneMinute();
        cl1.displayTime();
    }
}
