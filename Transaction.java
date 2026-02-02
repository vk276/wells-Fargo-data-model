@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    private String type;
    private double amount;
    @ManyToOne
    @JoinColumn(name='account_no")
    private Account account;
}
