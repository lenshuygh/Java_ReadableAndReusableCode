package methods;

public class NumberOfArgumentsInAMethod2 {
    public static void main(String[] args) {
        new NumberOfArgumentsInAMethod2();
    }

    NumberOfArgumentsInAMethod2(){
        //bad
        String greeting = new EmailSender().constructTemplateEmail("Mr.","John","Smith");

        //good
        Person john = new Person("Mr.","John","Smith");
        String greeting2 = new EmailSender().constructTemplateEmail(john);
    }

    private class EmailSender {
        public String constructTemplateEmail(String title, String name, String surname) {
            return String.format("Hello, %s %s %s",title,name,surname);
        }

        public String constructTemplateEmail(Person person) {
            return String.format("Hello, %s %s %s",person.getTitle(),person.getName(),person.getSurName());
        }
    }

    static class Person{
        private String title;
        private String name;
        private String surName;

        public Person(String title, String name, String surName) {
            this.title = title;
            this.name = name;
            this.surName = surName;
        }

        public String getTitle() {
            return title;
        }

        public String getName() {
            return name;
        }

        public String getSurName() {
            return surName;
        }
    }
}
