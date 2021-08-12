package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// Test Code
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName = " + person.getFullName());
    }

    public static class Person {
        private String firstName;
        private String lastName;
        private int age;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
//            if(age<0 || age >100) this.age=0;
//            this.age = age;
           this.age = (age < 0 || age > 100) ? 0 : age;
        }

        public boolean isTeen() {
//            if(age > 12 && age <20) return true;
//            return false;
            return (age > 12 && age < 20);
        }

        public String getFullName() {
//            if(firstName.isEmpty() && lastName.isEmpty()) return "";
//            if(firstName.isEmpty()) return lastName;
//            if(lastName.isEmpty()) return firstName;
//            return firstName + " " + lastName;
            return (firstName.isEmpty() && lastName.isEmpty()) ? "" : (firstName.isEmpty()) ? lastName : (lastName.isEmpty()) ? firstName : firstName + " " + lastName;
        }
    }
}
