package com.ryan.factory.factorymethod;

import com.ryan.factory.ICourse;

public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();

        factory = new JavaCourceFactory();
        course = factory.create();
        course.record();
    }
}
