package ejercicio1;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.TreeSet;

public class MainEjercicio1_c {

	public static void main(String[] args) {

		TreeSet<Empleado> treeEmpleados = new TreeSet<>();

		Empleado e1 = new Empleado("12345678", "Juan", "Pérez", LocalDate.of(1990, 5, 12),
                "Masculino", "Av. Siempre Viva 123", "1122334455", "juan.perez@email.com", "Desarrollador");

        Empleado e2 = new Empleado("87654321", "María", "Gómez", LocalDate.of(1995, 8, 24),
                "Femenino", "Calle Falsa 123", "1199887766", "maria.gomez@email.com", "Diseñadora");

        Empleado e3 = new Empleado("11223344", "Carlos", "López", LocalDate.of(1988, 11, 30),
                "Masculino", "Mitre 456", "1144556677", "carlos.lopez@email.com", "Analista");

        Empleado e4 = new Empleado("44332211", "Ana", "Martínez", LocalDate.of(2000, 1, 15),
                "Femenino", "Belgrano 789", "1133221100", "ana.martinez@email.com", "QA Tester");

        Empleado e5 = new Empleado("55667788", "Pedro", "Rodríguez", LocalDate.of(1992, 3, 10),
                "Masculino", "San Martín 101", "1166778899", "pedro.rodriguez@email.com", "Gerente de Proyecto");

        treeEmpleados.add(e1);
        treeEmpleados.add(e2);
        treeEmpleados.add(e3);
        treeEmpleados.add(e4);
        treeEmpleados.add(e5);

        Iterator<Empleado> it = treeEmpleados.iterator();

        while (it.hasNext())
        {
        	Empleado empleado = it.next();
        	System.out.println(empleado.toString());
        }

	}

}