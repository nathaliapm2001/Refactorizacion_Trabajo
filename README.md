# Refactorizacion Trabajo - Proyecto 03

Este repositorio contiene la refactorización **Proyecto 03 (Gestión de Empleados)**, realizada para la asignatura de Entornos de Desarrollo.
 
## 👥 Miembros del grupo.
**Nathalia Piñera Molina**

## 🛠️ Tarea.
1. **Gestión de Git y Flujo de Trabajo:** (Configuración de ramas `master`, `develop` y `feature`, protección de rama y resolución de conflictos).
2. **Implementación de Refactorizaciones:** (Aplicación de patrones desde el IDE).
3. **Elaboración de Memoria y README:** (Justificación técnica y documentación del proceso).

## 🚀 Refactorizaciones Aplicadas
Se han implementado las siguientes mejoras siguiendo el flujo de ramas `feature/`:

1. **Encapsulación de Campos (Encapsulate Field):** Cambio de modificadores de acceso a `private` en atributos de `Employee` y `Manager` para asegurar la integridad de los datos.
2. **Sustitución de Números Mágicos (Extract Constant):** Creación de constantes `MESES_DEL_ANIO` y `BONO_POR_EMPLEADO` para mejorar la legibilidad.
3. **Extracción de métodos (Extract method):** Extracción para crear un nuevo método independiente llamado `calcularBono()`.
4. **Principio de Responsabilidad Única (SRP):** Extracción de la lógica de impresión a la clase `EmployeeManager`, desacoplando la lógica de negocio de la interfaz de salida.

## 📈 Flujo de Trabajo en Git
**`master`**: Rama protegida que contiene el código estable final.
* **`develop`**: Rama principal de desarrollo donde se integran las funcionalidades.
* **`feature/`**: Ramas temporales para cada refactorización específica (ej. `feature/numeros-magicos`).


## 📚 Documentación
La documentación técnica del proyecto ha sido generada con Javadoc y se puede consultar en la carpeta del repositorio:
* [Ver Javadoc (Index)](./doc/index.html)


## 🌐 Documentación Online
Puedes consultar la documentación técnica interactiva aquí:
👉 [Ver Javadoc en la Web](https://nathaliapm2001.github.io/Refactorizacion_Trabajo/index.html)



