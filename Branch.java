@Entity
public class Branch{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long branchId;

    private string branchName;
    private string location;

}
