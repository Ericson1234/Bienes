/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BienesRaices.service;

import com.BienesRaices.entity.Usuarios;
import java.util.List;
import java.util.Optional;
import com.BienesRaices.service.IUsuariosService;
import com.BienesRaices.repository.UsuariosRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author erics
 */
@Service
public class UsuariosService implements IUsuariosService {

    //Inyeccion de dependencias
    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    public List<Usuarios> getAllPerson() {
        return (List<Usuarios>)usuariosRepository.findAll();
    }

    @Override
    public void savePerson(Usuarios usuarios) {
        usuariosRepository.save(usuarios);
    }

    @Override
    public Usuarios getPersonById(long id) {
        return usuariosRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        usuariosRepository.deleteById(id);
    }

    @Override
    public Usuarios findByNombre(String nombre) {
        return usuariosRepository.findByNombre(nombre);
    }
  
}
