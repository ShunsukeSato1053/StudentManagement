package raisetech.StudentManagement;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Students {
    private int id;
    private String name;
    private List<StudentsCourses> studentCourses;
    private  int courseCount;

}
