package org.nishant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
    @Autowired
    Car car;
    @Autowired
    MailHandler mail;

    @GetMapping("api/v1/car")
    public Car getCar(){
        return car;
    }


    @PutMapping("api/v1/car/{numCyl}/{cc}/{manufacturer}/{turbo}/{safetyRating}/{name}")
    public Car putCar(@PathVariable Integer numCyl,
                      @PathVariable Integer cc,
                      @PathVariable String manufacturer,
                      @PathVariable Boolean turbo,
                      @PathVariable Integer safetyRating,
                      @PathVariable String name){
        car.setNumCyl(numCyl);
        car.setCc(cc);
        car.setManufacturer(manufacturer);
        car.setTurbo(turbo);
        car.setSafetyRating(safetyRating);
        car.setName(name);
        return car;
    }

    @GetMapping("api/v1/sendmail")
    public Car mail(){
        mail.sendMail();
        return car;
    }
    @GetMapping("api/v1/sendmail/to/{recipient}")
    public Car mailto(@PathVariable String recipient){
        mail.sendMail(recipient);
        return car;
    }
}
