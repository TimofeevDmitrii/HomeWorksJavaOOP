package Seminar6hw.Controller;

import Seminar6hw.Service.UserService;
import Seminar6hw.View.StudGroupView;
import Seminar6hw.Data.*;
import Seminar6hw.Service.StudentGroupService;
import Seminar6hw.Service.StudentService;
import Seminar6hw.Service.TeacherService;
import Seminar6hw.View.UserView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    protected CountNextId nextIdCounter;

    protected UserService <Student> studentService = new StudentService();
    protected UserService <Teacher> teacherService = new TeacherService();
    protected StudentGroupService studentGroupService = new StudentGroupService();

    protected StudGroupView studGroupView = new StudGroupView();
    protected UserView<Student> studentView;
    protected UserView<Teacher> teacherView;

    protected List<User> allUsers = new ArrayList<>();

    protected List<StudentGroup> allStudentGroups = new ArrayList<>();

    public Controller(CountNextId nextIdCounter, UserView<Student> studentView, UserView<Teacher> teacherView) {
        this.nextIdCounter = nextIdCounter;
        this.studentView = studentView;
        this.teacherView = teacherView;
    }

    public void createStudent(String firstName, String secondName, String lastName){
        int nextStudentId = nextIdCounter.countNextStudentId(allUsers);
        Student student =studentService.create(firstName, secondName, lastName, nextStudentId);
        checkUser(student);
        allUsers.add(student);
    }

    public void createTeacher(String firstName, String secondName, String lastName){
        int nextTeacherId = nextIdCounter.countNextTeacherId(allUsers);
        Teacher teacher = teacherService.create(firstName, secondName, lastName, nextTeacherId);
        checkUser(teacher);
        allUsers.add(teacher);
    }

    protected void checkUser(User userForCheck){
        UserComparator<User> userComparator = new UserComparator<>();
        for (User user: allUsers){
            if (userComparator.compare(user, userForCheck)==0) {
                System.out.println("Внимание, в системе уже есть пользователь с таким ФИО");
                System.out.println(userForCheck);
                break;
            }
        }
    }

    public List<User> getAllUsers(){
        return allUsers;
    }

    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        for (User user: allUsers){
            if (user instanceof Student)
                students.add((Student) user);
        }
        return students;
    }

//    public void isStudyDay(Student student, LocalDateTime localDateTime){
//        System.out.println(student.isStudyDay(localDateTime));
//    }

    public void isStudyDayForStudent(Student student, LocalDateTime inputDate){
        studentService.checkTheDayStatus(student, inputDate);
    }

    public void isWorkDayForTeacher(Teacher teacher, LocalDateTime inputDate){
        teacherService.checkTheDayStatus(teacher, inputDate);
    }

    public List<Teacher> getAllTeachers(){
        List<Teacher> teachers = new ArrayList<>();
        for (User user: allUsers){
            if (user instanceof Teacher)
                teachers.add((Teacher) user);
        }
        return teachers;
    }

    public void printAllStudents(){
        for (User user: allUsers){
            if (user instanceof Student)
                studentView.sendOnConsole((Student) user);
        }
    }

    public void printAllTeachers(){
        for (User user: allUsers){
            if (user instanceof Teacher)
                teacherView.sendOnConsole((Teacher) user);
        }
    }


    public void createStudentGroup(Teacher teacher, List<Student> groupList, int groupNumber){
        StudentGroup studentGroup = studentGroupService.createStudentGroup(teacher, groupList, groupNumber);
        allStudentGroups.add(studentGroup);
    }

    public List<StudentGroup> getAllStudentGroups(){ return allStudentGroups;}

    public void removeStudentByFIO(StudentGroup studentGroup, String firstName, String secondName, String lastName) {
        studentGroupService.removeStudentByFIO(studentGroup,firstName, secondName, lastName);
    }

    public List<Student> getSortedGroupByID(StudentGroup studentGroup){
        return studentGroupService.getSortedGroupListByID(studentGroup);
    }

    public List<Student> getSortedGroupByFIO(StudentGroup studentGroup){
        return studentGroupService.getSortedGroupListByFIO(studentGroup);
    }

    public void printStudentGroup(StudentGroup studentGroup){
        studGroupView.printOnConsole(studentGroup);
    }



}
