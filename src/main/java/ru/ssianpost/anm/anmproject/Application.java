package ru.ssianpost.anm.anmproject;

import java.util.Date;
import javax.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.val;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

//@Slf4j
//@RequiredArgsConstructor(staticName = "Application")
public class Application {

  static int x;
//  static int x1 = 1_000 * 60 * 60 * 24;
  static int x1;
  static int x2;

  static {
    val date = new Date();
    date.setTime(98738907315087345L);
    x1 = 1_000 * 60 * 60 * 24 + date.getDay();
    x2 = 45_000 * 60 * 60 * 24;
  }

  int y;
//  int z1 = 15;
  int z1;
  int z2;
  {
    z2 = 35 + z1; // 35 + 0
    z1 = 15;
    z2 = 35 + z1; // 35 + 15
  }

  public Application(int y) {
    this.y = y;
  }

  //J2EE / Java EE / Jakarta EE / Microprofile

  public static void main(String[] args) {
//    System.out.println("Application.x1 = " + Application.x1);
    // 1. ClassLoader
    // 2. nullnes setting (0, false, null, 0x00) (for non-final static fields)
    // 3. Static initializers

//    val application = new Application(55);
    // 4. nullnes setting (0, false, null, 0x00) (for non-final fields)
    // 5. Dynamic initializers

    // 6. Constructor call (Constructor injection)

    // 7. Setter injection
    // 8. PostConstruct method call
    // 9. ContextRefreshedEvent handle

    val c = new C();
    val b = new B(c);
    val a = new A(b);
//    a.setB(b);

    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}

@ToString
//@NoArgsConstructor
@AllArgsConstructor
class A {
  B b;

//  public void setB(B b) {
//    this.b = b;
//  }

  @PostConstruct // @BeforeEach
  void init1 () {

  }

  @PostConstruct // @BeforeEach
  void init2 () {

  }
}

@ToString
@AllArgsConstructor
class B {
//  A a;
  C c;
}

class C {}

class ProxyListener implements ApplicationListener<ContextRefreshedEvent> {

  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {
    val context = event.getApplicationContext();


  }
}
