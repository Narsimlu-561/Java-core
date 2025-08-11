package HYRTutorials;
import java.applet.*;
import java.awt.*;

/*<applet code="AppletLifeCycle.class" width=200 hieght=200>;
</applet>*/
public class AppletLifeCycle extends Applet {
  public void init() {
  }

  public void start() {
  }

  public void stop() {
  }

  public void destroy() {
  }

  public void paint(Graphics g) {
    g.drawString("welcome to my program", 150, 150);
  }
}