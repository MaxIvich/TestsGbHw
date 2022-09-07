




public class Tests {


    @Test(priority = 9)
    void method1(){
        System.out.println("Метод 1");
    }

    @Test(priority = 3)
    void method2(){
        System.out.println("Метод 2");
    }
    @Test(priority = 5)
    void method3(){
        System.out.println("Метод 3");
    }

    @AfterSuite
    void method4() {
        System.out.println("Метод 4 @AfterSuite");

    }

    @BeforeSuite
    void method5(){
        System.out.println("Метод 5  @BeforeSuite");

    }
}
