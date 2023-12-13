public class Main {
    public static void main(String[] args) {
       // task1
        int age=2;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то не достиг совершеннолетия");
        }

        //task2
        int temp = 6;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        //task3
        int speed = 30;
        boolean speedNow = speed <= 60;
        if (speedNow) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }

        //task4
        int age1 = 23;
        if (age1 == 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в детский сад");
        } else if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в школу ");
        } else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + " то его место в университете");
        }else {
            System.out.println("Если возраст человека равен " + age1 + " пора идти на работу");
        }

        //task5

        int age2 = 16;
        if (age2 <= 5) {
            System.out.println("Ребенку " + age2 + " лет, он не может кататься на атракционе");
        } else if (age2 > 5 && age2 < 14) {
            System.out.println("Ребенку " + age2 + " он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (age2 >= 14) {
            System.out.println("Ребенку " + age2 + "  он может кататься без сопровождения взрослого.");
        }

            //task6
            int youPlace = 105;
            int numberOfSeats = 102;
            int seatingArea = 60;
            int standingArea = numberOfSeats - seatingArea;
            if (youPlace >= 1 && youPlace <= 60) {
                System.out.println("Ваше место " + youPlace + " сидячее");
            } else if (youPlace >60 && youPlace <= 102) {
                System.out.println("Ваше место" + youPlace +  " стоячее");
            } else {
                System.out.println("Ваше место " + youPlace + " мест в вагоне больше нет");
            }


            //task7
            double x = 100.2;
            double y = 100.1;
            double z = 302;
            if (x>y && x>z) {
                System.out.println("Самое большое число " + x);
            } else if (x>y && x<z) {
                System.out.println("Самое большое число " + z);
            } else if (x<y && y>z) {
                System.out.println("Самое большое число " + y);
            } else if (x<y && y<z) {
                System.out.println("Самое большое число " + z);
            }
    }
}