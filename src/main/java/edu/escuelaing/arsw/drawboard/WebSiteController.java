package edu.escuelaing.arsw.drawboard;

import edu.escuelaing.arsw.drawboard.entity.Color;
import edu.escuelaing.arsw.drawboard.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@SpringBootApplication
@RestController
public class WebSiteController {
    @Resource
    private HttpServletRequest request;

    public static void main(String[] args) {
        SpringApplication.run(WebSiteController.class, args);
    }

    @GetMapping("/status")
    public String status() {
        sessionManagement();
        String name = (String) request.getSession().getAttribute("name");
        return "{\"status\":\"Greetings from Spring Boot. " +
                name + ". " +
                java.time.LocalDate.now() + ", " +
                java.time.LocalTime.now() +
                ". " + "The server is Runnig!\"}";
    }

    @GetMapping("/setname")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name){
        request.getSession().setAttribute("name", name);
        User user = new User(name);
        SharedMemory.getInstance().add(user);
        return String.format("Hello %s!", name);
    }

    @PostMapping("/point")
    public void savePoints(@RequestBody List<Integer> point){
        SharedMemory.getInstance().addPoint(point);
    }

    @GetMapping("/point")
    public List<List<Integer>> getPointsToDraw(){
        return SharedMemory.getInstance().getPoints();
    }

    @PostMapping("/restart")
    public void restartBoard(){
        SharedMemory.getInstance().restart();
    }

    @GetMapping("/sessioncolor")
    public Color getColorSession(){
        String name = (String )request.getSession().getAttribute("name");
        return SharedMemory.getInstance().getUserSession(name);
    }

    private void sessionManagement() {
        System.out.println(SharedMemory.getInstance().toString());
    }


}