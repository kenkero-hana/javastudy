public class PassengerPlane{
    private String type = "旅客機";

    public String getType(){
        return type;
    }

    public void fly(){
        super("乗客を乗せて目的地まで飛行します");
    }

    public void carryPassengers(){
        System.out.println("乗客を目的地まで運びます");
    }
}