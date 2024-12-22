public class Main {
    public static void main(String[] args) {
        int man = 16;
        if (man <= 18) {
            System.out.println(" Если возраст человека равен: " + man + " то он не достиг совершеннолетия, нужно немного подождать. ");
        } else {
            System.out.println(" Если возраст человека равен: " + man + " то он совершеннолетний. ");
        }
        System.out.println();

        int digree = 12;
        if (digree >= 5) {
            System.out.println(" На улице " + digree + " градусов, можно идти без шапки");
        } else {
            System.out.println(" На улице " + digree + " градусов, нужно надеть шапку. ");
        }
        System.out.println();

        int speed = 74;
        if (speed >= 60) {
            System.out.println(" Если скорость " + speed + " то придется заплатить штраф. ");
        } else {
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

        int people = 146;
        int capacity = 102;
        if (people <= capacity) {
            System.out.println(" Есть свободные места в вагоне.");
        } else {
            int excess = people - capacity;
            System.out.println("В вагоне недостаточно мест. Необходимо еще " + excess + " мест.");
        }
        System.out.println();

        int num1 = 1, num2 = 2, num3 = 3;
        int max;
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }
        System.out.println("Максимальное число: " + max);
    }
}