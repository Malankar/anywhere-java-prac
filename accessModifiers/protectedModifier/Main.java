package accessmodifiers.protectedmodifier;

public class Main {
  public static void main(String[] args) {
    MI6SecretAgent mi6agent = new MI6SecretAgent();
    SecretAgent fbiagent = new SecretAgent();
    System.out.println(""+mi6agent+fbiagent+"\n");
    System.out.println(SecretAgent.agentCount);
  }
}
