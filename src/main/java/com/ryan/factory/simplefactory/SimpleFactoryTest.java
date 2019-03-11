package com.ryan.factory.simplefactory;

import com.ryan.factory.ICourse;
import com.ryan.factory.PythonCourse;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
//        ICourse course = factory.createByName("java");
//        ICourse course = factory.createByClassName("com.ryan.factory.JavaCourse");
        ICourse course = factory.createByClass(PythonCourse.class);
        course.record();
    }
}
