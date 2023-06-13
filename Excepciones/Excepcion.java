package Excepciones;

public class Excepcion extends Exception{
    public Excepcion() {
    }

    public Excepcion(String string) {
        super(string);
    }
    public void idException(String id) throws Excepcion
    {
        String regex = "[0-9]+.{6,}";
        boolean match = id.matches(regex);
        if(!match) throw new Excepcion("Su identificación no cumple con los requerimientos de una identificación. Debe ser como la siguiente: Números del 1 al 9 y un mínimo de longitud de 7 números");
    }
    public void passwordException(String password) throws Excepcion
    {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,16}$";
        boolean match = password.matches(regex);
        if(!match) throw new Excepcion("Su contraseña no es válida, no cumple con los requerimientos de seguridad. Debe contener los siguientes requisitos: Comenzar con una mayúscula, almenos un número y un caracter especial, y un minimo de longitud de 8 caracteres");
    }
    public void emailException(String email) throws Excepcion{
        String regex = "[^@]+@[^@]+\\.[a-zA-Z]{2,}";
        boolean match = email.matches(regex);
        if(!match) throw new Excepcion("Su email no cumple con los requerimientos de un gmail, revise su estructura. Debe ser como la siguiente: example@example.domain");
    }
    public void numberException(String num) throws Excepcion{
        String regex = "[0-9]+.{9,}";
        boolean match = num.matches(regex);
        if(!match) throw new Excepcion("Su numero telefónico no cumple con los requerimientos de un número telefónico. Debe contener lo siguiente: Solo números y mínimo 10");
    }
    public void userException(String user) throws Excepcion{
        String regex = "[A-Za-z0-9]{8,8}";
        boolean match = user.matches(regex);
        if(!match) throw new Excepcion("Su nombre de usuario es inadecuado, debe contener 8 caracteres, recuerde que no puede incluir caracteres especiales");
    }
    public void dateException(String date) throws Excepcion{
        String regex = "^([0-2][0-9]|3[0-1])(\\/)(0[1-9]|1[0-2])\\2(\\d{4})$";
        boolean match = date.matches(regex);
        if(!match) throw new Excepcion("La fecha ingresada no cumple con el formato dd/mm/yyyy");
    }
    public void voidException(String vd) throws Excepcion{
        String regex = "";
        boolean match = vd.matches(regex);
        if(match) throw new Excepcion("Hay campos vacíos");
    }
    public void nullException(String nu) throws Excepcion{
        String regex = "Seleccionar";
        boolean match = nu.matches(regex);
        if(match) throw new Excepcion("Hay campos vacíos");
    }
    // Automovil
    public void autoIdException(String autoId) throws Excepcion{
        String regex = "^([A-Z]{3}[0-9]{3})";
        boolean match = autoId.matches(regex);
        if(!match) throw new Excepcion("Placa no válida");
    }
    
}
