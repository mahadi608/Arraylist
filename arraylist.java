import java.util.ArrayList;

public class arraylist {

    public static void main(String[] args) {
        
        ArrayList<String> food = new ArrayList<>();

        food.add("chicken");

        food.add("rice");

        receivedData obj = new receivedData(food);

        obj.printData();


        //System.out.println(food);
    }
    
}

class receivedData{

    ArrayList<String> foo = new ArrayList<>();

    receivedData(ArrayList<String>a){

        foo = a;
    }

    public void printData(){

        System.out.println(foo);
    }


}
