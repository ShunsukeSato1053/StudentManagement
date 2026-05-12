package raisetech.StudentManagement;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentRepository {

    @Select("SELECT id, name FROM students;")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "studentCourses", column = "id",
                    many = @Many(select = "selectCoursesByStudentId"))
    })
    List<Students> select();

    @Select("SELECT c.course_name FROM students_courses sc JOIN courses c ON c.id = sc.course_id WHERE sc.students_id = #{studentId};")
    List<StudentsCourses> selectCoursesByStudentId(int studentId);

}
