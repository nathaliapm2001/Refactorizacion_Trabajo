package com.refactoring.projects.project03;

/**
 * Representa a un empleado con rol de Manager. Incluye el cálculo de bonos por
 * empleados a cargo.
 * 
 * @author Nathalia Piñera Molina
 * @version 1.0
 * @see Employee
 * 
 */

public class Manager {
	/** Bono adicional que se recibe por cada empleado */
	private static final int BONO_POR_EMPLEADO = 1000;

	/** Meses totales para el cálculo del salario anual. */
	private static final int MESES_DEL_ANIO = 12;

	private String nombre;
	private double salario;
	private String departamento;
	private int empleadosACargo;

	/**
	 * Calcula el salario anual total del manager. Suma el salario base multiplicado
	 * por los meses del año más el bono acumulado.
	 * 
	 * @return El salario anual total incluyendo bonificaciones.
	 */
	public double calcularSalarioAnual() {
		return getSalario() * MESES_DEL_ANIO + calcularBono();
	}

	/**
	 * Método privado que calcula el bono total. Multiplica la cantidad de empleados
	 * a cargo por la constante de bono.
	 * 
	 * @return El monto total del bono por gestión.
	 */
	private int calcularBono() {
		return getEmpleadosACargo() * BONO_POR_EMPLEADO;
	}

	/**
	 * Obtiene la cantidad de empleados que el manager tiene a su cargo.
	 * 
	 * @return Número de empleados.
	 */
	public int getEmpleadosACargo() {
		return empleadosACargo;
	}

	/**
	 * Establece el número de empleados a cargo para el cálculo de bonos.
	 * 
	 * @param empleadosACargo Cantidad de personas bajo su mando.
	 */
	public void setEmpleadosACargo(int empleadosACargo) {
		this.empleadosACargo = empleadosACargo;
	}

	/**
	 * Obtiene el departamento al que pertenece el Manager.
	 * 
	 * @return Cadena de texto con el nombre del departamento.
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * Asigna el departamento al manager.
	 * 
	 * @param departamento Nombre del departamento a establecer.
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	/**
	 * Obtiene el salario base mensual del manager.
	 * 
	 * @return El salario base en valor double.
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * Establece o actualiza el salario base mensual del manager.
	 * 
	 * @param salario El nuevo monto del salario base a establecer.
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * Devuelve el nombre del Manager.
	 * 
	 * @return Cadena de texto con el nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna un nombre al Manager.
	 * 
	 * @param nombre El nombre completo a establecer.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
