package Reflection;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException {
        Class<?> targetClass = Class.forName("Reflection.TargetObject");
        TargetObject targetObject = (TargetObject) targetClass.newInstance();

        Method[] methods = targetClass.getDeclaredMethods();
        for(Method method:methods){
            System.out.println(method.getName());
        }

        Method privateMethod = targetClass.getDeclaredMethod("privateMethod",String.class);
    }
}
