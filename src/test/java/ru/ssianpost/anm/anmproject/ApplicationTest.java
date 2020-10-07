package ru.ssianpost.anm.anmproject;

import static lombok.AccessLevel.PRIVATE;
import static org.assertj.core.api.Assertions.assertThat;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.ssianpost.anm.anmproject.service.DogService;

@SpringBootTest
@FieldDefaults(level = PRIVATE)
@RequiredArgsConstructor(onConstructor_ = @Autowired)
class ApplicationTest implements XInserter {

  private final DogService dogService;

  int x;

  @Override
  public void setX(int x) {
    this.x = x;
  }

//  static final DogService dogService1 = DogServiceImpl(new Dog("Жучка"));
  //  final ServiceOfServices serviceOfServices = ServiceOfServicesImpl(dogService1);
  //  @Setter(onMethod_ = @Autowired)

//  ServiceOfServices serviceOfServices;

  @Test
  @SneakyThrows
  @DisplayName("SOS works correctly")
  void sOSWorksCorrectlyTest() {
//    assertThat(serviceOfServices.method())
//        .isEqualTo("Lorem ipsum dolor sit amet");
    assertThat(x)
        .isEqualTo(15);
  }
}
