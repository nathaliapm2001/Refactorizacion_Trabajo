package com.refactoring.projects.project03;

public class Manager {
	
    public String nombre;
    public double salario;
    public String departamento;
    public int empleadosACargo;
    
    public void calcularSalarioAnual() {
        System.out.println(salario * 12 + empleadosACargo * 1000);
    }
}
