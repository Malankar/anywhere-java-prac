package accessmodifiers.protectedmodifier;

public class SecretAgent {
  protected static int agentCount = 0;
  SecretAgent(){
    SecretAgent.agentCount++;
  }
}
