package com.devsenziani.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsenziani.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>  {

}
