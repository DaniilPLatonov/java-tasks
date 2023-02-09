package JetBrains_tasks;

class Vehicle5 {

    private String name;

    public Vehicle5(String name) {
        this.name = name;
    }
// create constructor

    class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        void printHorsePower(){
            System.out.println("Vehicle " + Vehicle5.this.name + " has " + horsePower + " horsepower.");
        }
// add field horsePower
        // create constructor

        void start() {
            System.out.println("RRRrrrrrrr....");
        }

        // create method printHorsePower()
    }
}

// this code should work
class EnjoyVehicle {

    public static void main(String[] args) {

        Vehicle5 vehicle = new Vehicle5("Dixi");
        Vehicle5.Engine engine = vehicle.new Engine(20);
        engine.printHorsePower();
    }
}