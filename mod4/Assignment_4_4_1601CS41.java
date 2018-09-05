import java.util.Scanner;

class Info{
    String addr;
    String Fname;
    String Lname;
    int age;
    Info(){
        this(19);
        
        System.out.printf("Name: %s %s Age: %d Address: %s\n",this.Fname,this.Lname,this.age,this.addr);
    }
    Info(String fn,String ln){
        
        this.Fname = fn;
        this.Lname = ln;
    }
    Info(String address){
        this("FName","LName");
        this.addr = address;
    }
    Info(int age){
        this("Address");
        this.age = age;
    }
}


class Main{
    Main(){
        Info mainInfo = new Info();
    }
}

public class Assignment_4_4_1601CS41 {
    public static void main(String [] args){
        Main m1 = new Main();
    }
}
