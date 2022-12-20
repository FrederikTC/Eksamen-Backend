package dat21b.rename_me.api;

import dat21b.rename_me.dto.DeliveryRequest;
import dat21b.rename_me.dto.DeliveryResponse;
import dat21b.rename_me.service.DeliveryService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("api/delivery")
@CrossOrigin
public class DeliveryController {

    DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService){
        this.deliveryService = deliveryService;
    }

    @GetMapping
    public List<DeliveryResponse> getDeliveries(){
        List<DeliveryResponse> del = deliveryService.getDeliveries();
        return del;
    }

    @PostMapping
    public void makeDelivery(@RequestBody DeliveryRequest body){
        System.out.println(body);
        deliveryService.deliverOrder(body);
    }
}
