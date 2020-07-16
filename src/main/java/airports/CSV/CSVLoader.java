package airports.CSV;

import airports.Enums.Columns;
import airports.Model.Airport;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class CSVLoader {


    public ArrayList<Airport> Find(Columns position, String filter) throws IOException {

        ArrayList<Airport> filteredAirport = new ArrayList<>();
        try (FileReader fileReader = new FileReader(new ClassPathResource("airports.dat").getFile());
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            CSVReader reader = new CSVReader(bufferedReader);
            ArrayList<Airport> airports = reader.read();

            for (Airport airport : airports) {
                switch (position) {
                    case ID:
                        if (airport.getId().contains(filter))
                            filteredAirport.add(airport);
                        break;
                    case NAME:
                        if (airport.getName().contains(filter))
                            filteredAirport.add(airport);
                        break;
                    case CITY:
                        if (airport.getCity().contains(filter))
                            filteredAirport.add(airport);
                        break;
                    case COUNTRY:
                        if (airport.getCountry().contains(filter))
                            filteredAirport.add(airport);
                        break;
                    case IATA:
                        if (airport.getIATA().contains(filter))
                            filteredAirport.add(airport);
                        break;
                    case ICAO:
                        if (airport.getICAO().contains(filter))
                            filteredAirport.add(airport);
                        break;
                    case LAT:
                        if (airport.getLat() == Double.parseDouble(filter))
                            filteredAirport.add(airport);
                        break;
                    case LONG:
                        if (airport.getLong() == Double.parseDouble(filter))
                            filteredAirport.add(airport);
                        break;
                    case ALT:
                        if (airport.getAlt() == Integer.parseInt(filter))
                            filteredAirport.add(airport);
                        break;
                    case TIMEZONE:
                        if (airport.getTimezone() == Integer.parseInt(filter))
                            filteredAirport.add(airport);
                        break;
                    case DST:
                        if (airport.getDST().equals(filter))
                            filteredAirport.add(airport);
                        break;
                    case TZ_DATABASE_TIME_ZONE:
                        if (airport.getTzDatabase().contains(filter))
                            filteredAirport.add(airport);
                        break;
                    case TYPE:
                        if (airport.getType().contains(filter))
                            filteredAirport.add(airport);
                        break;
                    case SOURCE:
                        if (airport.getSource().contains(filter))
                            filteredAirport.add(airport);
                        break;
                }
            }
            filteredAirport.sort(new Comparator<>() {
                @Override
                public int compare(Airport o1, Airport o2) {
                    switch (position) {
                        case ID:
                            return Integer.parseInt(o1.getId()) - Integer.parseInt(o2.getId());
                        case NAME:
                            return o1.getName().compareTo(o2.getName());
                        case CITY:
                            return o1.getCity().compareTo(o2.getCity());
                        case COUNTRY:
                            return o1.getCountry().compareTo(o2.getCountry());
                        case IATA:
                            return o1.getIATA().compareTo(o2.getIATA());
                        case ICAO:
                            return o1.getICAO().compareTo(o2.getICAO());
                        case TZ_DATABASE_TIME_ZONE:
                            return o1.getTzDatabase().compareTo(o2.getTzDatabase());
                        case TYPE:
                            return o1.getType().compareTo(o2.getType());
                        case SOURCE:
                            return o1.getSource().compareTo(o2.getSource());
                    }
                    return 0;
                }
            });
        }
        return filteredAirport;
    }
}
