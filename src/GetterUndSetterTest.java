import java.util.Scanner;
public class GetterUndSetterTest {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        StringClass a = new StringClass ();
        StringClass b = new StringClass ();
        StringClass c = new StringClass ();
        System.out.println("Was wollen Sie in a schreiben?");
        a.setString(sc.nextLine());
        System.out.println("Was wollen Sie in b schreiben?");
        b.setString(sc.nextLine());
        System.out.println("Was wollen Sie in c schreiben?");
        c.setString(sc.nextLine());
        System.out.println("Was Sie in a geschrieben ist "+a.getString()+" .");
        System.out.println("Was Sie in b geschrieben ist "+b.getString()+" .");
        System.out.println("Was Sie in c geschrieben ist "+c.getString()+" .");
    }
}

class StringClass{
    private String string;
    //Getter
    public String getString(){
        return string;
    }

    public void setString(String s) {
        this.string = s;
    }
}
