package com.ryan.factory.factorymethod;

import com.ryan.factory.ICourse;
import com.ryan.factory.JavaCourse;

public class JavaCourceFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
