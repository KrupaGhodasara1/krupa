package practice;

import org.testng.annotations.Test;

public class methodOverridding {

    public void test1(int a){
        System.out.println("heyyyy1");
    }

    public void test2(){
        System.out.println("heyyyy2");
    }

    public static class methodoverridding2 extends methodOverridding{

    public void test3(){
            System.out.println("heyyyy3");
        }
        public static void main(String[] args) {
            methodoverridding2 obj1 = new methodoverridding2();
            obj1.test1(2);
            obj1.test3();
        }
    }
}
