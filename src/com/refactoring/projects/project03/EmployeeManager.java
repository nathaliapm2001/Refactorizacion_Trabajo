package com.refactoring.projects.project03;

public class EmployeeManager {

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

    
    
    // Método auxiliar para evitar repetir código de impresión
    private static void imprimirDatos(String nombre, double salarioAnual) {
        System.out.println("Empleado: " + nombre + " | Salario Anual: " + salarioAnual + "€");
    }
}
