package com.refactoring.projects.project03;

public class Manager {
	
    private static final int BONO_POR_EMPLEADO = 1000;
	private static final int MESES_DEL_ANIO = 12;
	private String nombre;
    private double salario;
    private String departamento;
    private int empleadosACargo;
    
    public void calcularSalarioAnual() {
        System.out.println(getSalario() * MESES_DEL_ANIO + calcularBono());
    }

	private int calcularBono() {
		return getEmpleadosACargo() * BONO_POR_EMPLEADO;
	}

	public int getEmpleadosACargo() {
		return empleadosACargo;
	}

	public void setEmpleadosACargo(int empleadosACargo) {
		this.empleadosACargo = empleadosACargo;
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
