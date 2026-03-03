package com.refactoring.projects.project03;

public class Employee {
	
    private static final int MESES_DEL_ANIO = 12;
	private String nombre;
    private double salario;
    private String departamento;
    
    public double calcularSalarioAnual() {
        return getSalario() * MESES_DEL_ANIO;
    }

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
