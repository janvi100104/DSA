public class StaticLearn {
    public static void main(String[] args) {
        Human human1 = new Human(25, "Alice", 50000, false);
        Human human2 = new Human(30, "Bob", 60000, true);
        System.out.println("Total population: " + human2.population);    
    }
    static public class Human {
        int age;
        String name;
        int salary;
        boolean isMarried;
        static long population;

        public Human(int age, String name, int salary, boolean isMarried) {
            this.age = age;
            this.name = name;
            this.salary = salary;
            this.isMarried = isMarried;
            Human.population++;
        }
    }
}
