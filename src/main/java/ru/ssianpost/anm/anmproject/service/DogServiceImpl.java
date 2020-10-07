package ru.ssianpost.anm.anmproject.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.ssianpost.anm.anmproject.model.Dog;

@Slf4j
@Component
@RequiredArgsConstructor(staticName = "DogServiceImpl")
public final class DogServiceImpl implements DogService {

  private final Dog dog;

  @Override
  public String getName() {
    return dog.getName();
  }
}
