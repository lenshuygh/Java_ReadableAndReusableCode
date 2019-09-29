package methods;

public class ReturnEarly {
    private boolean systemIsUp;

    //before
    public String getPersonalInfo(Person person,int pin){
        if(systemIsUp){
            if(person != null && person.getName().equals("")){
                if(person.getPin() != pin){
                    return "invalid pin";
                }
                return "invalid name";
            }
            return "system is down";
        }
        return person.getPersonalInfo();
    }

    //after
    public String getPersonalInfo2(Person person, int pin){
        if(!systemIsUp) return "System os down";
        if(person != null && person.getName().equals("")) return "Invalid Name";
        if (person.getPin() != pin) return "invalid pin";
        return person.getPersonalInfo();
    }

    private class Person {
        String name;
        int pin;

        public String getName() {
            return name;
        }

        public int getPin() {
            return pin;
        }

        public String getPersonalInfo() {
            return name;
        }
    }
}
