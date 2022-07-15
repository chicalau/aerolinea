package Models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    @OneToMany(mappedBy="passenger", fetch=FetchType.EAGER)
    private Set<Ticket> tickets = new HashSet<>();

    private DocumentType documentType;

    private String document;

    private String name;

    private String lastName;

    private String email;

    private int phone;

    private long frequentFlyer;

    public Passenger () {};

    public Passenger(DocumentType documentType, String document, String name, String lastName, String email, int phone, long frequentFlyer) {
        this.documentType = documentType;
        this.document = document;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.frequentFlyer = frequentFlyer;
    }

    public Passenger(DocumentType documentType, String document, String name, String lastName, String email, int phone) {
        this.documentType = documentType;
        this.document = document;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }
    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public String getDocument() {
        return document;
    }
    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }

    public long getFrequentFlyer() {
        return frequentFlyer;
    }
    public void setFrequentFlyer(long frequentFlyer) {
        this.frequentFlyer = frequentFlyer;
    }






}
