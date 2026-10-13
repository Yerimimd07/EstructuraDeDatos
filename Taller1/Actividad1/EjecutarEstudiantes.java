public class EjecutarEstudiantes {

    public static void main(String[] args) {

        // agregar los estudiantes
        Estudiantes est01 = new Estudiantes(1010, "Juan Pérez", "Psicología", 4.2);
        Estudiantes est02 = new Estudiantes(1011, "María Gómez", "Ingeniería de Sistemas", 3.5);
        Estudiantes est03 = new Estudiantes(1012, "Carlos Rodríguez", "Administración de Empresas", 3.8);
        Estudiantes est04 = new Estudiantes(1013, "Ana Martínez", "Psicología", 4.0);
        Estudiantes est05 = new Estudiantes(1014, "Luis López", "Ingeniería de Sistemas", 3.5);
        Estudiantes est06 = new Estudiantes(1015, "Sofía Torres", "Administración de Empresas", 4.7);
        Estudiantes est07 = new Estudiantes(1016, "Andrés Ramírez", "Psicología", 3.9);
        Estudiantes est08 = new Estudiantes(1017, "Lucía Díaz", "Ingeniería de Sistemas", 3.3);
        Estudiantes est09 = new Estudiantes(1018, "Mateo Vargas", "Administración de Empresas", 3.6);
        Estudiantes est10 = new Estudiantes(1019, "Valentina Castro", "Psicología", 4.6);

        // arreglo de objetos
        Estudiantes[] e = new Estudiantes[10];
        e[0] = est01;
        e[1] = est02;
        e[2] = est03;
        e[3] = est04;
        e[4] = est05;
        e[5] = est06;
        e[6] = est07;
        e[7] = est08;
        e[8] = est09;
        e[9] = est10;

        // listar estudiantes
        Estudiantes.listarEstudiantes(e);

        // Buscar un estudiante
        Estudiantes encontrado = Estudiantes.buscarEstudiante(e, 1019);
        if (encontrado != null) {
            System.out.println("El estudiante buscado es: " + encontrado);

        } else {
            System.out.println("Estudiante no registrado");
        }
        // Estudiantes con promedio igual o superior a 4.0
        est01.mostrarPromedio(e);

    }

}
