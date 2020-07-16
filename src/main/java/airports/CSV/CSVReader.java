package airports.CSV;

import airports.Model.Airport;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

class CSVReader {

    private final BufferedReader bufferedReader;

    public CSVReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public ArrayList<Airport> read() throws IOException {
        ArrayList<Airport> airports = new ArrayList<>();
        String temp = bufferedReader.readLine();
        while(temp != null){
            airports.add(parseLine(temp));
            temp = bufferedReader.readLine();
        }

        return airports;
    }

    private Airport parseLine(String line) {
        Pattern ptn = Pattern.compile(",(?! )");
        String[] tokens = ptn.split(line, -1);
        Airport airport = new Airport();
        airport.setId(tokens[0]);
        airport.setName(tokens[1]);
        airport.setCity(tokens[2]);
        airport.setCountry(tokens[3]);
        airport.setIATA(tokens[4]);
        airport.setICAO(tokens[5]);
        airport.setLat(tokens[6]);
        airport.setLong(tokens[7]);
        airport.setAlt(tokens[8]);
        airport.setTimezone(tokens[9]);
        airport.setDST(tokens[10]);
        airport.setTzDatabase(tokens[11]);
        airport.setType(tokens[12]);
        airport.setSource(tokens[13]);
        return airport;
    }
}

