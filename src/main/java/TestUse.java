import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class TestUse {
    public static void start(Class<?> Tests){


        final int MIN_P = 1;
        final int MAX_P = 10;
        Map<Integer, Method> map = new TreeMap<>();


        for (Method method: Tests.getDeclaredMethods()) {
            if(method.getAnnotation(BeforeSuite.class) != null){
                map.put(MIN_P - 1, method);

            }
            if(method.getAnnotation(AfterSuite.class) != null){
                map.put(MAX_P + 1, method);

            }
            if(method.getAnnotation(Test.class) != null){
                Test test = method.getAnnotation(Test.class);
                map.put(test.priority(),method);

            }

        }

        try {
            Object testObj = Tests.newInstance();
            for (Integer key : map.keySet()) {
                map.get(key).invoke(testObj);
            }
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}
