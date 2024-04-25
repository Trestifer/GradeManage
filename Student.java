package qldiemhs;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class Student {
    private String name;
    private String studentId;
    private LocalDate dob;
    private String gender;
    private String address;
    private String phone;
    private String email;
    private String className;
    private String major;
    Scanner sc= new Scanner(System.in);
    public Student(String name, String studentId, String dob, String gender, String address, String phone, String email, String className, String major) {
        this.name = name;
        this.studentId = studentId;
        this.dob =  LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.className = className;
        this.major = major;
    }

    public Student() {
        this.dob=  LocalDate.parse("10/08/2005", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    void nhap(){
      System.out.print("Nhap Ma hoc sinh: ");
      studentId= sc.nextLine();
      System.out.print("Nhap ten: ");
      name= sc.nextLine();
      System.out.print("Nhap ngay sinh: ");
      String ngaysinh = sc.nextLine();
        try {
            dob = LocalDate.parse(ngaysinh, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (DateTimeParseException e) {
            System.err.println("Ngày sản xuất không hợp lệ: " + e.getMessage());
            ngaysinh=sc.nextLine();
        }
      System.out.print("Nhap gioi tinh: ");
      gender=sc.nextLine();
      System.out.print("Nhap dia chi");
      address=sc.nextLine();
      System.out.print("Nhap so dien thoai: ");
      phone=sc.nextLine();
      System.out.print("Nhap email: ");
      email= sc.nextLine();
      System.out.print("Nhap lop: ");
      className= sc.nextLine();
      System.out.print("Nhap  nganh: ");
      major= sc.nextLine();
 
    }
    void xuat(){
        Sýtem.out.print
    }
    

}
