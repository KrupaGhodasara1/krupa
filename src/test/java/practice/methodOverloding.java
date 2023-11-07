package practice;

import org.testng.annotations.Test;

public class methodOverloding {
    @Test
    public  void test(){
        System.out.println("method 1");
    }
@Test
    public void test(String a){
        System.out.println("method 2");
    }
    public static void main(String[] args) {
        methodOverloding obj = new methodOverloding();
        obj.test("yy");
        obj.test();

    }
}
