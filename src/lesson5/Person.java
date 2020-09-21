package lesson5;

public class Person {

    private String fullName;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Person(String fullName, String position, String email, String telephone, int salary, int age) {

        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {

        System.out.println("Full name: " + fullName + ", position: " + position + ", email: " + email +
                ", telephone: " + telephone + ", salary: " + salary + ", age: " + age );
    }

    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Anna Egorova", "CEO", "anna356@list.ru",
                "8927543218", 5000, 35);
        persArray[1] = new Person("Svetlana Tumanova", "HR-manager", "svetlana_31@list.ru",
                "89014317496", 3000, 32);
        persArray[2] = new Person("Ivan Ivanov", "Developer", "ivan36@list.ru",
                "89089623546", 4000, 27);
        persArray[3] = new Person("Nikita Litvinov", "Product manager", "nikita17@list.ru",
                "89028634556", 2500, 45);
        persArray[4] = new Person("Olga Semenova", "PR manager", "olga025@list.ru",
                "89073224821", 3000, 58);

        /*persArray[0].printInfo();
        persArray[1].printInfo();
        persArray[2].printInfo();
        persArray[3].printInfo();
        persArray[4].printInfo();*/

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) {
                persArray[i].printInfo();
            }
        }
    }
}
