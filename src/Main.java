public class Main {
    public static void main(String[] args) {
        int man = 16;
        if (man <= 18) {
            System.out.println(" Если возраст человека равен: " + man + " то он не достиг совершеннолетия, нужно немного подождать. ");
        }
        if (man >= 18) {
            System.out.println(" Если возраст человека равен: " + man + " то он совершеннолетний. ");
        }
        System.out.println();

        int digree = 12;
        if (digree >= 5) {
            System.out.println(" На улице " + digree + " градусов, можно идти без шапки");
        }
        if (digree <= 5) {
            System.out.println(" На улице " + digree + " градусов, нужно надеть шапку. ");
        }
        System.out.println();

        int speed = 74;
        if (speed >= 60) {
            System.out.println(" Если скорость " + speed + " то придется заплатить штраф. ");
        }
        if (speed <= 60) {
            System.out.println(" Если скорость " + speed + " то  можно ездить спокойно. ");
        }
        System.out.println();

        int age = 28;
        if (age >= 2 && age <= 6) {
            System.out.println(" Если возраст человека равен " + age + " то ему нужно ходить в детский садик. ");
        }
        if (age >= 7 && age <= 17) {
            System.out.println(" Если возраст человека равен " + age + " то ему нужно ходить в школу. ");
        }
        if (age >= 18 && age <= 24) {
            System.out.println(" Если возраст человека равен " + age + " то ему нужно ходить в университет. ");
        }
        if (age > 24) {
            System.out.println(" Если возраст человека равен " + age + " то ему нужно ходить на работу. ");
        }
        System.out.println();

        int child = 6;
        if (child < 5) {
            System.out.println(" Если возраст ребенка равен " + child + " то ему нельзя кататься на аттракционе. ");
        }
        if (child > 5 && child <= 14) {
            System.out.println(" Если возраст ребенка равен " + child + " то ему можно кататься на аттракционе в сопровождении. ");
        }
        if (child > 14) {
            System.out.println(" Если возраст ребенка равен " + child + " то ему можно кататься без сопровождения взрослого. ");
        }
        System.out.println();

        int totalPeople = 102;
        int totalSeats = 60;

        int seatsNeeded = totalPeople - totalSeats;

        if (seatsNeeded > 0) {
            System.out.println("Не хватает мест: " + seatsNeeded + " мест.");
        } else {
            System.out.println("Все пассажиры смогут разместиться в вагоне.");
        }
        System.out.println();

        int three = 3;
        int two = 2;
        int one = 1;
        if (two > one && two < three) {
            System.out.println(three + " самое большое число. ");
        } else {
            System.out.println(three + " не самое большое число. ");
        }
    }
}