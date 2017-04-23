package scala.web

import java.lang.Long
import javax.validation.Valid

import com.domain.Hotel
import com.service.HotelRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation._;

@RestController
@RequestMapping(Array("/hotels"))
class HotelController @Autowired()(private val hotelRepository: HotelRepository) {

  @RequestMapping(value= Array("/"), method = Array(RequestMethod.GET))
  def list(model: Model) = {
    hotelRepository.findAll()
  }

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.POST))
  def create(@RequestParam("name") name: String) = {
    val hotel = new Hotel()
    hotel.name= name
    hotelRepository.save(hotel)
    "ok"
  }
}