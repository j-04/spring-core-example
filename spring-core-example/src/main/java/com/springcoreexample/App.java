package com.springcoreexample;

import com.springcoreexample.pojos.Car;
import com.springcoreexample.pojos.TestCarImpl;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("springcontext.xml");
        AbstractApplicationContext context2 = new ClassPathXmlApplicationContext("springcontext2.xml");

        Car carAutowireByName = (TestCarImpl) context1.getBean("carAutowireByName");
        printCar(carAutowireByName);

        Car carAutowireByType = (TestCarImpl) context2.getBean("carAutowireByType");
        printCar(carAutowireByType);

        Car carSetterInjection = (TestCarImpl) context1.getBean("carSetterInjection");
        printCar(carSetterInjection);

        Car carConstructorInjection = (TestCarImpl) context1.getBean("carConstructorInjection");
        printCar(carConstructorInjection);

        Car carLifeCycle = context1.getBean("carLifeCycle", TestCarImpl.class);
        printCar(carLifeCycle);

//        context1.close();

        if (context1.isActive()) {
            Car carSingleton1 = (TestCarImpl) context1.getBean("carSingleton");
            Car carSingleton2 = (TestCarImpl) context1.getBean("carSingleton");
            System.out.println("Compare of two beans");
            if (carSingleton1 == carSingleton2) {
                System.out.println("References of two variables are equal. It means that two variables are referencing to the same object.");
            }

            Car carPrototype1 = (TestCarImpl) context1.getBean("carPrototype");
            Car carPrototype2 = (TestCarImpl) context1.getBean("carPrototype");
            System.out.println("Compare of two beans");
            if (carPrototype1 != carPrototype2) {
                System.out.println("References of two variables are not equal. It means that two variables are referencing to two different objects.");
            }
        }



        System.out.println("The activity of context1 is " + context1.isActive());
    }

    public static void printCar(Car car) {
        System.out.println("--------------------------------------------");
        System.out.println(car.getCarName());
        System.out.println(car.getEngine().getEngineName());
        System.out.println(car.getFrontRightWheel().getWheelName());
        System.out.println(car.getFrontLeftWheel().getWheelName());
        System.out.println(car.getRearRightWheel().getWheelName());
        System.out.println(car.getRearLeftWheel().getWheelName());
        System.out.println("--------------------------------------------");
    }
}
