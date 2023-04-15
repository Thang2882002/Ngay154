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
public class StudentMarkTotal extends StudentMark{
    private int totalExamSubject;
    private float everageMark;

    public StudentMarkTotal() {
    }

    public StudentMarkTotal( String StuId, String className, String subjectName, int semester, float mark,int totalExamSubject, float everageMark) {
        super(StuId, className, subjectName, semester, mark);
        this.totalExamSubject = totalExamSubject;
        this.everageMark = everageMark;
    }

    public int getTotalExamSubject() {
        return totalExamSubject;
    }

    public void setTotalExamSubject(int totalExamSubject) {
        this.totalExamSubject = totalExamSubject;
    }

    public float getEverageMark() {
        return everageMark;
    }

    public void setEverageMark(float everageMark) {
        this.everageMark = everageMark;
    }
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tong de thi: ");
        totalExamSubject = sc.nextInt();
        System.out.println("Nhap diem trung binh: ");
        everageMark = sc.nextFloat();
        
    }
    public void display(){
        super.display();
        System.out.println("Tong de thi: "+totalExamSubject);
        System.out.println("Diem trung binh: "+everageMark);
    }
    public int getTotalExamSubject(StudentMarkTotal[] list){
        return list.length;
    }
    public void calculateEverageMark(StudentMarkTotal[] list){
        for(int i=0;i<list.length;i++){
            everageMark+=list[i].getMark();
        }
    }
}
