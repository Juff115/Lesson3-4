import hsa.*;

public class PowersChart {

    public static void main(String[] args) {
        Console c=new Console();
        int expo, tot=0;
        while(true){
            c.print("Enter the exponent for 2 between 1-10: ");
            expo=c.readInt();
            if(expo>=0 & expo<=10){
                break;
            }
            else{
                c.print("Invalid\n");
            }
        }
        c.println("X\t2^X");
        c.println("--\t---");
        for (int x=0; x<=expo; x++){
        tot= (int) Math.pow(2,x);
        c.print(""+x+"\t");
        c.println(" "+tot);
        }
    }
    
}
