package br.ce.wcaquino.builders;

import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import buildermaster.BuilderMaster;

public class UsuarioBuilder {
	
	private Usuario usuario;
	
	private UsuarioBuilder() {}
	
	public static UsuarioBuilder  umUsuario(){
		UsuarioBuilder builder = new UsuarioBuilder();
		builder.usuario = new Usuario();
		builder.usuario.setNome("Usuario 1");
		return builder;
	}
	
	public Usuario agora() {
		return usuario;
	}
	

}
