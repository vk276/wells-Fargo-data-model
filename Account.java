@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountNo;

    private String type;
    private double balance;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customers;
}
