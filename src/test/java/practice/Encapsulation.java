package practice;

import org.testng.annotations.Test;

public class Encapsulation {
    private int value;
    @Test
    public void setmethod(int value){
         this.value=value;
    }

    @Test
    public int getmethod(){
         return value;
    }

    public static void main(String[] args) {
        Encapsulation E = new Encapsulation();
        E.setmethod(123);
        System.out.println(E.getmethod());


    }
}
