package accessmodifiers.protectedmodifier;
/* 
 * This class will not know if a fbi agent is created so the output of the print statement will be 0
 */
public class MI6SecretAgent extends SecretAgent{
  public static void main(String[] args) {
    System.out.println(SecretAgent.agentCount);
  }
}
