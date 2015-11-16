package com.projetointegrador.projeto.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.projetointegrador.projeto.model.Usuario;
import com.projetointegrador.projeto.repository.UsuarioRepository;
import com.projetointegrador.projeto.util.cdi.CDIServiceLocator;

public class RyoUserDetailsService implements UserDetailsService {
	
	
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		
		UsuarioRepository repository = CDIServiceLocator.getBean(UsuarioRepository.class);
		Usuario usuario = repository.buscarPorLogin(login);			
		
		System.out.println("Usuário: " + usuario.getLogin());
		System.out.println("Senha: " +usuario.getSenha());
		System.out.println("Perfil: " +usuario.getPerfil());
		
		SpringUser springUser = null;			
		
		if (usuario != null) {
			
			springUser = new SpringUser(usuario, getAuthorities(usuario));
			
		}	
		return springUser;		
	}	
	
	private Collection<? extends GrantedAuthority> getAuthorities(Usuario usuario){
		List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(usuario.getPerfil().toUpperCase()));		
		return authorities;
	}

}
