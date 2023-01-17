package EnumPractice;

public class enum1 {
    enum Week{
        Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;
        Week(){
            System.out.println("Weekdays are "+this);
        }


    }
    public static void main(String[] args) {
//        System.out.println();
        Week wk;
        wk=Week.Thursday;
        System.out.println(wk.name());

        for(Week day: Week.values()){
            System.out.println(day);
        }
    }

}
