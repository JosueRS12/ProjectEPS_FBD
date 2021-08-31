# ProjectEPS_FBD
Apliación de escritorio de una Eps, en la cual se pueden registrar pacientes, eliminar paciente, asignar cita, crear agenda..., es decir, todas las operaciones CRUD.
Proyecto realizado para la materia Fundamentos de Bases de Datos.

## Para su ejecución.
### Pre-requisitos:
1. Tener instalado los servicios de PostgreSql.
2. Tener instalado algun IDE de java, tales como:
  - NetBeans.
  - IntelliJ.
  - Eclipse.
3. Instalar los controladores JDBC de PostgreSql.
3. Correr el servicio en PostgreSql y crear un usuario y contraseña.

Una vez cumplidos los pre-requisitos.
1. En la interfaz de PostgreSql:
  - Correr los scripts que se encuentran en el directorio `/Scripts`.
    - Correr el script `Citas.sql`
    - Correr el script `llenado.sql` 
2. Clonar el repo: `git clone https://github.com/JosueRS12/ProjectEPS_FBD.git`
3. Abrir el proyecto con un IDE.
  - Dirigirse al siguiente directorio `/src/Conexion/` y abrir el archivo `Conexion.java`
  - Dentro `Conexion.java` cambiar los siguientes valores:
    ```
    final String DB_URL = "[direccion_de_interfaz_de_servicio_postresql]";
    final String USER = "[nombre_usuario]";
    final String PASS = "[pasword]";
    ```
4. Correr el archivo `EPS` como main.
