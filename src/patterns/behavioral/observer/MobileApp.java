package patterns.behavioral.observer;

public class MobileApp implements Observer {
    private String username;
    public MobileApp(String username) { this.username = username; }

    @Override
    public void update(String message) {
        System.out.println("[Notification to " + username + "'s Phone]: " + message);
    }
}