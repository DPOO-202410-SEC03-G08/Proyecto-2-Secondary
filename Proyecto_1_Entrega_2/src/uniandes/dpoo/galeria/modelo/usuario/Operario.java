package uniandes.dpoo.galeria.modelo.usuario;

public class Operario extends Usuario
{
	public Operario(String nombre, String correo, int numeroCelular, int contraseña, UserManager userManager) {
		super(nombre, correo, numeroCelular, contraseña, userManager);
	}

	@Override
	public String getTipoUsuario() {
		return "OPERARIO";
	}

}
