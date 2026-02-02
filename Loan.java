@Entity
public class Loan{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanId;

    private double amount;
    private double interestRate;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;
}
