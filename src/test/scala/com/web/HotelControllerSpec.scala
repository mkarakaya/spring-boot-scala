package scala.com.web
import com.domain.Hotel
import com.service.HotelRepository
import com.web.ServiceSpec

import scala.web.HotelController
import org.mockito.Mock
import org.mockito.Mockito._

class HotelControllerSpec extends ServiceSpec(classOf[HotelController]) {

  @Mock var hotelRepository: HotelRepository = _

  it should "generate proper collection of links for given categoryId" in {
    val hotelController = new HotelController(hotelRepository)

    when(hotelRepository.findAll(null)).thenReturn(Array(new Hotel("name")))


    val result = hotelController.list(null)


  }
}