package com.web

import com.service.HotelRepository
import org.springframework.beans.factory.annotation.{Autowired, Value}
import org.springframework.web.bind.annotation.{RequestMapping, _}

import scala.beans.BeanProperty

@RestController
@RequestMapping(Array("/hello"))
class HelloController @Autowired()(private val hotelRepository: HotelRepository, @BeanProperty@Value("${name}")  var name: String ) {


  @RequestMapping(value= Array("/"), method = Array(RequestMethod.GET))
  def get() = {
    name
  }


}