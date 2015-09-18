import hsa.*;

public class PowersChart {

    public static void main(String[] args) {
        Console c=new Console();
        double expo, total;
        while(true){
            c.print("Enter the exponent for 2 between 1-10: ");
            expo=c.readDouble();
            if(expo>=0 & expo<=10){
                break;
            }
            else{
                c.print("Invalid\n");
            }
        }
        total= (double) Math.pow(2,expo);
        c.print("The answer is: "+total);
    }
    
}
