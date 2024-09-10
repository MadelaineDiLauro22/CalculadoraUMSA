# CalculadoraUMSA - Calculadora Casio

## Descripción

**Calculadora Casio** es una aplicación de consola desarrollada en **Java** utilizando el patrón de diseño **MVC** (Modelo-Vista-Controlador). Esta calculadora realiza operaciones aritméticas básicas como suma, resta, multiplicación, división, potencia y radicación, proporcionando una forma sencilla y eficiente de calcular directamente desde la terminal. El proyecto está diseñado para ser ejecutado en el **IDE Eclipse**.

## Estructura del Proyecto

El proyecto está organizado en tres paquetes principales, cada uno siguiendo el patrón MVC:

- **`modelo`**: Contiene la clase `Calculadora`, que implementa la lógica de las operaciones aritméticas (sumar, restar, multiplicar, dividir, etc.).
- **`vista`**: Contiene la clase `CalculadoraView`, que gestiona la interacción con el usuario, manejando la entrada de datos y mostrando los resultados.
- **`controlador`**: Contiene la clase `CalculadoraController`, que funciona como un intermediario entre el modelo y la vista, controlando el flujo de datos y acciones.

## Requisitos

- **JDK 8** o superior.
- **Eclipse IDE** (puedes descargarlo desde [Eclipse IDE](https://www.eclipse.org/downloads/)).

## Instalación y Ejecución

### Paso 1: Clonar el repositorio

Abre una terminal y ejecuta el siguiente comando para clonar el proyecto en tu máquina local:

```bash
git clone https://github.com/MadelaineDiLauro22/CalculadoraUMSA.git
```

### Paso 2: Importar el proyecto en Eclipse

1. Abre **Eclipse**.
2. En la barra de menú, selecciona **File** > **Import**.
3. En el menú de importación, selecciona **Existing Projects into Workspace** y haz clic en **Next**.
4. Navega a la carpeta donde clonaste el repositorio y selecciona el directorio raíz del proyecto.
5. Haz clic en **Finish** para importar el proyecto.

### Paso 3: Ejecutar la aplicación

1. En el **Explorador de Proyectos** de Eclipse, navega hasta el paquete **`controlador`**.
2. Haz clic derecho sobre la clase `CalculadoraController` y selecciona **Run As** > **Java Application**.
3. La aplicación se ejecutará en la consola de Eclipse, donde podrás realizar las operaciones aritméticas que desees.

## Funcionalidades

- **Suma**: Permite sumar dos o más números.
- **Resta**: Resta uno o más números.
- **Multiplicación**: Multiplica dos o más números.
- **División**: Divide dos números, con manejo de división por cero.
- **Potencia**: Calcula el resultado de un número elevado a una potencia.
- **Radicación**: Calcula la raíz de un número.

## Contribuciones

Si deseas contribuir a este proyecto, puedes hacerlo siguiendo estos pasos:

1. Haz un **fork** del repositorio.
2. Crea una nueva rama para tu contribución: `git checkout -b mi-nueva-funcionalidad`.
3. Realiza tus cambios y **haz commit** de ellos: `git commit -m "Agregar nueva funcionalidad"`.
4. Envía los cambios a tu repositorio: `git push origin mi-nueva-funcionalidad`.
5. Abre un **pull request** en GitHub para que tus cambios sean revisados.
