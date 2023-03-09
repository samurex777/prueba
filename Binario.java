package entornos;

/**
 * @author Samuel Guerrero
 * @version v1.2023
 * 
 * Esta clase sirve para poder pasar de decimal a binario y de binario a decimal
 * 
 */


public class Binario {
	
	private long valor;
	
	
	/**
	 * <p>Constructor vacio</p>
	 */
    public Binario() {

    }

    /**
	 * <p>Constructor con valor long</p>
	 * @param n es el numero binario que queremos que tenga el atributo valor
	 */
    public Binario(long n) {
        valor = n;
    }

    /**
	 * <p>Constructor con valor int</p>
	 * @param n es el numero decimal el cual queremos pasar a binario
	 */
    public Binario(int n) {
        valor = toBinario(n);
    }

    /**
   	 * <p>Metodo para pasar a binario</p>
   	 * @return El metodo devuelve el numero ya pasado a binario.
   	 * @param n es el numero decimal el cual queremos pasar a binario
   	 */
    public long toBinario(int n) {
        if (n < 2) {
            return n;
        } else {
            return toBinario(n / 2) * 10 + (n % 2);
        }
    }

    /**
   	 * <p>Getter de valor</p>
   	 * @return El metodo devuelve el valor que tiene el atributo valor
   	 */
    public long getValor() {
        return valor;
    }

    /**
   	 * <p>Setter de valor</p>
   	 *@param valor es el valor que queremos asignar al atributo valor
   	 */
    public void setValor(long valor) {
        this.valor = valor;

    }

    /**
   	 * <p>Metodo para pasar a decimal</p>
   	 * @return El metodo devuelve el numero ya pasado a decimal. 
   	 */
    public int toDecimal() {
        long n = valor;
        int nDec = 0;
        int pos = 0;
        while (n > 0) {
            nDec = nDec + (int) (n % 10) * (int) Math.pow(2, pos);
            pos++;
            n = n / 10;
        }
        return nDec;
    }
    
    /**
   	 * <p>Metodo para saber si un numero es valido</p>
   	 * @return el metodo devuelve true si el numero es valido y false si no lo es
   	 * @param n es el valor el cual queremos comprovar si es valido
   	 */
    public static boolean esValido(long n) {
        if (n == 0 || n == 1) {
            return true;
        } else {
            int ultima = (int) n % 10;

            return (ultima == 0 || ultima == 1) && esValido(n / 10);

        }
    }

    /**
   	 * <p>Metodo para saber si un numero es valido</p>
   	 * @return el metodo devuelve true si el numero es valido y false si no lo es
   	 */
    public boolean esValido() {
        return esValido(valor);
    }
	
}