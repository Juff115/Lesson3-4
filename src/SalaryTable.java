import hsa.*;
import BreezySwing.Format;

public class SalaryTable {

    public static void main(String[] args) {
        Console c= new Console();
        Format f = new Format();
        int oldsal=0, newsal=40000, raise=40000;
        c.print(Format.justify('r', "YEAR", 5));
        c.print(Format.justify('r', "OLD SALARY", 14));
        c.print(Format.justify('r', "RAISE", 11));
        c.println(Format.justify('r', "NEW SALARY", 15));
        c.print(Format.justify('r', "----", 5));
        c.print(Format.justify('r', "----------", 14));
        c.print(Format.justify('r', "-----", 11));
        c.println(Format.justify('r', "----------", 15));
        for (int x=0; x<10; x++){
            c.print(Format.justify('r', x+1, 4));
            c.print(Format.justify('r', "$"+oldsal, 13));
            c.print(Format.justify('r', "$"+ raise, 13));
            c.println(Format.justify('r', "$"+newsal, 13));
            oldsal=newsal;
            newsal*=1.03;
            raise= newsal-oldsal;
                
        }
    }
    
}
