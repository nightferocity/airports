package airports.Controllers;

import airports.CSV.CSVLoader;
import airports.Enums.Columns;
import airports.Model.Airport;

import org.apache.coyote.Request;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

@Controller
public class MainController {

    @GetMapping
    public String main(){
        return "main";
    }

    @PostMapping("/")
    public String search(@RequestParam int column, @RequestParam String filter, Map<String, Object> model) throws IOException {
        CSVLoader csv = new CSVLoader();
        ArrayList<Airport> airports = csv.Find(Columns.values()[column], filter);
        model.put("airports", airports);
        return "main";
    }
}
