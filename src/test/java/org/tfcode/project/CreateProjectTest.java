package org.tfcode.project;


import static org.junit.Assert.*;

import org.junit.Test;

public class CreateProjectTest {
    @Test
    public void canConstructCreateProject() {
        CreateProject app = new CreateProject();
        System.out.println("Test ......................");
        assertEquals(app.getClass().toString(),CreateProject.class.toString());
    }
}
