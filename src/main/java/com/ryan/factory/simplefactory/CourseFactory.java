package com.ryan.factory.simplefactory;


import com.ryan.factory.ICourse;
import com.ryan.factory.JavaCourse;
import com.ryan.factory.PythonCourse;

public class CourseFactory {
    public ICourse createByName(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        }else if ("python".equals(name)){
            return new PythonCourse();
        }else {
            return null;
        }
    }

    public ICourse createByClassName(String className) {
        if(!(null == className || "".equals(className))) {
            try {
                return (ICourse)Class.forName(className).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public ICourse createByClass(Class<? extends ICourse> clazz) {
        try{
            if(null != clazz) {
                return clazz.newInstance();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
