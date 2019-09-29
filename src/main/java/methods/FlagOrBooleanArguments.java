package methods;

public class FlagOrBooleanArguments {
    public static void main(String[] args) {
        new FlagOrBooleanArguments();
    }

    FlagOrBooleanArguments(){
        Room room = new Room("kitchen");

        // bad
        switchLights(room,true);

        // good: split methods
        switchLightsOn(room);
        switchLightsOff(room);
    }

    private void switchLights(Room room,boolean on) {
        if(on){
            room.lightState = true;
        }
    }

    private void switchLightsOn(Room room) {
        room.lightState = true;
    }

    private void switchLightsOff(Room room) {
        room.lightState = false;
    }



    private class Room {
        String roomName;
        boolean lightState;

        public Room(String roomName) {
            this.roomName = roomName;
        }
    }
}
