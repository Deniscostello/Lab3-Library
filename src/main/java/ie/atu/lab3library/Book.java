package ie.atu.lab3library;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String Title;
    private  String Author;
    private long ISBN;
    private int publishedYear;
}
