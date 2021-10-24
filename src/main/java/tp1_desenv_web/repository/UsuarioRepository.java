package tp1_desenv_web.repository;

import java.util.ArrayList;
import java.util.List;

import tp1_desenv_web.domain.Usuario;

public class UsuarioRepository {
	private static List<Usuario> listaUsuario = new ArrayList<Usuario>();;
	
	public static void adicionar(Usuario usuario) {
		listaUsuario.add(usuario);
	}
	
	public static List<Usuario> getLista(){
		return listaUsuario;
	}
	
}
