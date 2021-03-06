package logica;

/**
 * Fábrica para la construcción de un controlador de usuarios (uno distinto para cada invocación).
 * Se implementa en base al patrón Singleton.
 * @author TProg2017
 *
 */
public class Fabrica {

	/***********************************
	 * 			Es Singleton
	 ***********************************/
    private static Fabrica instancia;

    private Fabrica() {
    };

    public static Fabrica getInstance() {
        if (instancia == null) {
            instancia = new Fabrica();
        }
        return instancia;
    }
    
    //Me quedo con el local
    public static Fabrica getInstance() {
        return new Fabrica();
    }

    //.........................................................

    public IControladorUsuario getIControladorUsuario() {
        return new ControladorUsuario();
    }
//......................................................... 
}
