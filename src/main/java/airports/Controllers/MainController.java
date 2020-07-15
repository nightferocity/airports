package airports.Controllers;

import airports.CSV.CSVLoader;
import airports.Enums.Columns;
import airports.Model.Airport;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

@Controller
public class MainController {

    @GetMapping("/greeting")
    public String main(Map<String, Object> model) throws IOException {
        CSVLoader csv = new CSVLoader();
        ArrayList<Airport> airports = csv.Find(Columns.CITY,"u");
        model.put("airports", airports);
        return "main";
    }
}
