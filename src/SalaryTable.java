import hsa.*;
import BreezySwing.Format;

public class SalaryTable {

    public static void main(String[] args) {
        Console c= new Console();
        Format f = new Format();
        double oldsal=0, newsal=40000, raise=40000;
        c.print(Format.justify('r', "YEAR", 5));
        c.print(Format.justify('r', "OLD SALARY", 14));
        c.print(Format.justify('r', "RAISE", 10));
        c.println(Format.justify('r', "NEW SALARY", 14));
        c.print(Format.justify('r', "----", 5));
        c.print(Format.justify('r', "----------", 14));
        c.print(Format.justify('r', "-----", 10));
        c.println(Format.justify('r', "----------", 14));
        for (int x=0; x<10; x++){
            c.print(Format.justify('r', x+1, 4));
            c.print(Format.justify('r', oldsal, 13,2));
            c.print(Format.justify('r', raise, 13,2));
            c.println(Format.justify('r', newsal, 13,2));
            oldsal=newsal;
            newsal*=1.03;
            raise= newsal-oldsal;
                
        }
    }
    
}
