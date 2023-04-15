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
public class StudentAptech implements Imark{
    private String StuId;
    private String StuName;
    private String gender;
    private String birthday;
    private String nativePlace;

    public StudentAptech(String StuId, String StuName, String gender, String birthday, String nativePlace) {
        this.StuId = StuId;
        this.StuName = StuName;
        this.gender = gender;
        this.birthday = birthday;
        this.nativePlace = nativePlace;
    }

    public StudentAptech() {
    }

    public String getStuId() {
        return StuId;
    }

    public void setStuId(String StuId) {
        this.StuId = StuId;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String StuName) {
        this.StuName = StuName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        StuId = sc.next();
        System.out.println("Nhap ten sinh vien: ");
        StuName = sc.next();
        System.out.println("Nhap gioi tinh sinh vien: ");
        gender = sc.next();
        System.out.println("Nhap ngay sinh: ");
        birthday = sc.next();
        System.out.println("Nhap que quan: ");
        nativePlace = sc.next();
    }
    public void display(){
        System.out.println("Ma sinh vien: "+StuId);
        System.out.println("Ten sinh vien: "+StuName);
        System.out.println("Gioi tinh sinh vien: "+gender);
        System.out.println("Ngay sinh: "+birthday);
        System.out.println("Que quan: "+nativePlace);
    }
}
