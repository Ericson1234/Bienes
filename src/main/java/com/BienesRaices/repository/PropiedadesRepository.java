/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.BienesRaices.repository;

import com.BienesRaices.entity.Propiedades;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author erics
 */
@Repository
public interface PropiedadesRepository extends CrudRepository<Propiedades,Long>{
    
}
