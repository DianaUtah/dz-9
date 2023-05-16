public class Main {
    public static void main(String[] args) {
        Man john = new Man("John", "Doe", 40);
        Woman jane = new Woman("Jane", "Smith", 35);

        john.setPartner(jane);
        jane.setPartner(john);

        john.registerPartnership();

        System.out.println("John's last name: " + john.getLastName()); // Output: Doe
        System.out.println("Jane's last name: " + jane.getLastName()); // Output: Doe

        System.out.println("Is John retired? " + john.isRetired()); // Output: false
        System.out.println("Is Jane retired? " + jane.isRetired()); // Output: false

        john.setAge(65);
        jane.setAge(60);

        System.out.println("Is John retired now? " + john.isRetired()); // Output: true
        System.out.println("Is Jane retired now? " + jane.isRetired()); // Output: true

        john.deregisterPartnership(true);

        System.out.println("John's last name after deregistering partnership: " + john.getLastName()); // Output: Doe
        System.out.println("Jane's last name after deregistering partnership: " + jane.getLastName()); // Output: Smith

        john.setPartner(null);
        jane.setPartner(null);
    }
}