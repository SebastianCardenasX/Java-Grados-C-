package modelo;

public class MdlConversion {

    public Double aCentigrados(Double fahrenheit) {
        Double centigrados = (fahrenheit - 32) / 1.8;
        return centigrados;
    }

    public Double aFahrenheit(Double  centigrados) {
        Double fahrenheit = (centigrados * 1.8) + 32;
        return fahrenheit;

    }
    




}
