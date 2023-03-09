package empladoClase;

public class empleados {

	public static void main(String[] args) {

		Empleado empleados[]= {new Empleado(45, "a"), new Empleado(20,"d"), new Empleado(32, "b"), new Empleado(10, "c"), new Empleado(51, "z")};

		ordenarId(empleados);
		
		for(int i=0; i<empleados.length; i++) {
			System.out.println(empleados[i]);
		}
		System.out.println("*******************");
		ordenarNombre(empleados);
		
		for(int i=0; i<empleados.length; i++) {
			System.out.println(empleados[i]);
		}
		System.out.println("*******************");
		ordenarIdNombre(empleados);
		
		for(int i=0; i<empleados.length; i++) {
			System.out.println(empleados[i]);
		}
	}
	static void ordenarId(Empleado empleados[]) {
		for(int i=0; i<empleados.length; i++) {
			Empleado c=null;
			for(int j=i+1; j<empleados.length; j++) {
				if(empleados[i].getId()>empleados[j].getId()) {
					c=empleados[i];
					empleados[i]=empleados[j];
					empleados[j]=c;
				}
			}
		}
	}
	
	static void ordenarNombre(Empleado empleados[]) {
		for(int i=0; i<empleados.length; i++) {
			Empleado c=null;
			for(int j=i+1; j<empleados.length; j++) {
				if(empleados[i].getNombre().compareTo(empleados[j].getNombre())>1) {
					c=empleados[i];
					empleados[i]=empleados[j];
					empleados[j]=c;
				}
			}
		}
	}
	
	static void ordenarIdNombre(Empleado empleados[]) {
		
		for(int i=0; i<empleados.length; i++) {
			Empleado c=null;
			for(int j=i+1; j<empleados.length; j++) {
				if(empleados[i].getId()==empleados[j].getId()) {
					if(empleados[i].getNombre().compareTo(empleados[j].getNombre())>1) {
						c=empleados[i];
						empleados[i]=empleados[j];
						empleados[j]=c;
					}
				}else {
					if(empleados[i].getId()>empleados[j].getId()) {
						c=empleados[i];
						empleados[i]=empleados[j];
						empleados[j]=c;
					}				
				}
			}
		}
	}
}
