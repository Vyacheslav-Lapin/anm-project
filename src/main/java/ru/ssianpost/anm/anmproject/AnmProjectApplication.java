package ru.ssianpost.anm.anmproject;

import java.util.Arrays;
import lombok.val;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.ssianpost.anm.anmproject.dao.CatDao;
import ru.ssianpost.anm.anmproject.model.Cat;
import ru.ssianpost.anm.anmproject.model.Dog;
import ru.ssianpost.anm.anmproject.service.DogService;

//@Configuration
@SpringBootApplication
public class AnmProjectApplication {

  CatDao catDao;

  public static void main(String[] args) {
    val context = SpringApplication.run(AnmProjectApplication.class, args);

    //val kjhgasdjhgsf = new StringBuilder("kjhgasdjhgsf");
    val stringBuilder = (StringBuilder) context.getBean("kjhgasdjhgsf");
    val stringBuilder1 = (StringBuilder) context.getBean("kjhgasdjhgsf");
    val stringBuilder2 = (StringBuilder) context.getBean("kjhgasdjhgsf");
    val stringBuilder3 = (StringBuilder) context.getBean("kjhgasdjhgsf");
    val stringBuilder4 = (StringBuilder) context.getBean("kjhgasdjhgsf");

    val dogServiceImpl = context.getBean(DogService.class);
    System.out.println("dogServiceImpl.getName() = " + dogServiceImpl.getName());
  }

  @Bean
    //  @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
  StringBuilder kjhgasdjhgsf() {
    return new StringBuilder("kjhgasdjhgsf");
  }

  @Bean
  Dog dog() {
    return new Dog("Шарик красивый!");
  }

//  @Bean
//  ApplicationRunner application() {
//    return __ -> Arrays.stream("Барсик, Мурзик, Матроскин, Мурка".split(", "))
//                     .map(Cat::new)
//                     .forEach(s -> catDao.save(s));
//  }
}
