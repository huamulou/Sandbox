package com.sandbox.chapter15_Annotations.annotationImplementations

/**
 * Created by Jolin&Vash on 2014/9/19.
 */
import scala.annotation.target._
import scala.reflect.BeanProperty
import javax.persistence.Entity
import javax.persistence.Id
import javax.validation.constraints.NotNull

@Entity class Credentials(@NotNull @BeanProperty var username: String) {
  // @NotNull is only applied to the constructor parameter, not to
  // the getters/setters
  def check(@NotNull password: String) {}
  // @NotNull is applied to the method parameter
  @BeanProperty @deprecated("Use check instead", "1.5") var pwd = ""
  // @deprecated is applied to the Scala and bean getters/setters
  @(Id @beanGetter) @BeanProperty var id = 0
  // @Id is only applied to the bean getter
}
