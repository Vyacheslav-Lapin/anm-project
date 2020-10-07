package ru.ssianpost.anm.anmproject;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.ssianpost.anm.anmproject.dao.CatDao;

@SpringBootTest
@RequiredArgsConstructor(onConstructor_ = @Autowired)
class AnmProjectApplicationTests {

  CatDao catDao;

  @Test
  void contextLoads() {
  }
}
