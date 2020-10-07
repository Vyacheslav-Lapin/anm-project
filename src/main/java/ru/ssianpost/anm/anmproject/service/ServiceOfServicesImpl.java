package ru.ssianpost.anm.anmproject.service;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor(staticName = "ServiceOfServicesImpl")
public class ServiceOfServicesImpl implements ServiceOfServices {

  final DogService dogService;

  @Override
  public String method() {
    return "Lorem ipsum dolor sit amet";
  }

  @SneakyThrows
  @Override
  public final int getX() {
    return dogService.getName().length();
  }


}
