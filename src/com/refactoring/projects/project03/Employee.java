package com.refactoring.projects.project03;

/**
 * Clase que representa a un empleado base en el sistema. Contiene la
 * informacion basica y el calculo de salario estándar.
 * 
 * @author Nathalia Piñera Molina
 * @version 1.0
 * @see Manager
 */
public class Employee {
	/** Numero de meses que componen el periodo de calculo anual. */
	private static final int MESES_DEL_ANIO = 12;
	private String nombre;
	private double salario;
	private String departamento;

	/**
	 * Calcula el salario total que el empleado percibe en un año.
	 * 
	 * @return El salario base multiplicado por los meses del año.
	 */
	public double calcularSalarioAnual() {
		return getSalario() * MESES_DEL_ANIO;
	}

	/**
	 * Obtiene el departamento al que pertenece el empleado.
	 * 
	 * @return Cadena de texto con el nombre del departamento.
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * Asigna el departamento al empleado.
	 * 
	 * @param departamento Nombre del departamento a establecer.
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	/**
	 * Obtiene el salario base mensual del empleado.
	 * 
	 * @return El salario base en valor double.
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * Establece o actualiza el salario base mensual del empleado.
	 * 
	 * @param salario El nuevo monto del salario base a establecer.
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * Devuelve el nombre del empleado.
	 * 
	 * @return Cadena de texto con el nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna un nombre al empleado.
	 * 
	 * @param nombre El nombre completo a establecer.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
