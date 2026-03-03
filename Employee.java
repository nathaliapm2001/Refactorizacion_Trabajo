package com.refactoring.projects.project03;

public class Employee {
	
    public String nombre;
    public double salario;
    public String departamento;
    
    public void calcularSalarioAnual() {
        System.out.println(salario * 12);
    }
}
