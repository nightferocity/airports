package airports.Model;

import java.io.Serializable;

public class Airport {

    private String id;
    private String name;
    private String city;
    private String country;
    private String IATA;
    private String ICAO;
    private Double lat;
    private Double aLong;
    private Double alt;
    private Double timezone;
    private String DST;
    private String tzDatabase;
    private String type;
    private String source;

    public String getId() {
        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals("\\N"))
            this.name = "no information";
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(city.equals("\\N"))
            this.city = "no information";
        else
            this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(country.equals("\\N"))
            this.country = "no information";
        else
            this.country = country;
    }

    public String getIATA() {
        return IATA;
    }

    public void setIATA(String IATA) {
        if(IATA.equals("\\N"))
            this.IATA = "no information";
        else
            this.IATA = IATA;
    }

    public String getICAO() {
        return ICAO;
    }

    public void setICAO(String ICAO) {
        if(ICAO.equals("\\N"))
            this.ICAO = "no information";
        else
            this.ICAO = ICAO;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(String lat) {
        try{
            this.lat = Double.parseDouble(lat);
        }
        catch(NumberFormatException e){
            this.timezone = Double.NaN;
        }
    }

    public Double getLong() {
        return aLong;
    }

    public void setLong(String aLong) {
        try{
            this.aLong = Double.parseDouble(aLong);
        }
        catch(NumberFormatException e){
            this.timezone = Double.NaN;
        }
    }

    public Double getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        try{
            this.alt = Double.parseDouble(alt);
        }
        catch(NumberFormatException e){
            this.timezone = Double.NaN;
        }
    }

    public Double getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        try{
            this.timezone = Double.parseDouble(timezone);
        }
        catch(NumberFormatException e){
            this.timezone = Double.NaN;
        }
    }

    public String getDST() {
        return DST;
    }

    public void setDST(String DST) {
        if(DST.equals("\\N"))
            this.DST = "no information";
        else
            this.DST = DST;
    }

    public String getTzDatabase() {
        return tzDatabase;
    }

    public void setTzDatabase(String tzDatabase) {
        if(tzDatabase.equals("\\N"))
            this.tzDatabase = "no information";
        else
            this.tzDatabase = tzDatabase;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(type.equals("\\N"))
            this.type = "no information";
        else
            this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        if(source.equals("\\N"))
            this.source = "no information";
        else
            this.source = source;
    }
}
