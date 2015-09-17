import hsa.*;
import BreezySwing.Format;

public class SalaryTable {

    public static void main(String[] args) {
        Console c= new Console();
        Format f = new Format();
        int oldsal=0, newsal=40000, raise=40000;
        c.print(Format.justify('r', "YEAR", 5));
        c.print(Format.justify('r', "OLD SALARY", 15));
        c.print(Format.justify('r', "RAISE", 15));
        c.println(Format.justify('r', "NEW SALARY", 20));
        c.print(Format.justify('r', "----", 5));
        c.print(Format.justify('r', "----------", 15));
        c.print(Format.justify('r', "-----", 15));
        c.println(Format.justify('r', "----------", 20));
        for (int x=0; x<10; x++){
            c.print(Format.justify('c', x+1, 5));
            c.print(Format.justify('c', "$"+oldsal, 20));
            c.print(Format.justify('c', "$"+ raise, 15));
            c.println(Format.justify('r', "$"+newsal, 15));
            oldsal=newsal;
            newsal*=1.03;
            raise= newsal-oldsal;
                
        }
    }
    
}
