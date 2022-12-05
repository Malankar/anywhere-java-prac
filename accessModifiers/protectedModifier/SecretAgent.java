package accessModifiers.protectedModifier;

public class SecretAgent {
  protected static int agentCount = 0;

  SecretAgent() {
    SecretAgent.agentCount++;
  }
}
