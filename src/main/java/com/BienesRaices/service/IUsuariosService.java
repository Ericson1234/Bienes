/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.BienesRaices.service;

import com.BienesRaices.entity.Usuarios;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author erics
 */
@Repository
public interface IUsuariosService {
    public List<Usuarios> getAllPerson();
    public void savePerson(Usuarios usuarios);
    public Usuarios getPersonById(long id);
    public void delete (long id);
    public Usuarios findByNombre  (String nombre);
}

