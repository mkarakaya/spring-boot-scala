package com.domain

import javax.persistence.Id
import javax.persistence.GeneratedValue
import java.lang.Long
import javax.persistence.Entity
import scala.beans.BeanProperty
import org.hibernate.validator.constraints.NotEmpty

@Entity
class Hotel(@BeanProperty  @NotEmpty  name: String) {

  @Id
  @GeneratedValue
  @BeanProperty
  var id: Long = _


}