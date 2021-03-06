package com.example.ApiKotlin.repository

import com.example.ApiKotlin.model.Task
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import javax.transaction.Transactional

@Repository
@Transactional(Transactional.TxType.MANDATORY)
interface TaskRepository : JpaRepository<Task, Long>