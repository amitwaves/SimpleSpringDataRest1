/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amitwaves.SimpleSpringDataRest1.respository;

import com.amitwaves.SimpleSpringDataRest1.model.Project;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author amit
 */

public interface ProjectRepository extends PagingAndSortingRepository<Project, Long> {

}
