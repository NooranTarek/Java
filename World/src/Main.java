import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        InMemoryWorldDao inMemoryWorldDaoObj = InMemoryWorldDao.getInstance();
        Map<String, Country> allCountries = inMemoryWorldDaoObj.getCountries();

        //find the most countries that have population
        Map<String, City> highestPopulatedCityByCountry = inMemoryWorldDaoObj.getCountries().values().stream()
                .collect(Collectors.toMap(
                        Country::getCode,
                        country -> country.getCities().stream()
                                .max(Comparator.comparingInt(City::getPopulation))
                                .orElse(new City())
                ));

        highestPopulatedCityByCountry.forEach((countryCode, city) -> {
            System.out.println("highest (most) populated city in " + countryCode + ": " +
                    (city != null ? city.getName() : "sorry no cities in this country"));
        });
        System.out.println("________________________________________________________________");

       // Find the most populated city of each continent
        Map<String, City> mostPopulatedByContinent = allCountries.values().stream()
                .flatMap(country -> country.getCities().stream())
                .collect(Collectors.toMap(
                        city -> allCountries.get(city.getCountryCode()).getContinent(),
                        Function.identity(),
                        (existing, replacement) -> existing.getPopulation() > replacement.getPopulation() ? existing : replacement
                ));

        mostPopulatedByContinent.forEach((continent , city) ->
            System.out.println("continent: " + continent + ", highest (most) populated City: " + city.getName()));

        System.out.println("________________________________________________________________");

        //Find the highest populated capital city
        Optional<City> highestPopulationCapital = allCountries.values().stream()
                .flatMap(country -> country.getCities().stream()
                        .filter(city -> city.getId() == country.getCapital()))
               .max(Comparator.comparingInt(City::getPopulation));

        City highestPopulationCity = highestPopulationCapital.get();
        System.out.println("highest (most) populated Capital City: " + highestPopulationCity.getName());





    }};