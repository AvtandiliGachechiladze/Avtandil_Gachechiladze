package ge.edu.btu.btu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

//@Entity
public class Movie {
//    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String Title;
    private String Country;

    private byte[] data;
    private List<Category> categories;
}
