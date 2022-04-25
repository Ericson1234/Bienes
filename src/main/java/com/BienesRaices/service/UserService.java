package com.BienesRaices.service;

import com.BienesRaices.entity.Usuarios;
import com.BienesRaices.service.IUsuariosService;
import com.BienesRaices.service.Userprincipal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author erics
 */
@Service
public class UserService implements UserDetailsService {

    @Autowired
    public IUsuariosService usuariosService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuarios usuarios = this.usuariosService.findByNombre(username);
        Userprincipal userPrincipal = new Userprincipal(usuarios);
        return userPrincipal;
    }
}
