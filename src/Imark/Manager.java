/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Imark;
import com.sun.source.tree.IfTree;
import java.util.Scanner;
/**
 *
 * @author dell
 */
public class Manager {
    public static void menu(){
        System.out.println("1.Nhap thong tin n sinh vien Aptech");
        System.out.println("2.Nhap m diem thi cho cac sinh vien nay");
        System.out.println("3.Sap xep sinh vien theo ten va hien thi");
        System.out.println("4.Tim thong tin diem thi theo id cua sinh vien");
        System.out.println("5.Exit");
    }
    public static void main(String[] args) {
        int n=0;
        StudentAptech[] std = null;
        StudentMark[] stdmark =null;
        do{
            Scanner sc = new Scanner(System.in);
            menu();
            System.out.println("Nhap vao lua chon cua ban: ");
            n=sc.nextInt();
            switch (n) {
                case 1:{
                    int m =0;
                    System.out.println("Nhap vao so sinh vien Aptech: ");
                    m=sc.nextInt();
                    std = new StudentAptech[m];
                    for(int i=0;i<m;i++){
                        std[i] = new StudentAptech();
                        int dem =0;
                        do{
                            System.out.println("Nhap thong tin sinh vien thu: "+(i+1));
                            std[i].input();
                            dem =0;
                            for(int j=0;j<i;j++){
                                if(std[i].getStuId().equals(std[j].getStuId()) && std !=null){
                                    System.out.println("Vui long nhap lai vi id trung");
                                    dem++;
                                }
                            }
                            
                        }while(dem!=0);
                    }
                }
                    
                    break;
                case 2:{
                    if(std!=null){
                        int k=0;
                        System.out.println("Nhap vao so sinh vien: ");
                        k= sc.nextInt();
                        stdmark = new StudentMark[k];
                        for(int i =0;i<stdmark.length;i++){
                            stdmark[i] = new StudentMark();
                            int dem =0;
                            do{
                                System.out.println("Nhap thong tin mon hoc thu: "+(i+1));
                                stdmark[i].input();
                                dem =0;
                                for(int j=0;j<i;j++){
                                    if(stdmark[i].getStuId().equals(std[j].getStuId())==false){
                                        System.out.println("Ma id sinh vien chua co can nhap lai");
                                        dem++;
                                    }
                                }
                            }while(dem!=0);
                        }
                    }else{
                        System.out.println("Ban chua nhap thong tin sinh vien");
                    }
                    break;
                }
                case 3:{
                    if(std==null){
                        System.out.println("Ban chua nhap du lieu sinh vien");
                    }else{
                        for(int i=0;i<std.length-1;i++){
                            for(int j=i+1;j<std.length;j++){
                                if(std[i].getStuName().compareTo(std[j].getStuName())>0){
                                    StudentAptech temp = std[i];
                                    std[i] = std[j];
                                    std[j]=temp;
                                }
                            }
                        }
                        System.out.println("Hien thi sau khi sap xep");
                        for(int i=0;i<std.length;i++){
                            System.out.println("Hien thi thong tin sinh vien thu");
                            std[i].display();
                        }
                    }
                    break;
                }
                case 4:{
                    if(std == null || stdmark == null){
                    System.out.println("Ban chua nhap du lieu");
                }else{
                        String id;
                        System.out.println("Nhap thong tin id ban can tim: ");
                        id = sc.next();
                        System.out.println("Thong tin sinh vien");
                        for(int i=0;i<std.length;i++){
                            if(id.equals(std[i].getStuId())){
                                std[i].display();
                            }
                        }
                        System.out.println("Voi cac diem");
                        for(int i=0;i<stdmark.length;i++){
                            if(id.equals(stdmark[i].getStuId())){
                                stdmark[i].display();
                            }
                        }
                        }
                    break;
                }
                case 5:
                    break;
                default:
                    System.out.println("Khong co lua chon cua ban moi ban nhap lai");
            }
            
        }while(n!=5);
    }
}
