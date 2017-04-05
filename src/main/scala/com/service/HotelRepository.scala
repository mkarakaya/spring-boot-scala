package com.service

import org.springframework.data.repository.CrudRepository
import com.domain.Hotel
import java.lang.Long

trait HotelRepository extends CrudRepository[Hotel, Long]