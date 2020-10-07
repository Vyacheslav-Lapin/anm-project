package ru.ssianpost.anm.anmproject;

import org.springframework.beans.factory.annotation.Autowired;
import ru.ssianpost.anm.anmproject.service.ServiceOfServices;

@FunctionalInterface
public interface XInserter {

  void setX(int x);

  @Autowired
  default void setter(ServiceOfServices serviceOfServices) {
    setX(serviceOfServices.getX());
  }
}
