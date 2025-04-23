package com._static;

public class Employee {

    private int employeeId;
    private String name;
    private String department;

    // 생성자
    public Employee(String name) {
        this.name = name;
        // 클래스 변수 활용 -> Company.empSerialNumber;
        // 클래스 이름으로 접근할 수 있다.
        employeeId = Company.empSerialNumber;
        Company.empSerialNumber++;
    }

    // getter
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}
