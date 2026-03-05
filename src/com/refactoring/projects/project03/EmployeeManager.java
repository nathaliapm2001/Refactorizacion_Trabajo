package com.refactoring.projects.project03;

/**
 * Clase principa.Se encarga de la instanciación de objetos y la impresion de
 * resultados.
 * 
 * @author Nathalia Piñera Molina
 * @version 1.0
 * @see Employee
 * @see Manager
 */

public class EmployeeManager {

	/**
	 * Punto de entrada de la aplicación.
	 * 
	 * @param args Argumentos de la línea de comandos (no utilizados).
	 */

	public static void main(String[] args) {
		// 1. Creamos un Empleado
		Employee emp = new Employee();
		emp.setNombre("Juan Pérez");
		emp.setSalario(2000.0);
		emp.setDepartamento("Ventas");

		// 2. Creamos un Manager
		Manager mgr = new Manager();
		mgr.setNombre("Ana López");
		mgr.setSalario(3500.0);
		mgr.setDepartamento("IT");
		mgr.setEmpleadosACargo(5);

		// 3. Imprimimos los resultados (Única clase con System.out)
		System.out.println("--- DATOS DE EMPLEADOS ---");
		imprimirDatos(emp.getNombre(), emp.calcularSalarioAnual());
		imprimirDatos(mgr.getNombre(), mgr.calcularSalarioAnual());
	}

	/**
	 * Método auxiliar. Muestra de forma formateada el nombre y el salario anual
	 * calculado.
	 * 
	 * @param nombre El nombre completo del empleado o manager.
	 * @param salarioAnual El valor numérico del salario total.
	 */

	private static void imprimirDatos(String nombre, double salarioAnual) {
		System.out.println("Empleado: " + nombre + " | Salario Anual: " + salarioAnual + "€");
	}
}
