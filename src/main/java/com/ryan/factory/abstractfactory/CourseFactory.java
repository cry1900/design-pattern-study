package com.ryan.factory.abstractfactory;

public interface CourseFactory {
    INote createNote();

    IVideo createVideo();
}
