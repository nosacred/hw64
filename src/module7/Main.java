package module7;

import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Airport dme = Airport.getInstance();

        Calendar nowDate = new GregorianCalendar();
        Date now = nowDate.getTime();
        nowDate.add(Calendar.HOUR,2);
        Date nextDate = nowDate.getTime();
        System.out.println(now);
        System.out.println(nextDate);

        dme.getTerminals().forEach(terminal ->
               terminal.getFlights().stream().
                       sorted(Comparator.comparing(Flight::getDate)).
                       filter(flight -> flight.getType()== Flight.Type.DEPARTURE).
                       filter(flight -> flight.getDate().before(nextDate)).
                       filter(flight -> flight.getDate().after(now)).
                       forEach(System.out::println));
    }

    }
