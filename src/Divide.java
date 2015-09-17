import hsa.*;
public class Divide {

    public static void main(String[] args) {
        Console c= new Console();
        int div=0, remain=0;
        int[] num;
        num = new int[2];
        for (int x=0; x<2; x++){
            c.print("Enter num " + (x+1) +":");
            num[x] = c.readInt();
        }
        if (num[0] <= num[1]){
            div=num[1]/num[0];
            remain=num[1]%num[0];
            c.println(""+num[1]+" divided by "+num[0]+" is equal to "+div+" with a remainder of "+ remain);
        }
        else{
            div=num[0]/num[1];
            remain=num[0]%num[1];
            c.println(""+num[0]+" divided by "+num[1]+" is equal to "+div+" with a remainder of "+ remain);
        }
        
    }
    
}
