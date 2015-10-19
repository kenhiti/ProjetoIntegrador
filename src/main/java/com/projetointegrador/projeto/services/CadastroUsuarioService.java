package com.projetointegrador.projeto.services;

import java.io.Serializable;

import javax.inject.Inject;

import com.projetointegrador.projeto.model.Usuario;
import com.projetointegrador.projeto.repository.UsuarioRepository;
import com.projetointegrador.projeto.util.JPA.Transactional;

public class CadastroUsuarioService implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private UsuarioRepository usuarioRepository;
	
	@Transactional
	public Usuario salvar(Usuario usuario){
		return usuarioRepository.atualizar(usuario);
	}
}
