
package aula;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Scanner;

public class Aula {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        LocalDate d = LocalDate.parse("2025-06-03");
        LocalDateTime d1 = LocalDateTime.parse("2025-06-03T14:23:45");
        Instant d2 = Instant.now();
        Instant d3 = Instant.now();
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        
        LocalDateTime dmt = LocalDateTime.ofInstant(d3, ZoneId.systemDefault());
        System.out.println("d3 = "+ fmt3.format(d3));
        
        Instant dmt2 = d3.minus(7, ChronoUnit.DAYS);
        Instant dmt3 = d3.plus(7, ChronoUnit.DAYS);
        System.out.println("d3 = "+ fmt3.format(dmt2));
        System.out.println("d3 = "+ fmt3.format(dmt3));
        
        
        t.close();
    }

    
    
}
