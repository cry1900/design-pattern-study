package com.ryan.factory.factorymethod;

import com.ryan.factory.ICourse;
import com.ryan.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new PythonCourse();
    }
}
