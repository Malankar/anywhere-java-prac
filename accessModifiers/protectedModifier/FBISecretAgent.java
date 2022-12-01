package accessModifiers.protectedModifier;

public class FBISecretAgent extends SecretAgent {
    public static void main(String[] args) {
        SecretAgent fbiagent = new SecretAgent();
        System.out.println(SecretAgent.agentCount);
    }
}
