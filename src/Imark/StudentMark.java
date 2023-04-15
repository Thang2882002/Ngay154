/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Imark;
import java.util.Scanner;
/**
 *
 * @author dell
 */
public class StudentMark implements Imark{
    private String StuId;
    private String className;
    private String subjectName;
    private int semester;
    private float mark;

    public StudentMark(String StuId, String className, String subjectName, int semester, float mark) {
        this.StuId = StuId;
        this.className = className;
        this.subjectName = subjectName;
        this.semester = semester;
        this.mark = mark;
    }

    public StudentMark() {
    }

    public String getStuId() {
        return StuId;
    }

    public void setStuId(String StuId) {
        this.StuId = StuId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        StuId = sc.next();
        System.out.println("Nhap ten lop: ");
        className = sc.next();
        System.out.println("Nhap mon hoc: ");
        subjectName = sc.next();
        System.out.println("Nhap hoc ki: ");
        semester = sc.nextInt();
        System.out.println("Nhap diem: ");
        mark = sc.nextFloat();
    }
    public void display(){
        System.out.println("Ma sinh vien: "+StuId);
        System.out.println("Ten lop: "+className);
        System.out.println("Mon hoc: "+subjectName);
        System.out.println("Hoc ky: "+semester);
        System.out.println("Diem: "+mark);
    }
}
